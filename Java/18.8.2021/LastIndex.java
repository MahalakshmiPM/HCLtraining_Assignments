/*1.	Write a Java program to get the last index of a string within a string. 
 Sample Input:
"The quick brown fox jumps over the lazy dog."
Sample output
 a  b c  d  e  f  g  h  i j  k l  m  n  o  p  q  r  s  t u  v  w  x  y  z
 36 10 7 40 33 16 42 32 6 20 8 35 22 14 41 23 4 29 24 31 21 27 13 18 38 37
*
*/

package Day5;

public class LastIndex {
	public static void main(String[] args) {
		String alpha="abcdefghijklmnopqrstuvwxyz";
		String target="The quick brown fox jumps over the lazy dog";
		String sameCase = target.toLowerCase();		
		for(int i=0;i<26;i++) {
			String str = alpha.substring(i, i+1);
			int x=sameCase.lastIndexOf(str,target.length()-1);
			System.out.println(str + " : " + x);
	}
}}