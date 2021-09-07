package LambdaPack;

import java.util.Scanner;
import java.util.function.Consumer;


public class MultiplesOf_3_5 {

	public static void main(String[] args) {
		Consumer<Integer> f =(n)->{if(n%3==0 && n%5!=0) 
											System.out.println("Fizz");
										   else if(n%3!=0 && n%5==0)
											 System.out.println("Buzz");
										   else if(n%3==0 && n%5==0)
											  System.out.println("FizzBuzz");
										   else System.out.println(n);};
		Scanner inp =new Scanner(System.in);
		System.out.println("Enter an Integer to check");
		f.accept(inp.nextInt());
	}

}
