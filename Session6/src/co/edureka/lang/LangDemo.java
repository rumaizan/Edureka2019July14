package co.edureka.lang;

public class LangDemo {

	public static void main(String[] args) {
		
		double d = Math.sqrt(16);
		System.out.println("d is: "+d);
		
		d = Math.cos(45);
		System.out.println("d is: "+d);
		
		String str = new String("This is Awesome");
		StringBuffer strBuffer = new StringBuffer("This is Awesome");
		
		//.....
		
		// Wrapper Classes | java.lang package 
		
		// Primitives
		int i = 10;
		float f = 2.2f;
		char c = 'A';
		
		
		// Way to get your primitives represented as objects using wrapper class
		// Now we can pass primitives as references too !!
		
		// Explicit
		Integer iRef = new Integer(i); 			// Boxing | Putting Primitive in an Object
		Float fRef = new Float(f);
		Character cRef = new Character(c);
		
		int j = iRef.intValue(); 				// UnBoxing | Extracting Primitive out of an Object
		float g = fRef.floatValue();
		char ch = cRef.charValue();
		
		// Implicit
		Integer jRef = i; 						// Auto-Boxing    -> Integer jRef = new Integer(i);
		int k = jRef;     						// Auto-UnBoxing  -> int k = jRef.intValue();

		// Utility Methods in Wrapper Classes:
		// eg: converting Strings to int
		String num = "10";
		int n = Integer.parseInt(num); // Converts String to int
		System.out.println("n is: "+n);
		
	}

}
