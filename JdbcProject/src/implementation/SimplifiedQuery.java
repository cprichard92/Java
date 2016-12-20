package implementation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import beansPackage.Artist;

public class SimplifiedQuery {
	
	public static void main(String[] args) throws SQLException {
		for(Artist temp : getAll() )
			System.out.println("ID " + temp.getArtistid() + " Name " + temp.getArtist());
		
	}
	
	public static List<Artist> getAll() throws SQLException{
		//Establish COnnection
		String URL = "jdbc:postgresql://localhost:5432/chinook";
		String USER = "postgres";
		String PASS = "maindawg";
		Connection conn = DriverManager.getConnection(URL, USER, PASS);
		conn.setAutoCommit(false);
		List<Artist> fromDatabase = new ArrayList<Artist>();
		
		String sql = "select * from artist order by artist";
		Statement stmt = conn.createStatement();
		stmt.executeQuery(sql);
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()){
			Artist row = new Artist();
			row.setArtistid( rs.getInt("artistid") );
			row.setArtist( rs.getString("name") );
			fromDatabase.add(row);
		}
		conn.close();
		return fromDatabase;
	}

}
