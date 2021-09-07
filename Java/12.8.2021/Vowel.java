/*write a program to accept a character and check wheather it is vowel or not*/

import java.util.Scanner;
public class Vowel {
	public static void main(String[] args) {
		System.out.println("Enter a character");
		Scanner inp=new Scanner(System.in);
		char ch=inp.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') System.out.println("vowel");
		else System.out.println("Consonant");
	}

}
