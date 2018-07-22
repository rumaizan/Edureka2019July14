class Counter{
	
	// Object's Attribute
	int count = 1;
	
	// Class's Attribute
	static int scount = 1;
	
	// Object's Method
	void incrementCount(){
		count++;  // count = count+1
		scount++; // Property of Object can Access the Property of Class
	}
	
	// Object's Method
	void showCount(){
		System.out.println("count is: "+count);
		System.out.println("scount is: "+scount); // Property of Object can Access the Property of Class
	}
}


public class Statics {

	public static void main(String[] args) {
		
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = c1; // Ref Copy
		
		c1.incrementCount();  // 2  2
		c2.incrementCount();  // 2  3
		c3.incrementCount();  // 3  4
		
		c1.incrementCount();  // 
		c2.incrementCount();  //
		c2.incrementCount();  //
		
		c2.incrementCount();  //
		c2.incrementCount();  //
		c2.incrementCount();  //
		
		Counter.scount = 100;
		
		System.out.println("-----c1-----");
		c1.showCount();
		System.out.println("-----c2-----");
		c2.showCount();
		System.out.println("-----c3-----");
		c3.showCount();

	}

}
