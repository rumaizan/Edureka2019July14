
public class Dataoperations {

	public static void main(String[] args) {
		
		float dist = 50.56f;
		float fare = 50; //-> 50.0f
		
		float finalBillAmt = dist*fare; 
		
		System.out.println("Finall Bill Amt is: "+finalBillAmt);
		
		int a = 10;
		int b = 20;
		int c = (a*a)+(b*b)+(2*a*b);
		System.out.println("c is: "+c);
		
		//boolean result = a>b;
		boolean result = c>a && c>b;
		System.out.println("result is: "+result);
		
		int x = 10;
		x++;
		System.out.println("x is: "+x);
		
		x += 10; // x = x + 10;
		System.out.println("x is: "+x);
	}

}
