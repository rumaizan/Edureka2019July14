// Object is Parent of All Classes in Java

class One{ //extends Object{
	
	public String toString(){
		return "This is Awesome";
	}
	
}

class Two{
	
}

public class ObjectDemo {

	public static void main(String[] args) {
		
		//One oRef = new One();
		
		Object oRef;
		oRef = new One();
		/*oRef = new Two();
		oRef = new String();
		oRef = new StringBuilder();*/
		
		System.out.println("oRef hashCode is: "+oRef.hashCode());
		System.out.println("oRef Class is: "+oRef.getClass());
		System.out.println("oRef Class is: "+oRef.getClass().getName());
		
		System.out.println("oRef is: "+oRef);
		System.out.println("oRef is: "+oRef.toString());
		
		String str = new String("Hello");
		System.out.println("str is: "+str); // we do not see address but we see value
		// Since, toString() method of Object class is overrided in String class
		

	}

}
