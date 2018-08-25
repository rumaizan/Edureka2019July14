package co.edureka.model;

// SingleTon - Design Pattern
public class Connection {

	private static Connection con = new Connection();
	
	// Since, constructor is private Hence we cannot create objects outside this class.
	private Connection() {
		System.out.println("==Connection Object Constructed==");
	}
	
	public static Connection getConnection(){
		return con;
	}
}
