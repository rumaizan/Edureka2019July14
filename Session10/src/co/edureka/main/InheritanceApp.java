package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.LedTV;
import co.edureka.model.Product;
import co.edureka.model.TV;

public class InheritanceApp {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setName("iPhoneX");
		product.setPrice(80000);
		
		TV tv = new TV();
		tv.setName("Samsung LED");
		tv.setPrice(50000);
		tv.setModel("SMIN00142");
		tv.setScreenSize(50);
		
		LedTV led = new LedTV();
		led.setName("Samsung Curved LED");
		led.setPrice(70000);
		led.setModel("SMINCV0021");
		led.setScreenSize(55);
		led.setType("Curved");
		
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
			
			session.save(product);
			session.save(tv);
			session.save(led);
			
			transaction.commit();
			
			System.out.println("===Hibernate Transaction Finished===");
			
		} catch (Exception e) {
			//transaction.rollback();
			e.printStackTrace();
		}finally{
			
			if(session !=null)
				session.close();
			
		}


	}

}
