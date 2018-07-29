package co.edureka.exceptions;

import java.util.Date;

public class App {

	public static void main(String[] args) {
		System.out.println("==App Started==");

		Date date = new Date();
		
		// error at compile time
		//int arr = {10,20,30,40,50};
		
		// resolution
		int[] arr = {10,20,30,40,50};
		
		int a=10, b=0, c=0;
		
		try{
			System.out.println("arr[2] is: "+arr[2]);
			c = a/b;
			System.out.println("c is: "+c);
		}/*catch(ArrayIndexOutOfBoundsException aRef){
			System.out.println("Some Exception: "+aRef);
			System.out.println("Message is: "+aRef.getMessage());
		}catch(ArithmeticException aRef){
			System.out.println("Some Exception: "+aRef);
			System.out.println("Message is: "+aRef.getMessage());
		}*/
		catch(Exception e){ // Run Time Polymorphism -> Ref variable of parent can point to any child
			System.out.println("Some Exception: "+e);
		}finally{
			System.out.println("Today is: "+date);
		}
		
		System.out.println("==App Finished==");
	}
	

}
