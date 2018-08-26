package co.edureka.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Certificate;
import co.edureka.model.Manager;

public class OneToManyApp {

	public static void main(String[] args) {
		
		Certificate c1 = new Certificate(null,"OCJP");
		Certificate c2 = new Certificate(null,"AWS");
		Certificate c3 = new Certificate(null,"CCNA");
		Certificate c4 = new Certificate(null,"OCWD");
		Certificate c5 = new Certificate(null,"CCNP");
		
		List<Certificate> list1 = new ArrayList<Certificate>();
		List<Certificate> list2 = new ArrayList<Certificate>();
		
		list1.add(c1); //0
		list1.add(c2); //1
		list1.add(c3); //2
		
		list2.add(c4); //0
		list2.add(c5); //1
		
		
		Manager m1 = new Manager();
		m1.setName("John");
		m1.setExp(10);
		m1.setDesig("Chief Manager");
		m1.setCertificates(list1);
		
		Manager m2 = new Manager();
		m2.setName("Jennie");
		m2.setExp(12);
		m2.setDesig("Chief Manager");
		m2.setCertificates(list2);
		
		
		
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
			
			//session.save(m2);
			
			Manager mgr = (Manager)session.get(Manager.class, 2);
			System.out.println(mgr);
			
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
