package implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import beansPackage.Artist;

public class ArtistDAOImpl implements ArtistDAO{
	
	private Connection conn;
	
	@Override
	public Artist insert(Artist artist) throws SQLException{
		String sql = "insert into artist(name) values(?)";
		PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		
		//pass in arguments/parameters
		stmt.setString(1, artist.getArtist());// 1 based index
		stmt.executeQuery();
		
		//update the primary key in memory
		ResultSet rs = stmt.getGeneratedKeys();
		while(rs.next()){
			System.out.println("Artist id is " + rs.getInt(1));
		}
		return artist;
	}

	@Override
	public Artist getArtistbyid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Artist> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Artist artist) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setConnection(Connection conn) {
		this.conn = conn;
		
	}
}

