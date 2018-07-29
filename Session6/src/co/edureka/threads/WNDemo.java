package co.edureka.threads;

class Message{
	
	String msg;
	
	Message(){
		msg = "No Message Availabale !!";
	}
	
	void writeMessage(String m){
		msg = m;
		System.out.println("(W) Message Written Successfully !!");
	}
	
	void readMessage(){
		System.out.println("(R) Message is: "+msg);
	}
}

class ReaderThread extends Thread{
	
	Message m;
	
	ReaderThread(Message n){
		m = n;
	}
	
	public void run() {
		// No other thread can perform any action on m when reader thread will perform read operation
		synchronized (m) {
			
			try {
				m.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			m.readMessage();
		}
	}
	
}

class WriterThread extends Thread{
	
	Message m;
	
	WriterThread(Message n){
		m = n;
	}
	
	public void run() {
		// No other thread can perform any action on m when writer thread will perform write operation
		synchronized (m) {
			m.writeMessage("Be Exceptionl !! Work Hard and get Luckier !!");
			//m.notify();
			m.notifyAll();
		}
	}
	
}


public class WNDemo {

	public static void main(String[] args) {
		
		Message m = new Message();
		
		ReaderThread rt1 = new ReaderThread(m);
		ReaderThread rt2 = new ReaderThread(m);
		WriterThread wt = new WriterThread(m);
		
		rt1.start();
		rt2.start();
		wt.start();
		
		
	}

}
