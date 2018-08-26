package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import co.edureka.model.Employee;

public class AnnotationApp {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(null,"Sia",50000, "sia@example.com","Redwood Shores");
		
		Employee emp2 = new Employee();
		emp2.name = "Fionna";
		emp2.setSalary(60000);
		emp2.setEmail("fionna@example.com");
		emp2.address = "Country Homes";

		System.out.println("==Emp1==");
		System.out.println(emp1);
		
		System.out.println();
		
		System.out.println("==Emp2==");
		System.out.println(emp2);
		
		
		// Data in Objects is in RAM
		// Its temporary. We need to store the data permanently.
	
		// Hibernate -> Persist the data
		
		AnnotationConfiguration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new AnnotationConfiguration();
			config.configure(); // Parse hibernate.cfg.xml file
		
			factory = config.buildSessionFactory(); // To obtain a Session
			
			session = factory.openSession(); // Create Connection with DB
			
			transaction = session.beginTransaction(); // Execute SQL as Transactions
			
			// Save data in Database.
			// Firing SQL for insert command.
			//session.save(emp1);
			//session.save(emp2);
			
			//... CRUD Operations remains same
			
			for(int i=1;i<=100;i++){
				Employee emp = new Employee(null, "EmpName"+i, 20000+i, "empname"+i+"@example.com", "Redwood Shores");
				session.save(emp);
			}
			
			transaction.commit();
			
			System.out.println("===Hibernate Transaction Finished===");
			
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}finally{
			
			if(session !=null)
				session.close();
			
		}

	}

}
