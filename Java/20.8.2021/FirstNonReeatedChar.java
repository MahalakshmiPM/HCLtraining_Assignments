/*3. How to print first non repeated character from String?*/

package Assignment;

import java.util.Scanner;

public class FirstNonReeatedChar {

	public static void main(String[] args) {
			int temp=0,NoDup=0;
			System.out.println("Enter the String to check duplicates");
			Scanner inp = new Scanner(System.in);
			String o=inp.nextLine();
			System.out.print("First Non Repeated Character is : ");
			for(int i=0;i<(o.length());i++) {
				for(int j=0;j<o.length();j++) {
					if(o.charAt(i) == o.charAt(j)){
						temp++;
					}
				}
				if(temp==1) {System.out.println(o.charAt(i));
							NoDup++;
							break;}
				else temp=0;
		   	}
			if(NoDup==0)System.out.println("All Characters Are Repeated");

	}

}
