package co.edureka.bean;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice{

	// Validation
	
	@Override
	public void before(Method method, Object[] inputs, Object beanRef) throws Throwable {
		
		System.out.println(">>>>>>>>>>>>>>>before<<<<<<<<<<<<<");
		
		if(method.getName().equals("registerUser")){
			
			// Down casting
			User user = (User)beanRef;
			
			if(user.email.isEmpty() || user.password.isEmpty()){
				System.out.println("Validation Failed !!");
			}else{
				System.out.println("Validation Passed !!");
			}
			
			System.out.println("Inputs from "+method.getName());
			System.out.println("--------------");
			for(Object o : inputs){
				System.out.println(o);
			}
			System.out.println("--------------");
		}
		
	}

}
