package Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx {

	public static void main(String[] args) {

//1. Write a Java program to create a new array list, add some colors (string) and print out the collection*/
	
	ArrayList colours = new ArrayList();
		colours.add("while");
		colours.add("Black");
		colours.add("Red");
		colours.add("Yellow");
		colours.add("Green");
		System.out.println(colours+"\n");
		
		
//2. Write a Java program to iterate through all elements in a array list. 
		Iterator i1= colours.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());	
		}
		System.out.println();
		
		ListIterator i2= colours.listIterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());	
		}
		System.out.println("");

//3. Write a Java program to insert an element into the array list at the first position. 
		colours.add(0,"Orange");
		System.out.println(colours+"\n");
		

//4. Write a Java program to retrieve an element (at a specified index) from a given array list. 
		System.out.println(colours.get(3));
		System.out.println("");

//5. Write a Java program to update specific array element by given element
	System.out.println(colours.set(2,"Violet") );
	System.out.println("");

//6. Write a Java program to test an array list is empty or not
	System.out.println(colours.isEmpty() );
	System.out.println("");
	
//7. Write a Java program to trim the capacity of an array list the current list size.
	colours.trimToSize();
	System.out.println("Cacpacity after trimming : "+ colours.size());
	System.out.println("");
	
//8. Write a Java program to increase the size of an array list	
	/////////////////////.args..args...args..args..args..args.clone(). num = new ArrayList();


//9. Write a Java program to replace the second element of a ArrayList with the specified element
	colours.set(1,"hellooooo");
	System.out.println(colours);
	System.out.println("");

//10. Write a Java program to print all the elements of a ArrayList using the position of the elements	
	for(int i=0;i<colours.size();i++) {
		System.out.println(colours.get(i));
	}	
	 System.out.println("");


	}
}


