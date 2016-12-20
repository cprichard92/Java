package implementation;

import java.sql.Connection;
import java.sql.SQLException;

import beansPackage.Artist;
import jdbcExample.ConnectionFactory;

//Gateway to DAO code
public class DataService implements AutoCloseable{
	
	private Connection conn; //one connection for all DAOs; connection per HTTP request
	private ArtistDAO artistDAO;
	
	public DataService(){
		conn = ConnectionFactory.getConnection();
		try{
			conn.setAutoCommit(false); // Transaction Control
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		artistDAO = new ArtistDAOImpl(); //likely to have a DAO factory
	}
	
	@Override
	public void close(){
		try {
			if(conn !=null && conn.isClosed() == false){
				conn.close();
			}
		} catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	public void insertArtist(Artist artist){
		//delegate to DAO; control "unit of work"
		try {
			
			System.out.println("artistid is: " + artistDAO.insert(artist));
			conn.commit();
		} catch (SQLException e) { // boilerplate code
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		// as many insert here
	}
	

}
