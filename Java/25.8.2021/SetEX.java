package Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SetEX {

	public static void main(String[] args) {
      
    //11. Write a Java program to convert a hash set to an array. 
      ArrayList al = new ArrayList();
      al.add(57);
      al.add(96);
      al.add(20);
      al.add(45);
      System.out.println(al.getClass());
      System.out.println(al);
      System.out.println();
      
      HashSet hs=new HashSet(al); 
      System.out.println(hs.getClass());
      System.out.println(hs);
      System.out.println();
      
      //12. Write a Java program to convert a hash set to a tree set. 
      	TreeSet ts = new TreeSet(hs);
      	System.out.println(ts.getClass());
      	System.out.println(ts);
      	System.out.println();
      
      //13. Write a Java program to convert a hash set to a List/ArrayList
		ArrayList al1=new ArrayList(hs);
		System.out.println(al1.getClass());
	    System.out.println(al1);
	    System.out.println();
	    
      //14. Write a Java program to compare two hash set. 
		System.out.println(hs);
	    System.out.println(hs.equals(hs));
		System.out.println();
		
		HashSet hs1=new HashSet();
		hs1.add("hi");
		hs1.add(57);
		hs1.add(96);
		hs1.add(33);
		System.out.println(hs1);
		System.out.println(hs1.equals(hs1));
		System.out.println();
	    
		System.out.println(hs);
		System.out.println(hs1);
		System.out.println(hs.equals(hs1));
		System.out.println();
	
	//15. Write a Java program to compare two sets and retain elements which are same on both sets 
		hs1.retainAll(hs);
		System.out.println(hs1);
		System.out.println();
	
	//16. Write a Java program to remove all of the elements from a hash set.  
		hs1.clear();
		System.out.println(hs1);
		System.out.println("");
		
		System.out.println(ts);
	//17. Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element
		System.out.println();
		System.out.println(ts.tailSet(57));
		
	//18. Write a Java program to get an element in a tree set which is strictly less than the given element. 
		System.out.println();
		System.out.println(ts.headSet(57));
		System.out.println();
		
	//19. Write a Java program to retrieve and remove the first element of a tree set.  
		System.out.println(ts);
		System.out.println("pollfirst : "+ts.pollFirst());
		System.out.println(ts);
		System.out.println();
		
		
	//20. Write a Java program to retrieve and remove the last element of a tree set. 
		System.out.println(ts);
		System.out.println("pollLast : "+ts.pollLast());
		System.out.println(ts);
		System.out.println();
		
		
	//21. Write a Java program to remove a given element from a tree set. 
		System.out.println(ts);
		System.out.println("remove 45 : "+ts.remove(45));
		System.out.println(ts);
		System.out.println();
		
}
}
