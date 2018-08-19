package co.edureka.bean;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{

	// Authorzing
	
	@Override
	public void afterReturning(Object arg0, Method method, Object[] inputs, Object beanRef) throws Throwable {
		System.out.println(">>>>>>>>>>>>>>>after<<<<<<<<<<<<<");
		
		if(method.getName().equals("registerUser")){
			
			// Down casting
			User user = (User)beanRef;
			
			System.out.println("Inputs from "+method.getName());
			System.out.println("--------------");
			for(Object o : inputs){
				System.out.println(o);
			}
			System.out.println("--------------");
			
			int type = (int)inputs[0];
			String themeColor = (String)inputs[1];
			
			if(type == 1){
				System.out.println("==Welcome to Admin Console "+user.email+"==");
				System.out.println("==Your default color scheme is =="+themeColor);
			}else{
				System.out.println("==Welcome to User Console "+user.email+"==");
				System.out.println("==Your default color scheme is =="+themeColor);
			}
			
		}
	}

}
