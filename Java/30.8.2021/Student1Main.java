package LambdaPack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Student1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Student1> pq= new PriorityQueue<Student1>();
	
		pq.add(new Student1("qwre",15, "TN",81,94,95));
		pq.add(new Student1("Meera",12, "TN",89,75,80));
		pq.add(new Student1("Lakshmi",11, "TN",88,76,80));
		pq.add(new Student1("Maha",13, "TN",80,95,99));
		pq.add(new Student1("sarvesh",14, "TN",90,78,89));
Iterator<Student1> i1= pq.iterator();
while(i1.hasNext())
System.out.println(i1.next());
System.out.println();

Student1 s1=pq.stream().max((o1,o2)->o1.compareTo(o2)).get();
System.out.println(s1);

List <Student1> i2 = pq.stream().sorted((o1,o2)->{
	if( ((Student1)o1).name.length() > ((Student1)o2).name.length() )
		 return -1;
	else return  1;}).collect(Collectors.toList());
System.out.println(i2);
	
List <Student1> i3 = pq.stream().sorted((o1,o2)->((Student1)o2).getAvg() > ((Student1)o2).getAvg()? -1:1)
		 							    .collect(Collectors.toList());
System.out.println(i3);
	
	}
	}
