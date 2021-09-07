//How to reverse words in a given sentence without using any library method?

package Assignment;

import java.util.Scanner;

public class RevWords {

	public static void main(String[] args) {
		RevWords o=new RevWords();
		String word="";
		String wordRev="";
		System.out.println("Enter String to Reverse it ");
		Scanner inp = new Scanner(System.in);
		String str = inp.nextLine();
		for (int i = 0; i < str.length(); i++){
			
			if((str.charAt(i)!=' ') || (i==str.length()-1))
			{
				word+=str.charAt(i);
			}
			
			
			if((str.charAt(i)==' ') || (i==str.length()-1)) {
				o.reverseString(word);
				System.out.print(" ");
				word="";
			}
			
			
			
		}
	}
void reverseString(String strtemp){
			for (int i = strtemp.length()-1; i >=0; i--) {
				System.out.print(strtemp.charAt(i));
			}
			}
	
}
