package StudentManagementApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

	static Connection conn;

	public static Connection connect() {

		try {
			final String url = "jdbc:postgresql://localhost:5432/USERDB";
			final String user = "postgres";
			final String password = "SRDS@2000s";
			conn = DriverManager.getConnection(url, user, password);
			if (conn.isClosed()) {
				System.out.println("Connection made unsuccessfully.");
			} else {

				System.out.println("Connected to the PostgreSQL server successfully.");

			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn;

	}
}
