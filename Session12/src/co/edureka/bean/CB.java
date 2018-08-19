package co.edureka.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class CB {
	
	CA ca; // Has-A Relation -> Dependency
	
	public CB() {
	
	}

	@Autowired
	public CB(CA ca) {  // @Autowired is written with constructor
		this.ca = ca;
	}

	public CA getCa() {
		return ca;
	}

	public void setCa(CA ca) {
		this.ca = ca;
	}
	
}
