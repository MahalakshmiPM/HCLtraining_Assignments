/*write a program to accept a number and check 
 * last digit is divisble 3 then with 5*/

import java.util.Scanner;
public class LastDigit {
public static void main(String [] args) {
	Scanner inp=new Scanner(System.in);
	System.out.println("Enter Positive integer");
	int num=inp.nextInt();
	int x=num;
	x=x%10;
	if(x%3==0) {
		if (x%5==0) System.out.println(x+"(last digit) is Divisible by 3 and 5"); 
		else System.out.println(x+"(last digit) is Divisible by 3 and Not Divisible by 5"); 
		}
	else{
		if (x%5==0) System.out.println(x+"(last digit) is Not Divisible by 3 and Divisible by 5"); 
		else System.out.println(x+"(last digit) is Not Divisible by 3 and 5"); 
		}	
}
}