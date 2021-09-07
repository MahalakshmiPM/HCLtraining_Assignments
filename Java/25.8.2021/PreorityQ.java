package Assignment;

import java.util.PriorityQueue;

public class PreorityQ {

	public static void main(String[] args) {
	PriorityQueue pq= new PriorityQueue();
	pq.add(88);
	pq.add(0);
	pq.add(-22);
	pq.add(-6);
	pq.add(12);
	pq.add(77);
	pq.add(22);
	System.out.println(pq);
	//22. Write a Java program to retrieve the first element of the priority queue
		System.out.println("Priority Queue : "+pq);
		System.out.println("Removes First Element : "+pq.poll());
		System.out.println("Priority Queue After Removing First Element :"+pq);

	//24. Write a Java program to convert a priority queue to an array containing all of the elements of the queue. 
		Object[] arr1=pq.toArray();

		System.out.println("\nThe Array(Using toArray()):");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	
	//25. Write a Java program to convert a Priority Queue elements to a string representation. 
	       String a= pq.toString();
		   System.out.println(a.getClass());
		   System.out.println(a);
		    
		   System.out.print("Original Priority Queue is : "+pq);
	//26. Write a Java program to change priorityQueue to maximum priorityqueue. 	
			Integer val=null;
			System.out.print("\nMaximum Priority Queue is : ");
			while((val=(Integer) pq.poll())!=null)
			{
				System.out.print(val+" ");
			}
}

}
