package beansPackage;

public class Album implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4996971014659356569L;
	private int albumid;
	private String title;
	private Artist artist;
	
	public Album(){}
	
	public int getAlbumid() {
		return albumid;
	}
	public void setAlbumid(int albumid) {
		this.albumid = albumid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
}
