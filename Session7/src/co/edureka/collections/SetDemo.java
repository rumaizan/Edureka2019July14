package co.edureka.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		// When we need uniqueness in our data : use HashSet or TreeSet
		
		//HashSet<String> set = new HashSet<String>();
		
		TreeSet<String> set = new TreeSet<String>(); // Sorted Version
		set.add("John");
		set.add("Jennie");
		set.add("Sia");
		set.add("Fionna");
		set.add("Jim");
		set.add("John");
		set.add("Mike");
		set.add("Sia");
		
		System.out.println("set is: "+set);
		
		set.remove("Mike");
		
		//set.clear(); // remove all
		
		if(set.contains("Sia")){
			System.out.println("Sia is in the set");
		}
		
		// Retrieve : Iterate
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			String name = itr.next();
			System.out.println(name);
			//System.out.println(name+" | "+name.hashCode());
		}
		

	}

}
