
public class StringMethods {

	public static void main(String[] args) {

		// STRINGS ARE IMMUTABLE. THEY CANNOT BE CHANGED
		String str1 = "John, Jennie, Jim";
		
		String str2 = ", Jack, Joe, John, Sia";
		
		// Any Operation on String will result into a new String, and old String will not change.
		String str3 = str1 + str2;//str1.concat(str2);
		
		String str4 = str3.toLowerCase();
		//String str4 = str3.toUpperCase();
		
		System.out.println("str1 is: "+str1); // John, Jennie, Jim
		System.out.println("str2 is: "+str2);
		System.out.println("str3 is: "+str3);
		System.out.println("str4 is: "+str4);
		
		// String Operations:
		int len = str4.length();
		System.out.println("str4 length is: "+len);
		char ch = str4.charAt(0);
		System.out.println("ch at 0 is: "+ch);
		ch = str4.charAt(len-1);
		System.out.println("ch at len-1 is: "+ch);
		
		char[] chArr = str4.toCharArray(); // get character array from String
		for(char chr : chArr){ // enhanced for loop
		//for(int i=0;i<chArr.length;i++){
			System.out.print(chr+" ");
			//System.out.print(chArr[i]+" ");
		}
		System.out.println();
		
		char[] chArr1 = {'A','w','e','s','o','m','e'};
		String str5 = new String(chArr1);
		System.out.println("str5 is: "+str5);
		
		//String str6 = str4.substring(3); // give the entire String after index 2 or from index 3
		String str6 = str4.substring(0,5); // give the entire String from index 0 to index 4 
		System.out.println("str6 is: "+str6);
		
		if(str4.contains("john")){
			System.out.println("john is in the String");
		}
		
		if(str4.startsWith("john")){ // str4.endsWith(".mp3") 
			System.out.println("str4 starts with john");
		}
				
		int idx = str4.indexOf('j');
		System.out.println("idx of j is: "+idx);
		idx = str4.indexOf('o');
		System.out.println("idx of o is: "+idx);
		idx = str4.lastIndexOf('o');
		System.out.println("last idx of o is: "+idx);
		
		String songName = "ABC.mp3";
		if(songName.endsWith(".mp3")){
			System.out.println(songName+" is an audio file");
		}
		
		idx = str4.indexOf("john");
		System.out.println("idx of john is: "+idx);
		idx = str4.lastIndexOf("john");
		System.out.println("idx of john is: "+idx);
		
		
		String str7 = new String("Hello");
		//String str8 = "Hello";
		String str8 = "HELLO";
		
		// Always remember comparing a String, we use equals method or comapreTo method -> compare content 
		if(str7 == str8){ // compares references
			System.out.println("str7 == str8");
		}else{
			System.out.println("str7 != str8");			
		}
		
		//if(str7.equals(str8)){ // compares data
		if(str7.equalsIgnoreCase(str8)){ // compares data
			System.out.println("str7 equals str8");
		}else{
			System.out.println("str7 not equals str8");			
		}
		
		//if(str7.compareTo(str8) == 0){ // compares data
		if(str7.compareToIgnoreCase(str8) == 0){ // compares data
			System.out.println("str7 compareTo str8");
		}else{
			System.out.println("str7 not compareTo str8");			
		}
	}

}
