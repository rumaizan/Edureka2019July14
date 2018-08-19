package co.edureka.main;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.bean.User;

public class AOPApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beansaop.xml");
		
		//ProxyFactoryBean -> API which has to be configured in XML File
		
		User user = context.getBean("userProxy",User.class);
		
		user.registerUser(2, "Blue");
	}

}
