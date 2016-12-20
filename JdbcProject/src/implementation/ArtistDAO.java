package implementation;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import beansPackage.Artist;
 
public interface ArtistDAO{
	
	public void setConnection( Connection conn);
	
	/**
	 * Insert an artist in database
	 * @param artist
	 * @return Artist with updated primary key
	 * @throws SQLException 
	 */
	public Artist insert(Artist artist) throws SQLException;
	
	public Artist getArtistbyid(int id) throws SQLException;
	
	public List<Artist> getAll() throws SQLException;
	
	public void update(Artist artist) throws SQLException;
	
	public void delete(int id) throws SQLException;
}
