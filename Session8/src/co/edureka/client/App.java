package co.edureka.client;

import java.util.ArrayList;

import co.edureka.db.JDBCHelper;
import co.edureka.model.Student;

public class App {

	public static void main(String[] args) {
		
		// Objects created here are temporary.
		// We must persist them, i.e. store the data | -> Database
		Student s1 = new Student();
		s1.id = 0;
		s1.name = "Kim";
		s1.age = 30;
		
		//Student s2 = new Student(0,"Leo",36);
		
		System.out.println(s1);		// s1.toString()
		//System.out.println(s2);		// s2.toString()
		
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		//helper.insertStudent(s1);
		//helper.insertStudent(s2);
		
		//helper.updateStudent(s1);
		
		//helper.deleteStudent(6);
		
		/*ArrayList<Student> list = helper.retrieveStudents();
		
		for(Student s : list){
			System.out.println(s); //s.toString()
			System.out.println("-----------------------------------------");
		}
		
		System.out.println("****************");
		Student student = helper.retrieveStudents(1);
		System.out.println(student);*/
		
		//helper.executeProcedure(s1);
		helper.processBatch();
		
		helper.closeConnection();
		
	}

}
