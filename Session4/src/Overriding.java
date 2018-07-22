class Parent{
	
	// non static -> object | Parent
	public void purchaseBike(){
		System.out.println("Lets purchase Bajaj Pulsar");
	}
	
	static void purchaseCar(){
		System.out.println("Lets buy Maruti Swift");
	}
	
	static void purchaseHome(){
		
	}
}

class Child extends Parent{
	
	
	// non static -> object | Child
	// Method Overriding : Use the same signature but different definition
	// Access should be either same or higher
	public void purchaseBike(){
		System.out.println("Lets purchase Royal Enfield");
	}
	
	// Method Hiding : User the same signature with different definition
	static void purchaseCar(){
		System.out.println("Lets buy Honda City");
	}
	
	// error
	/*void purchaseHome(){
		
	}*/
}


public class Overriding {

	public static void main(String[] args) {
		
		Child chRef = new Child();
		chRef.purchaseBike(); // in the child object we got 2 definitions, 1 from parent and another of child

		Child.purchaseCar();
		
	}

}
