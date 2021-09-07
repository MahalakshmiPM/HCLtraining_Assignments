package LambdaPack;
import java.util.Scanner;
import java.util.function.IntFunction;

public class FiboIndex {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  IntFunction<Integer> b=(o)->{
		  int temp=1,previous=0,current=1,next=1;
		  
		if (o==0)
			  return previous;
		else if(0==1)
			return current;
		 else {
			  while(temp<o) {
				  next=current+previous;
				  previous=current;
				  current=next;
				  temp++;
			  }
			  return next;
		  }
	  };
	  System.out.println("Enter Index to calculate fibonaci value");
	  int index=sc.nextInt();
	  sc.nextLine();
	  System.out.println(b.apply(index));
	}
}
