class CA{
	
	// Property of Object
	int a;
	
	// Property of Class
	static int x;
	
	// Property of Object
	CA(){
		a = 10;
		System.out.println("--CA Object Created--");
	}
	
	// constructors cannot be static and hence we have a static block
	// static block is executed to initialize properties of class
	static{
		x = 100;
	}
	
	// Property of Object
	void show(){
		System.out.println("a is: "+a);
	}
	
	// Property of Class
	static void showX(){
		System.out.println("x is: "+x);
	}
	
	private void hello(){
		System.out.println("This is hello");
	}
}

// CB is Child of CA -> CB IS-A CA
class CB extends CA{
	
	int b;
	static int y;
	
	CB(){
		b = 20;
		System.out.println("--CB Object Created--");
	}
	
	void fun(){
		System.out.println("this is fun and b is: "+b);
	}
	
	static void showY(){
		System.out.println("y is: "+y);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		
		// Requesting for the Object of CB
		CB cbRef = new CB();
		cbRef.fun();
		
		// Child is able to access inherited data
		cbRef.a = 100;
		cbRef.show(); // Because show is inherited in the object, we can access it
		
		CB.x = 100;
		CB.y = 200;
		
		CB.showX();
		CB.showY();
		
		//cbRef.hello(); // error -> not inherited

	}

}
