
public class Overloading {

	void add(int a, int b){
		int c = a+b;
		System.out.println("c is: "+c);
	}
	
	/*void add(int x, int y){ // error
		int sum = x+y;
	}*/
	
	void add(int a, int b, int c){
		int sum = a + b + c;
		System.out.println("sum is: "+sum);
	}
	
	// Overloading or CTP
	// same method Name, with different inputs
	// Rules
	// 1. Method Name should be Same
	// 2. Inputs should be different i.e. unique
	//    2.1 Number of Inputs (Can Increase/Decrease)
	//	  2.2 Type of Inputs (Data Types can be different)
	//    2.3 Sequence of Inputs
	// 3. Ack i.e. Return Type has no role to play
	
	void add(double a, double b){
		double c = a + b;
		System.out.println("c is: "+c);
	}
	
	void add(int a, double b){
		double c = a + b;
		System.out.println("c is: "+c);
	}
	
	void add(double a, int b){
		double c = a + b;
		System.out.println("c is: "+c);
	}
	
	/*
	void fun(){
		
	}
	
	// cannot overload on the basis of return type
	int fun(){
		return 100;
	}
	*/
	
	public static void main(String[] args) {
		
		Overloading o = new Overloading();
		//o.add(10, 20); // binding is a problem, that the call should be linked to which definition
		
		o.add(10, 20);
		o.add(10, 20, 30); // binding is not a problem !!
		
		o.add(2.2, 3.3);
		
		o.add(2.2, 100);
		o.add(200, 3.3);
		

	}

}
