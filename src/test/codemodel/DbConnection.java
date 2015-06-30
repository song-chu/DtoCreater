package test.codemodel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class DbConnection {

	private static ResourceBundle bundle = ResourceBundle.getBundle("db");

	private DbConnection() {
	}

	public static Connection getConnection() throws Exception {
		String driver = bundle.getString("db.driver");
		String url = bundle.getString("db.url");
		String user = bundle.getString("db.user");
		String password = bundle.getString("db.password");

		return getConnection(driver, url, user, password);
	}

	public static Connection getConnection(String driver, String url, String user, String password) throws Exception {
		//JDBCドライバーをセット
		Class.forName(driver);
		//Connectionの取得
		Connection conn = DriverManager.getConnection(url, user, password);

		return conn;

	}
}
