package co.edureka.model;

import java.util.List;

public class Manager {

	Integer mid;
	String name;
	Integer exp;
	String desig;
	
	List<Certificate> certificates; // HAS-A | 1 to many

	public Manager() {
	
	}
	
	public Manager(Integer mid, String name, Integer exp, String desig, List<Certificate> certificates) {
		this.mid = mid;
		this.name = name;
		this.exp = exp;
		this.desig = desig;
		this.certificates = certificates;
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getExp() {
		return exp;
	}

	public void setExp(Integer exp) {
		this.exp = exp;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public List<Certificate> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		return "Manager [mid=" + mid + ", name=" + name + ", exp=" + exp + ", desig=" + desig + ", certificates="
				+ certificates + "]";
	}
	
	
}
