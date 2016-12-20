package implementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import beansPackage.Artist;

public class SimplifiedExample {
	
	public static void main(String[] args) throws Exception{
		
		//Establish COnnection
		String URL = "jdbc:postgresql://localhost:5432/chinook";
		String USER = "postgres";
		String PASS = "maindawg";
		Connection conn = DriverManager.getConnection(URL, USER, PASS);
		conn.setAutoCommit(false); 
		String sql = "insert into artist (name) values (?)";
		
		// Save Artist
		Artist toSave = new Artist("Kanye West");
		PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		pstmt.setString(1,toSave.getArtist());
		pstmt.executeUpdate(); // handle transaction myself
		
		// Get back generated Serial number
		ResultSet rs = pstmt.getGeneratedKeys();
		while(rs.next()){
			System.out.println("Generated Artist is " + rs.getInt(1));
		}
		
		// Transaction Control
		conn.commit();
		conn.close();
	}

}
