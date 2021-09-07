/*How to Print duplicate characters from String?*/
package Assignment;

import java.util.Scanner;
public class Duplicate {

	public static void main(String[] args) {
		int temp=0;
		System.out.println("Enter the String to check duplicates");
		Scanner inp = new Scanner(System.in);
		StringBuilder o= new StringBuilder();
		o.append(inp.nextLine());
		System.out.print("Duplicates are : ");
		for(int i=0;i<(o.length()-1);i++) {
			for(int j=i+1;j<o.length();j++) {
				if(o.charAt(i) == o.charAt(j)){
					o.deleteCharAt(j);
					temp++;}	
				}
				if(temp!=0) {System.out.print(o.charAt(i)+" "); temp=0;}
	   		}
		}
}


