package co.edureka.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
			  // Key     Value
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		// TreeMap<K, V> | explore as HW
		// Comparator<T> | explore as HW
		
		map.put(101, "John"); // 101, "John" -> map.put(Entry(Key, Value))
		map.put(233, "Jennie");
		map.put(753, "Sia");
		map.put(110, "Fionna");
		map.put(912, "Mike");
		map.put(345, "Leo");
		
		// keys in the HashMap are unique !!
		// this will update the old value with new value
		map.put(101, "George"); // Same key will not be added again.
		
		// A different key can have the same value. 
		// Values can be duplicated but keys are unique !! 
		map.put(444, "Sia");
		
		// Unordered i.e. because of Hashing !!
		System.out.println("map is: "+map);
		
		// get the data
		String name = map.get(233);
		System.out.println("name is: "+name);
		
		map.remove(753);
		System.out.println("map is: "+map);

		//map.clear();
		
		if(map.containsKey(101)){
			System.out.println("101 key contains: "+map.get(101));
		}
		
		if(map.containsValue("Leo")){
			System.out.println("Leo is in the map");
		}
		
		// Add null key and null value
		map.put(null, "Harry"); // map can have a null key
		map.put(234, null);     // map can have a null value
		
		System.out.println(map);
		
		// 1. Iterate in Map
		// Obtain All the keys
		
		Set<Integer> keys = map.keySet();
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()){
			Integer key = itr.next();
			String value = map.get(key);
			System.out.println("key is: "+key+" and value is: "+value);
		}
		
		System.out.println("******************");
		
		// 2. Get EntrySet
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Entry<Integer, String>> itr1 = entrySet.iterator();
		while(itr1.hasNext()){
			Entry<Integer, String> entry = itr1.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		System.out.println("******************");
		// Thread-Safe i.e. Synchronized
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(101, "John"); // 101, "John" -> map.put(Entry(Key, Value))
		table.put(233, "Jennie");
		table.put(753, "Sia");
		table.put(110, "Fionna");
		table.put(912, "Mike");
		table.put(345, "Leo");
		//table.put(null, "Harry"); // -> Exception | null key not allowed
		//table.put(333, null); // -> Exception | null value not allowed
		
		System.out.println("table is "+table);
		
		
		
	}

}
