package co.edureka.model;

class UberGo implements Cab{

	int price;
	String route;
	
	public void setRouteAndPrice() {
		price = 100;
		route = "Source A to Destinition B";
	}

	public void bookCab() {
		System.out.println("UberGo Booked for "+route+". Please Pay \u20b9"+price);
	}
}

class UberX implements Cab{

	int price;
	String route;
	
	public void setRouteAndPrice() {
		price = 200;
		route = "Source P to Destinition Q";
	}

	public void bookCab() {
		System.out.println("UberX Booked for "+route+". Please Pay \u20b9"+price);
	}
}

class UberMoto implements Cab{

	int price;
	String route;
	
	public void setRouteAndPrice() {
		price = 50;
		route = "Source X to Destinition Y";
	}

	public void bookCab() {
		System.out.println("UberMoto Booked for "+route+". Please Pay \u20b9"+price);
	}
}

// Factor - Design Pattern
public class CabFactory {

	public static Cab getCab(int typeOfCab){
		
		Cab cab = null;
		
		switch (typeOfCab) {
			case 1:
				cab = new UberGo();
				break;
	
			case 2:
				cab = new UberX();
				break;
				
			case 3:
				cab = new UberMoto();
				break;				
		}
		
		return cab;
	}
	
	
}
