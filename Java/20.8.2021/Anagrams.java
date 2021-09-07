/*How to check if two Strings are anagrams of each other?*/

package Assignment;

import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		int check=0;
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter First String");
		StringBuilder str1 = new StringBuilder(inp.nextLine());
		System.out.println("Enter Second String");
		StringBuilder str2 = new StringBuilder(inp.nextLine());
	if(str1.length()==str2.length()) {
		for(int i=0;i<str1.length();i++) {
			for (int j = 0; j < str2.length(); j++) {
				if(str1.charAt(i)==str2.charAt(j)){
				str2.deleteCharAt(j);
				check++;
				break;
				}
			}
		}		
	    if(check==str1.length())	System.out.println("Anagram");
	    else System.out.println("Not anagram");	   	
	}
	else	System.out.println("Not anagram");
	}
	}


