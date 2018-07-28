package co.edureka.exceptions;

import java.io.IOException;

// User Defined Exceptions:

// UNCHECKED
class MyBankingException extends RuntimeException{
	MyBankingException(String message){
		super(message);
	}
}

// CHECKED
class YourBankingException extends Exception{
	YourBankingException(String message){
		super(message);
	}
}


class Banking{
	
	int balance = 10000;
	int minBal = 3000;
	
	int attempts = 0;
	
	void withdraw(int amt){
		balance = balance - amt;
		
		if(balance < minBal){
			attempts++;
			balance = balance + amt;
			System.out.println("Withdrawl Failure. Balance is LOW: \u20b9"+balance);
		}else{
			System.out.println("Withdrawl Success. Balance is: \u20b9"+balance);
		}
		
		if(attempts == 3){
			// UNCHECKED EXCEPTION
			//ArithmeticException aRef = new ArithmeticException("Illegal Attempts !!");
			//throw aRef;
			
			MyBankingException mRef = new MyBankingException("Illegal Attempts !!");
			throw mRef;
			
		}
		
	}
	
	void withdrawAgain(int amt)  throws IOException, YourBankingException{
		balance = balance - amt;
		
		if(balance < minBal){
			attempts++;
			balance = balance + amt;
			System.out.println("Withdrawl Failure. Balance is LOW: \u20b9"+balance);
		}else{
			System.out.println("Withdrawl Success. Balance is: \u20b9"+balance);
		}
		
		if(attempts == 3){
			// CHECKED EXCEPTION
			//IOException iRef = new IOException("Illegal Attempts !!");
			//throw iRef;
			
			YourBankingException yRef = new YourBankingException("Illegal Attempts !!");
			throw yRef;
		}
		
	}
	
}

public class ThrowThrows {

	public static void main(String[] args) {
		
		boolean DEBUG = true;
		
		System.out.println("==Banking Started==");

		Banking bRef = new Banking();
		
		/*for(int i=1;i<=100;i++){
			bRef.withdraw(3000);
		}*/
		
		try{
			for(int i=1;i<=100;i++){
				bRef.withdrawAgain(3000);
			}
		}catch(Exception e){
			
			System.out.println("Some Exception Occurred");
			
			if(DEBUG){
				System.out.println("Some Exception Occurred "+e);
				e.printStackTrace();
			}
		}
		
		System.out.println("==Banking Finished==");
	}

}
