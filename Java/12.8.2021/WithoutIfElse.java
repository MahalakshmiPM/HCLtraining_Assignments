
/*write a program to accept two double values and 
  *find out which one is bigger number without using ifelse*/

import java.util.Scanner;
public class WithoutIfElse {
	public static void main(String[] args)
	{
		System.out.println("Enter 2  double numbers to find bigger number without using ifelsf");
		Scanner inp=new Scanner(System.in);
		double a= inp.nextDouble();
		double b= inp.nextDouble();
		double big=a>b?a:b;
		System.out.println("Biggest Number : "+big);
	}
}