package co.edureka.bean;

public class User {
	
	String email;
	String password;
	
	public User() {
	
	}

	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	// type 1 : Admin | themeColor : Green
	// type 2 : User  | themeColor : Blue
	public void registerUser(int type, String themeColor){
		// Core Business Logic
		
		// DB Connectivity to insert the User in DB (Not writing that code)
		System.out.println("User with user id: "+email+" Registered successfully !!");
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + "]";
	}
	
}
