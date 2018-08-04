package co.edureka.collections;

class Outer{
	
	void show(){
		System.out.println("This is show of Outer");
	}
	
	// Nested class or Inner Class - serves as a helper class to Outer class
	class Inner{
		void show(){
			System.out.println("This is show of Inner");
		}
	}
	
}

public class NestedClassDemo {

	public static void main(String[] args) {
		
		Outer oRef = new Outer();
		oRef.show();
		
		Outer.Inner iRef = oRef.new Inner();
		iRef.show();

	}

}
