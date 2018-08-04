package co.edureka.collections;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		// Data is sorted automatically: FIFO
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i=10; i>0; i--){
			queue.add(i);
		}
		
		// Queue is:
		// (head)10 9 8 7 6 5 4 3 2 1(tail)

		// But after sorting:
		// (head)1 2 3 4 5 6 7 8 9 10(tail)
		
		// Get the head of the Queue:
//		System.out.println("Head of Queue is: "+queue.peek()); // returns back the head
//		
//		System.out.println("Removed the Head of Queue which was: "+queue.poll()); // will remove the head and return back the head
//		System.out.println("Head of Queue is: "+queue.peek());
		
		for(int i=0;i<10;i++){
			System.out.println("Removed the Head of Queue which was: "+queue.poll()+" new size is: "+queue.size());
		}
		
	}

}
