/*
 A palindrome is a word which reads the same backward or forward.
'abcba' is a palindrome.
Write a method that returns the longest palindrome substring of a given string.
*/



package LambdaPack;

import java.util.Scanner;
import java.util.function.ToIntFunction;

public class LongPanindromeSubstring {
	public static void main(String[] args) {
		ToIntFunction<String> tif= (o)->{
				String substr=(String)o;
				int len2=substr.length()/2,chk=0;
				for (int k=0,l=substr.length()-1; k<len2; k++,l--){
					if(substr.charAt(k)!=substr.charAt(l)) {
						chk++;break;}}
				return (chk>0)?-1:1;};
		
		int check=0,pali=-1;
		System.out.println("Enter a string");
		Scanner inp = new Scanner(System.in);
		String str = inp.nextLine();
		int len1 = str.length();
		String sub="";
	loop:
		for (int i = 0; i < len1-1; i++) {
		for (int j = len1; j > 1; j--) {
			if(j-i>=2)
			{	sub = str.substring(i,j);
				pali=tif.applyAsInt(sub);	//pali=palindromeCheck(sub);
			}
			if(pali==1) {System.out.println("Longest palindrome : "+sub);
		  check++;break loop;}
		}
		}
		if(check==0)System.out.println("There is no palindronic substring in this string ");	
	}
	
	/*static int palindromeCheck(String sub){
	int len2=sub.length()/2,chk=0;
	for (int i=0,j=sub.length()-1; i<len2; i++,j--) {
		if(sub.charAt(i)!=sub.charAt(j)) {
			chk++;break;}}
	if(chk>0) return -1;
	else return 1;
	}*/
	
}
