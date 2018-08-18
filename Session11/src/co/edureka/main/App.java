package co.edureka.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import co.edureka.bean.Child;
import co.edureka.bean.Connection;
import co.edureka.bean.Father;

public class App {

	public static void main(String[] args) {
	
		// Traditional Way of Creating a Java Object:
		
		Connection con = new Connection();
		con.setDriverName("a.b.c.d");
		con.setUrl("jdbc://someurl");
		con.setUser("john");
		con.setPassword("pass123");
		con.setPoolSize(10);
				
		System.out.println(con);
		
		System.out.println(">>>>>>>>>Spring FW>>>>>>>>>");
		
		// Spring FW Way:
		// Inversion of Control(IOC)
		// IOC Container will create and manage the lide of the object, we just obtain the reference to the object

		// 1. BeanFactory
		/*Resource resource = new ClassPathResource("beans.xml"); // Parse the XML File
		BeanFactory factory = new XmlBeanFactory(resource); 	// Create the Objects for us
		
		Connection c1 = (Connection)factory.getBean("con1");
		Connection c2 = factory.getBean("con2",Connection.class);
		
		System.out.println(c1);
		System.out.println(c2);*/
		
		//2. ApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		//Connection c1 = (Connection)context.getBean("con1");
//		Connection c2 = context.getBean("con2",Connection.class);
		
		/*Connection c2 = (Connection)context.getBean("con1");
		
		System.out.println(">>>>>>>"+c1.getUser()+">>>>>>>>");
		System.out.println(c1);
		
		System.out.println(">>>>>>>"+c2.getUser()+">>>>>>>>");
		System.out.println(c2);*/
		
		//System.out.println(c1);
		
		//Father f = context.getBean("fRef",Father.class);
		//System.out.println(f);
		
		Child c = context.getBean("cRef",Child.class);
		System.out.println(c);
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close();
	}

}
