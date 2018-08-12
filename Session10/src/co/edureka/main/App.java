package co.edureka.main;

import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import co.edureka.model.Employee;

public class App {

	public static void main(String[] args) {
		
		/*Employee emp1 = new Employee(null,"Sia",50000, "sia@example.com","Redwood Shores");
		
		Employee emp2 = new Employee();
		//emp2.setId(2);
		emp2.name = "Fionna";
		emp2.setSalary(60000);
		emp2.setEmail("fionna@example.com");
		emp2.address = "Country Homes";

		System.out.println("==Emp1==");
		System.out.println(emp1);
		
		System.out.println();
		
		System.out.println("==Emp2==");
		System.out.println(emp2);
		*/
		
		// Data in Objects is in RAM
		// Its temporary. We need to store the data permanently.
	
		// Hibernate -> Persist the data
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new Configuration();
			config.configure(); // Parse hibernate.cfg.xml file
			//config.configure("anyname.cfg.xml"); // Parse anyname.cfg.xml file
			
			factory = config.buildSessionFactory(); // To obtain a Session
			
			session = factory.openSession(); // Create Connection with DB
			
			transaction = session.beginTransaction(); // Execute SQL as Transactions
			
			// Save data in Database.
			// Firing SQL for insert command.
			//session.save(emp1);
			//session.save(emp2);
			
			// Get the data : Single Row as Object
			//Employee emp = (Employee)session.get(Employee.class, 2);
			//System.out.println(emp);
			
			// Update the data
			//emp.setName("Jennie Watson");
			//emp.setSalary(67500);
		
			//session.update(emp);
		
			//session.delete(emp);
			
			// Get all : All Records as List of Objects (Collection)
			//1. HQL | Hibernate Query Language
			//String hql = "From Employee"; // From Employee where salary > 35000
			//List<Employee> employees = session.createQuery(hql).list();
			
			//for(Employee e : employees){
			//	System.out.println(e);
			//}
			
			// 2.Criteria API, No HQL
			Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.gt("salary", 50000)); // where salary > 50000
			
			List<Employee> employees = criteria.list();
			
			for(Employee e : employees){
				System.out.println(e);
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
