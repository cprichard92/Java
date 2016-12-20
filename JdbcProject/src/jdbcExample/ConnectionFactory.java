package jdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static final String URL = "jdbc:postgres://localhost:5432/chinook";
	private static final String USER = "postgres";
	private static final String PASS = "maindawg";
	
	
	public static Connection getConnection(){
		try {
				return DriverManager.getConnection(URL, USER, PASS);
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
		}
}
