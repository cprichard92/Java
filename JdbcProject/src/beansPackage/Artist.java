package beansPackage;

public class Artist implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6616919086756889491L;
	private int artistid;
	private String artist;
	
	public Artist(){
		super();
	}
	
	public Artist(String name){
		super();
		this.artist = name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artist == null) ? 0 : artist.hashCode());
		result = prime * result + artistid;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artist other = (Artist) obj;
		if (artist == null) {
			if (other.artist != null)
				return false;
		} else if (!artist.equals(other.artist))
			return false;
		if (artistid != other.artistid)
			return false;
		return true;
	}
	public int getArtistid() {
		return artistid;
	}
	public void setArtistid(int artistid) {
		this.artistid = artistid;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
}
