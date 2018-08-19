package co.edureka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.bean.CB;
import co.edureka.bean.Manager;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		/*Manager mgr = context.getBean("mRef",Manager.class);
		System.out.println(mgr);

		System.out.println("==Certifications==");
		System.out.println(mgr.getCertificates());*/
		
		CB cRef = context.getBean("cb",CB.class);
		cRef.getCa().sayHello("Fionna");
	}

}
