package co.edureka.bean;

public class Child extends Father{

	Integer vehicles;
	String compName;
	
	public Child() {
	
	}

	public Child(Integer vehicles, String compName) {
		this.vehicles = vehicles;
		this.compName = compName;
	}

	public Integer getVehicles() {
		return vehicles;
	}

	public void setVehicles(Integer vehicles) {
		this.vehicles = vehicles;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	@Override
	public String toString() {
		return "Child [fname=" + fname + ", lname=" + lname + ", wealth=" + wealth +", vehicles = " + vehicles + ", compName=" + compName + "]";
	}
	
}
