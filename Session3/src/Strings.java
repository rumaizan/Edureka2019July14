
public class Strings {

	public static void main(String[] args) {
		
		int x = 10; // 10 is a literal
		
		// Interned Way
		String str1 = "Hello"; // "Hello" -> is a String literal which is created in constant pool
		String str2 = "Hello";
		
		// Non Interned Way | By Creating an Object 
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		// We are not comparing Values, we are comparing addresses contained in references
		if(str1 == str2){
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");
		}
		
		if(str3 == str4){
			System.out.println("str3 == str4");
		}else{
			System.out.println("str3 != str4");
		}
		
		if(str1 == str4){
			System.out.println("str1 == str4");
		}else{
			System.out.println("str1 != str4");
		}
		
		// BUT, printing the reference unlike arrays, gives values and not addresses
		// Because of a method called toString(), which gets executed automatically
		System.out.println("str1 is: "+str1); // will be translated to -> System.out.println("str1 is: "+str1.toString());
		System.out.println("str2 is: "+str2);
		System.out.println("str3 is: "+str3);
		System.out.println("str4 is: "+str4);
		System.out.println("=====================");
		System.out.println("str1 is: "+str1.toString()); // toString method returns back the String value rather than the address
		System.out.println("str2 is: "+str2.toString());
		System.out.println("str3 is: "+str3.toString());
		System.out.println("str4 is: "+str4.toString());
		
	}

}
