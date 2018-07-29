package co.edureka.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

class Employee{
	int eid;
	String name;
	
	void show(){
		System.out.println(eid+" belongs to "+name);
	}
}

public class CollectionsDemo {

	public static void main(String[] args) {
		
		// Hetrogenous in Nature
		//List list1 = new ArrayList(); 		// Polymorphic Statement
		ArrayList list1 = new ArrayList();		// Direct Object Construction
		
		// Homogenous in Nature
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<Employee> list3 = new ArrayList<Employee>();
		
		// ArrayList<int> list4 = new ArrayList<int>(); 		// -> error
		// Collections work on Objects and not on Primitives
		//ArrayList<Integer> list4 = new ArrayList<Integer>();  // Works 
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.eid = 101;
		e1.name = "John";
		
		e2.eid = 201;
		e2.name = "Jennie";
		
		
		// Writing Data in ArrayList
		list1.add(100); 	//0		// -> list1.add(new Integer(100)); AUTO-BOXING will be performed by Compiler
		list1.add('A');		//1
		list1.add("John");	//2
		list1.add(e1);		//3
		
		//list2.add(0,"John");	//0 | Index Management by us
		list2.add("John");	//0
		list2.add("Jennie");//1
		list2.add("Jim");	//2
		list2.add("Jack");	//3
		list2.add("Joe");	//4
		//list2.add(100); // err
		//list2.add(e1);  // err
		
		list3.add(e1);
		list3.add(e2);
		
		// Size of ArrayList
		System.out.println("size of list1 is: "+list1.size());
		System.out.println("size of list2 is: "+list2.size());
		System.out.println("size of list3 is: "+list3.size());
		
		// Read the data
		// 1. Simply print the reference variable
		System.out.println(list1); //-> System.out.println(list1.toString());
		System.out.println(list2);
		System.out.println(list3);
		
		//2. Get the Object on index
		Object o = list1.get(1);
		String name = list2.get(1);
		Employee e = list3.get(1); // gives us the reference to the Employee Object at index 1
		
		System.out.println(o);
		System.out.println(name);
		e.show();
		
		// Delete
		System.out.println("list2 before deletion is: "+list2);
		list2.remove(1);
		System.out.println("list2 now is: "+list2);
		
		// Update 
		list2.set(1, "Jack Watson");
		System.out.println("list2 now is: "+list2);
		
		// Read All : Iterating in the ArrayList
		//1. for loop
		System.out.println("----For Loop----");
		
		for(int i=0;i<list1.size();i++){
			Object o1 = list1.get(i);
			System.out.println(o1);
		}
		System.out.println("--------------");
		for(int i=0;i<list2.size();i++){
			String nm = list2.get(i);
			System.out.println(nm);
		}
		System.out.println("--------------");
		for(int i=0;i<list3.size();i++){
			Employee emp = list3.get(i);
			emp.show();
		}
		
		//2. enhanced for loop
		System.out.println("----Enhanced For Loop----");
		for(Object o2 : list1){
			System.out.println(o2);
		}
		
		System.out.println("--------------");
		for(String nm : list2){
			System.out.println(nm);
		}
		
		System.out.println("--------------");
		for(Employee emp : list3){
			emp.show();
		}
		
		//3. Iterator
		System.out.println("----Iterator----");
		
		Iterator<Object> itr1 = list1.iterator();
		while(itr1.hasNext()){
			Object o1 = itr1.next();
			System.out.println(o1);
		}
		
		System.out.println("--------------");
		Iterator<String> itr2 = list2.iterator();
		while(itr2.hasNext()){
			String nm = itr2.next();
			System.out.println(nm);
			
			/*if(nm.equals("John")){
				itr2.remove();
			}*/
		}
		
		System.out.println("--------------");
		
		Iterator<Employee> itr3 = list3.iterator();
		while(itr3.hasNext()){
			Employee emp = itr3.next();
			emp.show();	
		}
		
		//4. ListIterator
		System.out.println("----ListIterator----");
		
		ListIterator<String> listItr2 = list2.listIterator();
		
		while(listItr2.hasNext()){
			String nm = listItr2.next();
			System.out.println(nm);
		}
		
		System.out.println("--------------");
		while(listItr2.hasPrevious()){
			String nm = listItr2.previous();
			System.out.println(nm);
		}	
		
		//5. Enumeration
		System.out.println("----Enumeration----");
		Enumeration<String> enm = Collections.enumeration(list2);
		while(enm.hasMoreElements()){
			String nm = enm.nextElement();
			System.out.println(nm);
		}
		
		System.out.println("***************");
		
		// Explore more API's on ArrayList
		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("Fionna");
		list4.add("Sia");
		list4.add("Kim");
		list4.add("Fionna"); // Duplicacy is supported in List
		list4.add("Mike");
		list4.add("Leo");
		
		
		if(list4.contains("Sia")){
			System.out.println("Sia is in the list");
		}
		
		int idx = list4.indexOf("Kim");
		System.out.println("Index of Kim is: "+idx);
		
		list4.addAll(list2); // add elements from list2 into list4
		System.out.println(list4);
		
		list4.clear();// remove all
		System.out.println("list4 is: "+list4+" and its size is: "+list4.size());
		
		
		// Thread-Safe Version of ArrayList | Synchronized
		Vector<String> vector = new Vector<String>();
		vector.add("Fionna");
		vector.add("Sia");
		vector.add("Kim");
		vector.add("Fionna"); // Duplicacy is supported in List
		vector.add("Mike");
		vector.add("Leo");
		
		System.out.println("vector is: "+vector+" and its size is: "+vector.size());
		System.out.println(vector.get(1));
		vector.remove(1);
		System.out.println(vector);
		
	}

}
