class Counter{
	
	// Object's Attribute
	int count = 1;
	
	// Class's Attribute
	static int scount = 1;
	
	// Object's Method
	void incrementCount(){
		count++; // count = count+1
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
		Counter c3 = c1;
		
		c1.incrementCount();  // 2  2
		c2.incrementCount();  // 2  3
		c3.incrementCount();  // 3  4
		
		c1.incrementCount();  // .  .
		c2.incrementCount();
		c2.incrementCount();
		
		c2.incrementCount();
		c2.incrementCount();
		c2.incrementCount();
		
		c1.showCount();
		c2.showCount();
		c3.showCount();

	}

}
