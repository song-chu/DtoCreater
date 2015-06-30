import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EbaLogDetail {

	public static void main(String[] args) {
		Statement stmt = null;
		Connection conn = null;
		try {
			conn = getConnection();

			// ステートメントを作成
			stmt = conn.createStatement();
			// 問合せの実行
			ResultSet rs = stmt
					.executeQuery("SELECT * FROM AC_CM_EBA_LOG_DTL where EBA_REQ_ASP_SERVICE_CD IN ('1200', '1210') and PROC_STATUS_DIV='1'");

			// TODO 自動生成されたメソッド・スタブ
			while (rs.next()) {

				String serviceCd = rs.getString("EBA_REQ_ASP_SERVICE_CD");

				System.out.println("=======================================================");
				System.out.println("==>要求電文業務コード:" + serviceCd);
				Clob clob = rs.getClob("RAW_REQUEST");
				int len = (int)clob.length();
				String str = clob.getSubString(1, len);

				System.out.println("---------------------RAW_REQUEST------------------------");
				System.out.println(str);

				clob = rs.getClob("RAW_RESPONSE");
				len = (int)clob.length();
				str = clob.getSubString(1, len);

				System.out.println("---------------------RAW_RESPONSE------------------------");
				System.out.println(str);
			}

		} catch (SQLException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	}

	private static Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@172.27.12.60:1521:ac2", "account", "account");
		return conn;
	}

}
