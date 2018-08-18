package co.edureka.bean;

public class Father {

	String fname;
	String lname;
	Integer wealth;
	
	public Father() {
	
	}

	public Father(String fname, String lname, Integer wealth) {
		this.fname = fname;
		this.lname = lname;
		this.wealth = wealth;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Integer getWealth() {
		return wealth;
	}

	public void setWealth(Integer wealth) {
		this.wealth = wealth;
	}

	@Override
	public String toString() {
		return "Father [fname=" + fname + ", lname=" + lname + ", wealth=" + wealth + "]";
	}	
}
