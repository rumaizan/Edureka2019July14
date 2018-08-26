package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Address;
import co.edureka.model.Person;

public class OneToOneApp {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setName("John");
		person.setEmail("john@example.com");
		person.setAge(30);

		Address address = new Address();
		address.setAdrsLine("Country Homes");
		address.setCity("Bengaluru");
		address.setState("Karnataka");
		address.setZipCode(520001);
		
		person.setAddress(address);
		address.setPerson(person);
		
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
			
			session.save(person); // saving person will also save address
			
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
