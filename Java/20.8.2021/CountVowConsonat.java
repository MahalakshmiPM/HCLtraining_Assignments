//How to count the occurrence of a given character in String?
package Assignment;
import java.util.Scanner;
public class CountVowConsonat {

	public static void main(String[] args) {
		int vow=0,con=0;
		System.out.println("Enter a String");
		Scanner inp=new Scanner(System.in);
		String str=inp.nextLine();
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
					vow++;
				else 
					con++;
		}
		System.out.println("Vowel : "+vow);
		System.out.println("Consonant : "+con);
	}
	}

