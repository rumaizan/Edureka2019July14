
import java.util.Scanner; // Scanner is an API, to read the data from User on Console !!

public class Methods {
	
	// Non Static Method
	// No Ack
	void calculateAreaRect(int length, int breadth){
		int area = length * breadth;
		System.out.println("Area of Rectangle is: "+area);
	}
	
	// Non Static Method
	// Ack
	double calculateAreaCircle(double radius){
		double area = 3.14 * radius * radius;
		return area;
	}
	
	// Static Method
	// What is a Static Method -> Will Discuss LATER !!
	static void addNumbers(int num1, int num2){
		int num3 = num1+num2;
		System.out.println(num1+" and "+num2+" addition is: "+num3);
	}
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Value of a: ");
		int a = scanner.nextInt(); // Read the int value from User on console
		
		System.out.println("Enter Value of b: ");
		int b = scanner.nextInt();
		
		// Execution of a Method
		// Static Methods:
		Methods.addNumbers(a, b);
		
		Methods.addNumbers(30, 40);
		Methods.addNumbers(123, 456);
		
		// Non Static Methods:
		// Create an Object. What is an Object: Will Discuss Later !!
		Methods m = new Methods(); // Object Construction Statement for class Methods
		
		double a1 = m.calculateAreaCircle(2.2);
		System.out.println("a1 is: "+a1);
		a1 = m.calculateAreaCircle(24.566);
		System.out.println("a1 is: "+a1);
		
		m.calculateAreaRect(30, 40);
		m.calculateAreaRect(10, 13);
		

	}

}
