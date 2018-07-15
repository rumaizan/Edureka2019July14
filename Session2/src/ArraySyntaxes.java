
public class ArraySyntaxes {

	public static void main(String[] args) {
		
		// Arrays with Brackets before
		// Implicit Way
		int[] a1 = {10, 20, 30, 40, 50}; // translated to -> int[] a1 = new int[]{10, 20, 30, 40, 50};
		
		// Explicit Way
		int[] a2 = new int[]{10, 20, 30, 40, 50};
		
		// Arrays with Brackets after
		// Implicit Way
		int a3[] = {10, 20, 30, 40, 50}; // translated to -> int[] a1 = new int[]{10, 20, 30, 40, 50};
				
		// Explicit Way
		int a4[] = new int[]{10, 20, 30, 40, 50};
		
		// new is an operator which is used as a syntatical part
		// it creates arrays dynamically i.e. at run time i.e. when program is executed
		
		// When we are not giving the data but only the size: All the elements will be 0
		// We have no information on data. Data will be written later
		int[] a5,a6;
		a5 = new int[10]; // Array
		a6 = new int[5];  // Array
		
		int[] a7 = new int[10]; 
		
		a7[1] = 100;
		
		a7[3] = 300;
		
		for(int e : a7){
			System.out.println(e);
		}
		
		int a8[] = new int[10];
		int a9[],a10;
		a9 = new int[5]; // Array
		a10 = 100; // normal integer
		
		//System.out.println(a7[100]); | Error at run time since index does not exist
		
	}

}
