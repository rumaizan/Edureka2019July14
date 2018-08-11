package co.edureka.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import co.edureka.model.User;

public class JDBCHelper {
	
	Connection con;
	Statement stmt;
	PreparedStatement pStmt;
	CallableStatement cStmt;
	
	// 1. Load the Driver
	public JDBCHelper(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("==Driver Loaded==");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//2. Create the Connection
	public void createConnection(){
		try {
			
			String url = "jdbc:mysql://localhost/edureka";
			String user = "root";
			String password = "";
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("==Connection Created==");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//3. Write SQL Statement
	//4. Execute SQL Statement
	public int registerUser(User user){
		
		int i = 0;
		
		try {
		
			String sql = "insert into User values(null,?,?,?)"; // ? -> wild card
			
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, user.name);
			pStmt.setString(2, user.email);
			pStmt.setString(3, user.password);
			
			i = pStmt.executeUpdate(); 
			
			if(i>0){
				System.out.println(user.name+" registered !!");
			}else{
				System.out.println("Some Error while inserting !!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return i;
	}
	
	public User loginUser(User user){
		
		try {
		
			String sql = "select * from User where email = ? and password = ?"; // ? -> wild card
			
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, user.email);
			pStmt.setString(2, user.password);
			
			ResultSet rs = pStmt.executeQuery();
			
			if(rs.next()){
				user.uid = rs.getInt(1);
				user.name = rs.getString(2);
				System.out.println("Login Successful !!");
			}else{
				System.out.println("Login Failure !!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return user;
	}
	
	

	//5. Close the Connection
	public void closeConnection(){
		try {
			
			con.close();
			
			System.out.println("==Connection Closed==");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
