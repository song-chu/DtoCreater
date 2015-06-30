package test.codemodel;

import java.sql.Connection;

import org.apache.commons.dbutils.DbUtils;

/**
 *
 *
 */
public class TableColumn {

	public static void main(String[] args) {

		Connection conn = null;
		try {

			String schema = args[0];
			String table = args[1];
			String fullClassName = args[2];

			conn = DbConnection.getConnection();
			DtoCreater fks = new DtoCreater(conn, schema, table);
			fks.execute(schema, table, fullClassName);

		} catch (Exception e) {
			DbUtils.rollbackAndCloseQuietly(conn);
			return;
		} finally {
			DbUtils.closeQuietly(conn);
		}

	}
}
