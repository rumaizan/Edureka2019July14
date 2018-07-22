class Point{
	
	// Attributes
	int x;
	int y;
	
	// Methods
	
	// Constructor -> Default Constructor as it takes no inputs
	// If we do not create any constructor compiler creates a default constructor 
	/*Point(){
		x = 0;
		y = 0;
	}*/
	
	// Default Constructor
	Point(){
		x = 1;
		y = 1;
	}
	
	// Parameterized Constructor
	Point(int p, int q){
		x = p;
		y = q;
	}
	
	void setPointData(int p, int q){
		x = p;
		y = q;
	}
	
	void showPoint(){
		System.out.println("Point is: "+x+" : "+y);
	}
}

public class Constructors {

	public static void main(String[] args) {
		
		Point pRef1 = new Point();
		Point pRef2 = new Point();
		Point pRef3 = new Point();
		Point pRef4 = new Point(100,200);
		
		pRef1.setPointData(10, 20);
		pRef2.setPointData(30, 40);
		
		pRef1.showPoint();
		pRef2.showPoint();
		pRef3.showPoint(); 
		pRef4.showPoint(); 

	}

}
