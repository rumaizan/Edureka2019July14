/*class Shape{
	Shape(){
		System.out.println("==Shape Object Created==");
	}
	
	void draw(){
		System.out.println("Drawing a Shape");
	}
}*/

// Optimizing our RTP
/*abstract class Shape{
	Shape(){
		System.out.println("==Shape Object Created==");
	}
	
	// draw method is abstract: it will have no definition
	// it will be created only in abstract class.
	// this becomes a RULE. which must be defined by child.
	abstract void draw();
	//abstract void fun(); // all the rules must be defined
	
	void hello(){
		System.out.println("This is hello");
	}
}*/

// Abstract Class helped to optimize RTP: We Cannot Create Objects. Methods can have no definition
// But, as a rule of inheritance Parent Object will be created in the memory before child object, which is consuming memory

// Step Further and Improve it
interface Shape{
	
	// If we cannot have constructor, it means neither we nor RTE can create objects of interface
	/*Shape(){
		System.out.println("==Shape Object Created==");
	}*/
	
	// draw method is abstract: it will have no definition
	// this becomes a RULE. which must be defined by object which implements this interface.
	void draw(); // public abstract void draw();
	
	// Not Allowed
	/*void hello(){
		System.out.println("This is hello");
	}*/
}


class Rectangle implements Shape{ //extends Shape{
	Rectangle(){
		System.out.println("==Rectangle Object Created==");
	}
	
	public void draw(){
		System.out.println("Drawing a Rectangle");
	}
}

class Circle implements Shape{ //extends Shape{
	Circle(){
		System.out.println("==Circle Object Created==");
	}
	
	public void draw(){
		System.out.println("Drawing a Circle");
	}
}

class Traingle implements Shape{ //extends Shape{
	Traingle(){
		System.out.println("==Traingle Object Created==");
	}
	
	public void draw(){
		System.out.println("Drawing a Traingle");
	}
}


public class RTPAgain {

	public static void main(String[] args) {
		
		/*Shape s;
		s = new Shape();
		s.draw();*/
		
		// Ref Variable of Interface is pointing to an object which implements it
		// extends -> Inheritance
		// implements -> Implementation | Helps to achieve an optimized version of RTP
		
		Shape s;
		
		s = new Rectangle();
		s.draw();
		
		System.out.println("================");
		
		s = new Circle();
		s.draw();
		
		System.out.println("================");
		
		s = new Traingle();
		s.draw();
		
		System.out.println("================");
		
		
		// Shape Object cannot be created by user as it is marked as abstract
		// Shape cannot be instantiated. We cannot have instances(object) from Shape
		// Shape Objects will be created by R.T.E. as a rule of inheritance i.e. parent object shall be created before child object
		//s = new Shape();
		//s.draw();
		

	}

}
