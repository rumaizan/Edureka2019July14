package co.edureka.model;

public class LedTV extends TV{ // IS-A Relation

	String type;
	
	public LedTV() {
	
	}

	public LedTV(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "LedTV [type=" + type + "]";
	}
	
}
