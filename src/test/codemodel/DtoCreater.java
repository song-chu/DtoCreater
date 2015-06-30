package test.codemodel;

import java.io.File;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sun.codemodel.JBlock;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JCommentPart;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JDocComment;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JVar;

public class DtoCreater {

	private Connection conn;
	private String schema;
	private String table;

	public DtoCreater(Connection conn, String schema, String table) {
		this.conn = conn;
		this.schema = schema;
		this.table = table;
	}

	public void execute(String schema, String tableName, String fullClassName) throws Exception {

		JCodeModel codeModel = new JCodeModel();

		//生成するクラス定義
		JDefinedClass clazz = codeModel._class(fullClassName);

		this.addClassComment(clazz, this.getTableComment(tableName) + "のDTO");

		JMethod constructor = clazz.constructor(JMod.PUBLIC);  //コンストラクタ
		this.addMethodDoc(constructor, "コンストラクタ");

		source(codeModel, clazz);

		//ソース生成
		codeModel.build(new File(Env.DIR_OUTPUT_SRC.value()));
	}

	private void setter(JCodeModel codeModel, JDefinedClass clazz, JFieldVar field, String fieldName, String remarks) {
		//setter
		JMethod setter = clazz.method(JMod.PUBLIC, codeModel.VOID, "set" + fieldName);
		JVar param = setter.param(field.type(), toFirstCharLower(fieldName));  //メソッド引数

		/* Addign java doc for method */
		addMethodDoc(setter, remarks + "設定", param);

		JBlock block2 = setter.body();
		block2.assign(JExpr._this().ref(field), param);  //ローカル変数からインスタンス変数へセット
	}

	private void getter(JDefinedClass clazz, JFieldVar field, String fieldName, String remarks) {
		//getter
		JMethod getter = clazz.method(JMod.PUBLIC, field.type(), "get" + fieldName);

		/* Addign java doc for method */
		JDocComment jDoc = addMethodDoc(getter, remarks + "取得");
		JCommentPart rtn = jDoc.addReturn();
		rtn.add(remarks);

		JBlock block = getter.body();
		block._return(field);
	}

	/**
	 * メソッドレベルのJavaDoc追加
	 * @param method	メソッド
	 * @param doc		コメント
	 * @param params	パラメータ
	 */
	private JDocComment addMethodDoc(JMethod method, String doc, JVar... params) {
		/* Addign java doc for method */
		JDocComment jDoc = method.javadoc();
		jDoc.add(doc);

		for (JVar param : params) {
			JCommentPart paramDoc = jDoc.addParam(param);
		}

		return jDoc;
	}

	private void setField(JDefinedClass clazz, String fieldName) throws Exception {
		//privateなインスタンス変数
		JFieldVar filed = clazz.field(JMod.PRIVATE, String.class, toFirstCharLower(fieldName));

	}

	private void source(JCodeModel codeModel, JDefinedClass clazz) throws SQLException, Exception {

		DatabaseMetaData dmd = conn.getMetaData();
		ResultSet rs = dmd.getColumns(null, schema.toUpperCase(), table, null);

		String productName = dmd.getDatabaseProductName();

		try {
			while (rs.next()) {
				String columnName = rs.getString("COLUMN_NAME");
				int dataType = rs.getInt("DATA_TYPE");
				int columnSize = rs.getInt("COLUMN_SIZE");
				int digits = rs.getInt("DECIMAL_DIGITS");
				String remarks = this.getColumnComment(table, columnName);

				String fieldName = toCamelCase(columnName);

				//privateなインスタンス変数
				JFieldVar field = this.field(codeModel, clazz, fieldName, dataType, columnSize, digits);
				field.javadoc().add(remarks);

				getter(clazz, field, fieldName, remarks);
				setter(codeModel, clazz, field, fieldName, remarks);
			}
		} finally {
			rs.close();
		}
	}

	private JFieldVar field(JCodeModel codeModel, JDefinedClass clazz, String fieldName, int dataType, int columnSize,
			int digits) {

		String fName = toFirstCharLower(fieldName);

		if (dataType == java.sql.Types.TIMESTAMP) {
			return clazz.field(JMod.PRIVATE, java.sql.Timestamp.class, fName);

		} else if (dataType == java.sql.Types.DECIMAL) {
			if (digits > 0) {
				return clazz.field(JMod.PRIVATE, codeModel.DOUBLE, fName);

			} else {
				if (columnSize < 5) {
					return clazz.field(JMod.PRIVATE, codeModel.INT, fName);
				} else {
					return clazz.field(JMod.PRIVATE, codeModel.LONG, fName);
				}
			}
		} else {
			return clazz.field(JMod.PRIVATE, String.class, fName);
		}
	}

	private void outputOtherTableKey(Connection conn, String srcTable, String srcColumn) throws Exception {

		PreparedStatement stmt = null;

		String sql = "SELECT A.TABLE_NAME, A.COLUMN_NAME"
				+ " FROM USER_CONS_COLUMNS A INNER JOIN USER_CONSTRAINTS B"
				+ "   ON (A.OWNER = B.OWNER AND A.CONSTRAINT_NAME = B.CONSTRAINT_NAME)"
				+ " WHERE CONSTRAINT_TYPE = 'P'"
				+ "   AND A.COLUMN_NAME = ?"
				+ "   AND A.TABLE_NAME LIKE '%MST'";

		try {
			stmt = conn.prepareStatement(sql);

			stmt.setString(1, srcColumn);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				String dstTable = rs.getString("TABLE_NAME");
				String dstColumn = rs.getString("COLUMN_NAME");
				System.out.println(toCsv(srcTable, srcColumn, dstTable, dstColumn));
			}

		} finally {
			if (stmt != null) {
				stmt.close();
			}
		}
	}

	private static String toCsv(String... strs) {
		StringBuilder sb = new StringBuilder();
		for (String str : strs) {
			if (sb.length() > 0) {
				sb.append(',');
			}
			sb.append(str);
		}

		return sb.toString();
	}

	private static String toCamelCase(String s) {
		String[] parts = s.split("_");
		String camelCaseString = "";
		for (String part : parts) {
			camelCaseString += toProperCase(part);
		}
		return camelCaseString;
	}

	private static String toFirstCharLower(String s) {
		if (s == null || s.length() < 1) {
			return s;
		}
		return s.substring(0, 1).toLowerCase() + s.substring(1);
	}

	private static String toFirstCharUpper(String s) {
		if (s == null || s.length() < 1) {
			return s;
		}
		return s.substring(0, 1).toUpperCase() + s.substring(1);
	}

	private static String toProperCase(String s) {
		return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
	}

	private void addClassComment(JDefinedClass clazz, String javaDoc) {
		/* Adding class level coment */
		JDocComment jDocComment = clazz.javadoc();
		jDocComment.add(javaDoc);
	}

	private String getTableComment(String tableName) throws Exception {
		String comment = "";
		PreparedStatement stmt = null;
		String sql = "SELECT COMMENTS FROM USER_TAB_COMMENTS WHERE TABLE_NAME = ?";

		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, tableName);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				comment = rs.getString("COMMENTS");
			}
		} finally {
			if (stmt != null) {
				stmt.close();
			}
		}

		return comment;
	}

	private String getColumnComment(String tableName, String columnName) throws Exception {
		String comment = "";
		PreparedStatement stmt = null;
		String sql = "SELECT COMMENTS FROM USER_COL_COMMENTS WHERE TABLE_NAME = ? AND COLUMN_NAME=?";

		try {
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, tableName);
			stmt.setString(2, columnName);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				comment = rs.getString("COMMENTS");
			}
		} finally {
			if (stmt != null) {
				stmt.close();
			}
		}

		return comment;
	}

}
