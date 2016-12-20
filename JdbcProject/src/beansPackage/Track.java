package beansPackage;

public class Track implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7188240207600759604L;
	private int trackid;
	private String name;
	private Album album;
	private int mediatypeid = 1;
	private String composer;
	private Genre genre;
	private int milliseconds=5000;
	private int bytes=1024;
	private double unitprice;
	
	public Track(){}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((album == null) ? 0 : album.hashCode());
		result = prime * result + bytes;
		result = prime * result + ((composer == null) ? 0 : composer.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + mediatypeid;
		result = prime * result + milliseconds;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + trackid;
		long temp;
		temp = Double.doubleToLongBits(unitprice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Track other = (Track) obj;
		if (album == null) {
			if (other.album != null)
				return false;
		} else if (!album.equals(other.album))
			return false;
		if (bytes != other.bytes)
			return false;
		if (composer == null) {
			if (other.composer != null)
				return false;
		} else if (!composer.equals(other.composer))
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (mediatypeid != other.mediatypeid)
			return false;
		if (milliseconds != other.milliseconds)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (trackid != other.trackid)
			return false;
		if (Double.doubleToLongBits(unitprice) != Double.doubleToLongBits(other.unitprice))
			return false;
		return true;
	}
	
	public int getTrackid() {
		return trackid;
	}
	public void setTrackid(int trackid) {
		this.trackid = trackid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Album getAlbum() {
		return album;
	}
	public void setAlbum(Album album) {
		this.album = album;
	}
	public int getMediatypeid() {
		return mediatypeid;
	}
	public void setMediatypeid(int mediatypeid) {
		this.mediatypeid = mediatypeid;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public int getMilliseconds() {
		return milliseconds;
	}
	public void setMilliseconds(int milliseconds) {
		this.milliseconds = milliseconds;
	}
	public int getBytes() {
		return bytes;
	}
	public void setBytes(int bytes) {
		this.bytes = bytes;
	}
	
	public double getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}
}
