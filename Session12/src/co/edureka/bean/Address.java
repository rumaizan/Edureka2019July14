package co.edureka.bean;

public class Address {
	
	String adrsLine;
	String city;
	int zipCode;
	
	public Address() {
	
	}

	public Address(String adrsLine, String city, int zipCode) {
		this.adrsLine = adrsLine;
		this.city = city;
		this.zipCode = zipCode;
	}

	public String getAdrsLine() {
		return adrsLine;
	}

	public void setAdrsLine(String adrsLine) {
		this.adrsLine = adrsLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [adrsLine=" + adrsLine + ", city=" + city + ", zipCode=" + zipCode + "]";
	}
	
}
