
public class ValueRefPassing {
	
	void fun1(int a){
		a = 100;
		System.out.println("a is: "+a);
		
	}
	
	//void fun2(int[] a){
	static void fun2(int[] a){
		System.out.println("a is: "+a);
		a[1] = 123;
		a[3] = 756;
		for(int e : a){
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		
		// Object Construction Statement
		ValueRefPassing vrp = new ValueRefPassing();
		
		int b = 10;
		vrp.fun1(b); // Passing the Value. Value of b will be copied in a
		System.out.println("b is: "+b);
		
		int[] arr = {10,20,30,40,50}; // arr is a Ref Variable which will hold the address
		System.out.println("arr is: "+arr);
		
		//vrp.fun2(arr); // // Passing the Reference. Value of arr will be copied in a, which is an address value
		ValueRefPassing.fun2(arr);

		System.out.println("**************");
		for(int e : arr){
			System.out.println(e);
		}
		
	}

}
