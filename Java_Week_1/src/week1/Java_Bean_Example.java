package week1;
/*Java Bean
1) Have to be encapsulated
	- private variables
	- public getters & setters
2) Getter / Setter naming convention (getFirstName, setFirstName, setActive, isActive)
3) Define no argument constructor
 	ant()
 */

public class Java_Bean_Example {
	
	public static void main(String[] args) {
		Java_Bean_Example e = new Java_Bean_Example();
		//e.getSsn().getName().getSalary(); 4) Method Chaining
	}
	
	private int eid;
	private String firstName;
	private String lastName;
	private String ssn;
	private boolean active;
	
	public Java_Bean_Example(){
		super();
	}
	
	public Java_Bean_Example(int eid, String firstName, String lastName, String ssn) {
		super();
		this.eid = eid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}