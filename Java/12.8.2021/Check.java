/* write a program to accept positive integer and check it 
 * even or odd,prime or not,palidrome or not,armstrong or not,perfect or not.*/

import java.util.Scanner;
import java.lang.Math;
public class Check {

  public static void main(String[] args) {
	  int num,choice;
  	  Scanner inp=new Scanner(System.in);
	  do{
		  System.out.println("Enter Your Choice\n1.Odd/Even\n2.Prime or not\n3.palindromr or not\n4.armstrong or not\n5.Perfect or not\n6.exit");
		  choice=inp.nextInt();
	  	  switch(choice) {
	  		case 1:
	  			System.out.println("Enter a positive integer");
	  			num=inp.nextInt();
	  			if(num%2==0) System.out.println(num+" is Even number\n");
	  			else  	     System.out.println(num+" is Odd number\n");
	  			break;
	  		case 2:
	  			int flag=0;
	  			System.out.println("Enter a positive integer");
	  			num=inp.nextInt();
	  			for(int i=2;i<=num/2;i++) {
	  				if(num%i==0) {
	  					flag++;break;
	  					}}
	  				if(flag==0)System.out.println(num+" is Prime Number\n");
	  				else System.out.println(num+" is NonPrime Number\n");
	  			break;
	  		case 3:
	  			System.out.println("Enter a positive integer");
	  			num=inp.nextInt();
	  			int quo=num,rem=0;
	  			while(quo!=0) {
	  				rem=(rem*10)+(quo%10);
	  				quo=quo/10;
	  				}
	  			if(rem==quo) System.out.println(num+" is Palindrome\n");
	  			else System.out.println(num+" is NonPalindrome Number\n");
	  			break;
	  		case 4:
	  			int arm=0;
	  			System.out.println("Enter a positive integer");
	  			num=inp.nextInt();
	  			quo=num;
	  			while(quo!=0) {
	  				arm+=Math.pow(quo%10,3);
	  				quo=quo/10;
	  				}
	  			if(num==arm) System.out.println(num+" is Armstrong Number\n");
	  			else System.out.println(num+" is NonArmstrong Number\n");
	  			break;
	  		case 5:
	  			int sum=0;
	  			System.out.println("Enter a positive integer");
	  			num=inp.nextInt();
	  			for(int i=1;i<num;i++) {
	  				if(num%i==0) sum+=i;
	  			}
	  			if(num==sum) System.out.println(num+" is Perfect Number\n");
	  			else System.out.println(num+" is NonPerfect Number\n");
	  			break;
	  		case 6:
	  			break;
	  		default:
	  			System.out.println("Invalid Input");
	  			break;
	  	}
	  }while(choice>=1&&choice<=5);
  }
}