interface Inf1{
	
	int i = 10; // public static final int i = 10;
	
	void show();
	void fun();
}

interface Inf2{
	void fun();
	void hello();
}

// This is Interface to Interface Inheritance.
interface Inf3 extends Inf1, Inf2{ // Multiple Inheritance Happening on Interfaces. 
	
}

//interface Inf4 implements Inf2{ // No Sense -> as interfaces cannot define methods
	
//}

//class CI implements Inf1{ 
class CI implements Inf3{ //Inf1, Inf2{ // Multiple Implementation. -> IS NOT Multiple Inheritance 
	
	public void show(){
		System.out.println("This is show in CI");
	}
	
	public void fun(){
		System.out.println("This is fun in CI");
	}
	
	public void hello(){
		System.out.println("This is hello in CI");
	}
}

public class Interfaces {

	public static void main(String[] args) {
	
		Inf1 iRef1 = new CI();
		iRef1.show();
		iRef1.fun();
		
		System.out.println("i is: "+Inf1.i);
		System.out.println("i is: "+CI.i);
		
		Inf2 iRef2 = new CI();
		iRef2.fun();
		iRef2.hello();
		//iRef2.show(); // error -> because show is not a rule defined in Inf2
		
		CI ci = new CI();
		ci.show();
		ci.fun();
		ci.hello();
		System.out.println("==============");
		Inf3 iRef3 = new CI();
		iRef3.show();
		iRef3.fun();
		iRef3.hello();

	}

}
