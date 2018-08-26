package co.edureka.model;

public class TV extends Product{ // IS-A Relation
	
	Integer screenSize;
	String model;
	
	public TV() {
		
	}

	public TV(Integer screenSize, String model) {
		this.screenSize = screenSize;
		this.model = model;
	}

	public Integer getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(Integer screenSize) {
		this.screenSize = screenSize;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "TV [screenSize=" + screenSize + ", model=" + model + "]";
	}
	
	
	
}
