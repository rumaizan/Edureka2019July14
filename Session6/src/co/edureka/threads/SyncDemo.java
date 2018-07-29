package co.edureka.threads;

class Table{	
	// if a thread will access this method, a lock shall be acquired.
	// till time method has not finished its execution lock shall not be released.
	// lock shall be released after the execution is over
	//synchronized void printTable(int num){
	
	// Let the method be normal
	void printTable(int num){
		for(int i=1;i<=10;i++){
			System.out.println(num+" "+i+"'s are "+(num*i));
		}
	}
	
	void fun(){
		System.out.println("This is fun !!");
	}
}


class MyThread extends Thread{
	
	Table t; // Has-A Relation
	
	MyThread(Table s) {
		t = s;
	}
	
	public void run() {
		// Lock Acquisition over an Object.
		// Lock is released when synchronized Block is finished
		synchronized (t) {
			t.printTable(5);
			t.fun();
			//...
		}
	}
	
}

class YourThread extends Thread{
	
	Table t; // Has-A Relation
	
	YourThread(Table s) {
		t = s;
	}
	
	public void run() {
		synchronized (t) {
			t.printTable(7);
		}
	}
	
}

public class SyncDemo {

	public static void main(String[] args) {
		
		// One Object pointed by t as ref variable
		Table t = new Table();
		//t.printTable(5);
		
		// 1. MyThread and YourThread are working on the same object !!
		// 2. They shall run Asynchronously !! (Default Behavior of Threads)
		// 3. When multiple threads share the same object asynchronous behavior isn't good !!
		
		MyThread mRef = new MyThread(t);
		YourThread yRef = new YourThread(t);
		
		mRef.start();
		yRef.start();
	}

}
