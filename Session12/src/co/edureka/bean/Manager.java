package co.edureka.bean;

import java.util.List;

public class Manager {
	
	String name;
	String desig;
	int exp;
	
	Address adrs; // Has-A Relation -> Dependency (1 to 1)
	
	List<String> certificates; // Has-A Relation -> Dependency (1 to many)
	
	public Manager() {
		
	}
	
	// DI using Constructor
	public Manager(Address adrs) {
		System.out.println("==Manager Created with Address Dependency using Constructor==");
		this.adrs = adrs;
	}

	public Manager(String name, String desig, int exp, Address adrs) {
		this.name = name;
		this.desig = desig;
		this.exp = exp;
		this.adrs = adrs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public Address getAdrs() {
		return adrs;
	}

	// DI - Using Setter
	public void setAdrs(Address adrs) {
		System.out.println("==Manager Created with Address Dependency using Setter==");
		this.adrs = adrs;
	}
	
	

	public List<String> getCertificates() {
		return certificates;
	}

	// DI - Using Setter
	public void setCertificates(List<String> certificates) {
		System.out.println("==Manager Created with List of Certificates using Setter==");
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", desig=" + desig + ", exp=" + exp + ", adrs=" + adrs + "]";
	}

}
