// textual representation how a User object will look like in the memory
// its a structure for an object.
class User{
	
	// Non static -> property of Object
	// Attributes of Object
	// Property of Object and not of class
	// State
	String name;
	private String phone;
	String email;
	char gender;
	private int age;
	String address;
	
	// Static -> Property of Class
	// Attribute of Class
	// Property of Class and not of object
	// State -> Belongs to Class
	static String compName;
	
	// Methods -> to access the data which is private
	// They are property of Object and not of class
	void setPhone(String ph){ // setter method
		phone = ph;
	}
	
	// Why Setter Method -> for setting the data in private attribute.
	// We must have some rules that how data must be given to private attribute
	void setAge(int a){
		if(a >= 18){
			age = a;
		}else{
			age = 0;
		}
	}
	
	String getPhone(){ // getter method
		return phone;
	}
	
	int getAge(){
		return age;
	}
	
	// Methods -> with some logic..
	void showUserDetails(){
		
		if(age>=18 && age<60){
			System.out.println(name+" is "+age+" years old and is a youth");
		}
		
		if(age>=60){
			System.out.println(name+" is "+age+" years old and is a senior citizen");
		}
	}
	
	// static method -> property of class
	static void showCompanyName(){
		System.out.println("Company Name is: "+compName);
	}
}

public class OOPS {

	public static void main(String[] args) {
		
		// We will create Object here...
		
		User uRef1 = new User(); // Object construction statement
		System.out.println("uRef1 is: "+uRef1);
		// new is an operator which creates an object in the memory, and returns the reference to the object.
		// uRef is not an object. it contains address of the object. It is a reference variable.
		
		User uRef2 = new User();
		System.out.println("uRef2 is: "+uRef2);
		
		/*int a = 10;
		int b = a; // Value Copy
		
		int[] a1 = {10,20,30,40,50};
		int[] a2 = a1; // Reference Copy */
		
		User uRef3 = uRef1; // Reference Copy
		System.out.println("uRef3 is: "+uRef3);
		
		// uRef1 and uRef3 are not 2 different objects. They are 2 different reference variables pointing to the same Object.
		
		// Write the data in object. We will use its ref var !!
		uRef1.name = "John";
		//uRef1.phone = "+91 99999 88888";
		uRef1.setPhone("+91 99999 88888");
		uRef1.email = "john@example.com";
		uRef3.gender = 'M';
		//uRef1.age = 30;
		uRef1.setAge(30);
		uRef3.address = "Redwood Shores";

		uRef2.name = "Jennie";
		//uRef2.phone = "+91 99999 77777";
		uRef2.setPhone("+91 99999 77777");
		uRef2.email = "jennie@example.com";
		uRef2.gender = 'F';
		//uRef2.age = 32;
		uRef2.setAge(65);
		uRef2.address = "Country Homes";
		
		// Read the data from Object
		//System.out.println(uRef1.name+" is "+uRef1.age+" years old and lives in "+uRef1.address);
		//System.out.println(uRef3.name+" is "+uRef3.age+" years old and lives in "+uRef3.address);
		
		//System.out.println(uRef2.name+" is "+uRef2.age+" years old and lives in "+uRef2.address);

		
		System.out.println(uRef1.name+" is "+uRef1.getAge()+" years old and lives in "+uRef1.address);
		System.out.println(uRef3.name+" is "+uRef3.getAge()+" years old and lives in "+uRef3.address);
		
		System.out.println(uRef2.name+" is "+uRef2.getAge()+" years old and lives in "+uRef2.address);

				
		uRef1.showUserDetails();
		uRef2.showUserDetails();
		
		User.compName = "Edureka";
		
		
		// objects can access i.e. read and write property of class
		uRef1.compName = "Brainforce";  // we are clear that it's compName in the User Class
		uRef1.showCompanyName();
		
		User.showCompanyName();
		
		
		// Class cannot access the property of Object
		//User.name = "Jack"; -> which object's name ??
		
	}

}
