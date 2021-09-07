package LambdaPack;
import java.util.Scanner;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

public class SumOfEvenFIbo {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  IntFunction<Integer> b=(o)->{
		  int temp=1,previous=0,current=1,next=1,sum=0;
			  while(temp<o) {
				  next=current+previous;
				  previous=current;
				  current=next;
				  if(next%2==0)
					  sum+=next;
				  temp++;
			  }
			  return sum;
	  };
	  System.out.println("Enter n To Find Sum of all Even Fibonacci Numbers");
	  int n=sc.nextInt();
	  sc.nextLine();
	  System.out.println(b.apply(n));
	}
}
