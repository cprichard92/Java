package beansPackage;

public class Genre implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1739820775271254227L;
	private int genreid;
	private String name;
	

	
	public Genre(int genreid, String name) {
		super();
		this.genreid = genreid;
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + genreid;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Genre other = (Genre) obj;
		if (genreid != other.genreid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	public int getGenreid() {
		return genreid;
	}
	public void setGenreid(int genreid) {
		this.genreid = genreid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
