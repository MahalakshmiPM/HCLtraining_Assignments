package Assignment;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {
		HashMap hm= new HashMap();
		hm.put(333,"subathra");
		hm.put(777,null);
		hm.put(111,"Maha");
		hm.put(222,"lakshmi");
		hm.put(444,null);
		hm.put(555,"akshaya");
		hm.put(666,null);
		hm.put(null,"murugesan");
		hm.put(null,"vignesh");
		hm.put(111,"dong");
		System.out.println(hm);
		
	//27. Write a Java program to test if a map contains a mapping for the specified value. 
		System.out.println(hm.containsValue("murugesan"));
		System.out.println(hm.containsValue("vignesh"));
		System.out.println(hm.containsValue("Maha"));
		System.out.println(hm.containsValue("lakshmi"));
		System.out.println();
		
	//28. Write a Java program to create a set view of the mappings contained in a map.
		System.out.println(hm.entrySet());
		System.out.println();
		
	//29. Write a Java program to get the value of a specified key in a map.
		System.out.println(hm.get("555 : "+555));
		System.out.println(hm.get("333 : "+333));
		System.out.println();
		
		
	//30. Write a Java program to get a set view of the keys contained in this map. 
		System.out.println(hm.keySet());
		System.out.println();
	//31. Write a Java program to get a collection view of the values contained in this map. 
		System.out.println(hm.values());
		System.out.println();
		
	//32. Write a Java program to get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive). 
		TreeMap tm = new TreeMap();
		tm.put(333,"subathra");
		tm.put(777,"devi");
		tm.put(111,"Maha");
		tm.put(222,"lakshmi");
		tm.put(444,"josh");
		tm.put(555,"akshaya");
		tm.put(666,"qwerty");
		tm.put(777,"murugesan");
		tm.put(999,"vignesh");
		tm.put(888,"dong");
		System.out.println(tm);
		System.out.println(tm.subMap(333, true, 999, false));
		System.out.println();
	//33. Write a Java program to get the portion of a map whose keys range from a given key to another key. 
		System.out.println(tm.subMap(333,999));
		System.out.println();
	//33. Write a Java program to get a portion of a map whose keys are greater than or equal to a given key. 
		System.out.println(tm.tailMap(444));
		System.out.println();
	
	//34. Write a Java program to get a portion of a map whose keys are greater than to a given key. 
		System.out.println(tm.tailMap(555, false));
		System.out.println();
		
	//35. Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.  
	   System.out.println(tm.ceilingEntry(700));
	   System.out.println(tm.ceilingEntry(666));
	   System.out.println();
	   
	//36. Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.  
	   System.out.println(tm.ceilingKey(600));
	   System.out.println(tm.ceilingKey(666));
	   System.out.println();
		
	}
}
