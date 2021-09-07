/* write a program to accept data from command line arguments and check it is 
 * prime or not, ever or not, palidrom or not, armstrong or not, perfect or not. */

package Day5;

import java.util.Scanner;

public class CmdLine {

	public static void main(String[] args) {
	 CmdLine o =new CmdLine();
		if(args.length>0) {
			int n1=Integer.parseInt(args[0]);
			o.oddEven(n1);
			o.prime(n1);
			o.perfect(n1);
			o.armstrong(n1);
			}
		else {
			Scanner inp =new Scanner(System.in); 
			System.out.println("Enter number");
			int n1=inp.nextInt();
			o.oddEven(n1);
			o.prime(n1);
			o.palindrome(n1);
			o.perfect(n1);
			o.armstrong(n1);
		}

}
void oddEven(int n1){
	if(n1%2==0)
		System.out.println(n1+" is Even");
	else System.out.println(n1+" is Odd");
}
void prime(int n1) {
	int flag=0;
	for(int i=2;i<n1/2;i++)
	{
	if(n1%2==0)	{
	flag++;
	System.out.println(n1+" is Not Prime");
	break;
	}}
	if(flag==0) System.out.println(n1+" is Prime");
	}
void palindrome(int n1){
	int rem=0,quo=n1;
	while(quo!=0){
		rem=(rem*10)+(quo%10);
		quo=quo/10;
		}
	if(rem==n1) System.out.println(n1+" is Palindrome");
	else System.out.println(n1+" is Not Palindrome");
	}
	
void armstrong(int n1) {
	int arm=0;
		int quo=n1;
		while(quo!=0) {
			arm+=Math.pow(quo%10,3);
			quo=quo/10;
			}
		if(n1==arm) System.out.println(n1+" is Armstrong Number\n");
		else System.out.println(n1+" is NonArmstrong Number\n");
}

void perfect(int n1) {
	int sum=0;
		for(int i=1;i<n1;i++) {
			if(n1%i==0) sum+=i;
		}
		if(n1==sum) System.out.println(n1+" is Perfect Number");
		else System.out.println(n1+" is NonPerfect Number");
}
}