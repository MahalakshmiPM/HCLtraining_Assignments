/*Write a program to accept student objects and separate student who have age great than 18.  name, id, age.*/

package LambdaPack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Age {

	public static void main(String[] args) {
		student s1=new student("aaa",1,74);
		student s2=new student("bbb",2,12);
		student s3=new student("ccc",3,35);
		ArrayList al = new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		System.out.println(al);
		
		Stream s=al.stream();
		List l=(List) s.filter((o)->((student)o).age>18).collect(Collectors.toList());
		System.out.println(l);
		
	
	}

}
