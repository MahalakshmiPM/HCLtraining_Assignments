/*write a program to display scientific calculator my calling math class methods.

	1. squareroot 
	2. log
	3. floor
	4. ceiling.

	loop should be given until giving exit.
 */

package Day5;

import java.util.Scanner;
import java.lang.Math;
public class ScientificCalculator {

	public static void main(String[] args) {
		int choice;
		Scanner inp = new Scanner(System.in);
		do{
		System.out.println("\nEnter your choice below");
		System.out.println("1.Square root\n2.log\n3.floor\n4.Ceil\n5.exit");
		choice=inp.nextInt();
		switch(choice) {
		case 1:
			{
			System.out.println("Enter a number");
			double n = inp.nextDouble();;
			System.out.println("Square root of "+n+" :  "+Math.sqrt(n));
			break;
			}
		case 2:
			{
			System.out.println("Enter a number");
			double n = inp.nextDouble();;
			System.out.println("Log of "+n+" :  "+Math.log(n));
			break;
			}
		case 3:
			{
			System.out.println("Enter a number");
			double n = inp.nextDouble();;
			System.out.println("Floor of "+n+" :  "+Math.floor(n));
			break;
			}
		case 4:
			{
			System.out.println("Enter a number");
			double n = inp.nextDouble();;
			System.out.println("Ceil of "+n+" :  "+Math.ceil(n));
			break;
			}	
		case 5:
			{
			System.exit(0);
			break;
			}
		default:
			{
			System.out.println("Enter a valid Choice");
            break;
			}
		}
	}while(true);
}	
}

