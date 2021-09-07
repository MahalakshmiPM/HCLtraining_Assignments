/*How to check if a String contains only digits?*/

package Assignment;

public class Digit {
	public static void main(String[] args) {
		int count=0;
		String s1= new String("3f342");
		for (int i = 0; i < s1.length(); i++) {
			if((int)s1.charAt(i)>=48 && (int)s1.charAt(i)<=57 )
				count++;}

if(count==s1.length())
	System.out.println("All characters in the string are digits");
else
	System.out.println("All characters in the string are not digits");	
}
}