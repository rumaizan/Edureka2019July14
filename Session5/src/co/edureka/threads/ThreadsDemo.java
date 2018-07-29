package co.edureka.threads;

/*class Task{
	void executeTask(){
		for(int i=1;i<=10;i++){					
			System.out.println("@@Task@@ "+i);
		}
	}
}*/

class Task extends Thread{
	// overriding the run method
	public void run(){
		for(int i=1;i<=10;i++){		
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("@@Task@@ "+i);
		}
	}
}

class MyTask extends Thread{
	// overriding the run method
	public void run(){
		for(int i=1;i<=10;i++){		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(i==5){
				ArithmeticException ae = new ArithmeticException("Thread Crashed");
				throw ae;
			}
			
			System.out.println("$$MyTask$$ "+i);
		}
	}
}

class CA{
	
}

//class YourTask extends CA, Thread{ error
class YourTask extends CA implements Runnable{
	// overriding the run method
	public void run(){
		for(int i=1;i<=10;i++){		
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("^^YourTask^^ "+i);
		}
	}
}

public class ThreadsDemo {

	// main thread's jobs shall be written in main method
	public static void main(String[] args) {
		
		System.out.println("==Main Started=="); // J1

		Task tRef = new Task();
		MyTask mRef = new MyTask();
		
		Runnable r = new YourTask();
		Thread yRef = new Thread(r);
				
		
		tRef.setName("John");
		mRef.setName("Jennie");
		yRef.setName("Jim");
		Thread.currentThread().setName("Jack");
		
		tRef.setPriority(Thread.MAX_PRIORITY); // 10
		mRef.setPriority(Thread.MIN_PRIORITY); // 1
		yRef.setPriority(Thread.NORM_PRIORITY);// 5
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("Task state before start: "+tRef.getState());
		
		//tRef.executeTask(); 					// J2
		tRef.start(); // start method internally executes run method. 
		// immediately after starting tRef, execute join method on it
		System.out.println("Task state after start: "+tRef.getState());
		try {
			tRef.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		
		mRef.start();
		
		mRef.yield();
		
		
		yRef.start();
		
		for(int i=1;i<=10;i++){	
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}// J3
			System.out.println("**Main** "+i);
		}
		
		
		
		
		
		System.out.println("tRef name: "+tRef.getName()+" and priority "+tRef.getPriority());
		System.out.println("mRef name: "+mRef.getName()+" and priority "+mRef.getPriority());
		System.out.println("yRef name: "+yRef.getName()+" and priority "+yRef.getPriority());
		System.out.println("main name: "+Thread.currentThread().getName()+" and priority "+Thread.currentThread().getPriority());
		
		System.out.println("Task state lastly: "+tRef.getState());
		
		if(tRef.getState() == Thread.State.TERMINATED){
			System.out.println("Task is terminated...");
		}
		
		System.out.println("==Main Finsihed=="); //J3
	}

}
