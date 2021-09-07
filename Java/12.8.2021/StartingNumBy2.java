/*write a program to accept positive 3 digit integer number
 *  check starting number is divisble by 2*/


import java.util.Scanner;
public class StartingNumBy2 {
public static void main(String [] args) {
	Scanner inp=new Scanner(System.in);
	int digit=3;
	System.out.println("Enter a 3 digit Positive integer");
	int num=inp.nextInt();
	for(int i=1;i<digit;i++) num=num/10;
	if(num%2==0)System.out.println("Starting digit is Divisible by 2");
	else System.out.println("Staarting digit is NotDivisible by 2");	
}
}
