package co.edureka.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import co.edureka.model.Student;

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
	public void insertStudent(Student sRef){
		try {
			
			//3. Write SQL Statement
			//String sql = "insert into Student values(null,'"+sRef.name+"',"+sRef.age+")";
			
			//4. Execute SQL Statement
			//stmt = con.createStatement();
			//int i = stmt.executeUpdate(sql); // Fire SQL Statement in MySQL DB
			
			String sql = "insert into Student values(null,?,?)"; // ? -> wild card
			
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, sRef.name);
			pStmt.setInt(2, sRef.age);
			
			int i = pStmt.executeUpdate(); 
			
			if(i>0){
				System.out.println(sRef.name+" inserted !!");
			}else{
				System.out.println("Some Error while inserting !!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateStudent(Student sRef){
		try {
			
			String sql = "update Student set name = ?, age = ? where id = ?"; // ? -> wild card
			
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, sRef.name);
			pStmt.setInt(2, sRef.age);
			pStmt.setInt(3, sRef.id);
			
			int i = pStmt.executeUpdate(); 
			
			if(i>0){
				System.out.println(sRef.name+" updated !!");
			}else{
				System.out.println("Some Error while updating !!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteStudent(int id){
		try {
			
			String sql = "delete from Student where id = ?"; // ? -> wild card
			
			pStmt = con.prepareStatement(sql);
			pStmt.setInt(1, id);
			
			int i = pStmt.executeUpdate(); 
			
			if(i>0){
				System.out.println(id+" deleted !!");
			}else{
				System.out.println("Some Error while deleting !!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Student> retrieveStudents(){
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		try {
			
			String sql = "select * from Student";
			pStmt = con.prepareStatement(sql);
			
			ResultSet rs = pStmt.executeQuery(); // fetch the data from table 
			
			while(rs.next()){
				
				Student s = new Student();
				s.id = rs.getInt(1);
				s.name = rs.getString(2);
				s.age = rs.getInt(3);
				
				students.add(s);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return students;
	}
	
	public Student retrieveStudents(int id){
		
		Student s=null;
		
		try {
			
			String sql = "select * from Student where id = ?";
			pStmt = con.prepareStatement(sql);
			pStmt.setInt(1, id);
			ResultSet rs = pStmt.executeQuery(); // fetch the data from table 
			rs.next();
			s = new Student();
			s.id = rs.getInt(1);
			s.name = rs.getString(2);
			s.age = rs.getInt(3);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return s;
	}
	
	public void executeProcedure(Student sRef){
		try {
			
			String sql = "{ call insertStudent(?,?) }";
			cStmt = con.prepareCall(sql);
			cStmt.setString(1, sRef.name);
			cStmt.setInt(2, sRef.age);
			
			cStmt.execute();
			
			System.out.println("==Procedure Executed==");
			
		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
			System.out.println("OOPS! Some error !!");
		}
	}
	
	public void processBatch(){
		try {
			
			String sql1 = "update Student set name = 'Jennie Watson', age = 45 where id = 2";
			String sql2 = "delete from Student where sid = 3";
			
			con.setAutoCommit(false);
			
			stmt = con.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			
			stmt.executeBatch();
			
			con.commit();
			
			System.out.println("==Batch Executed as a Transaction==");
			
		} catch (Exception e) {
			
			try {
				con.rollback();
				System.out.println("==Transaction Roll Backed==");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			e.printStackTrace();
			//System.out.println(e.getMessage());
			System.out.println("OOPS! Some error !!");
		}
	}
	
	
	//5. Close the Connection
	public void closeConnection(){
		try {
			
			//stmt.close();
			//pStmt.close();
			
			
			con.close();
			
			System.out.println("==Connection Closed==");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
