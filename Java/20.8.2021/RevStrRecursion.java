/*How to reverse a given String using recursion?*/
package Assignment;
import java.util.Scanner;

public class RevStrRecursion {

public static void main(String[] args) {
	RevStrRecursion o =new RevStrRecursion();
	System.out.println("Enter String to Reverse it ");
	Scanner inp = new Scanner(System.in);
	String str = inp.nextLine();
	String revStr = o.reverseString(str,str.length()-1);
	System.out.println(revStr);
}
String reverseString(String strtemp,int index){
	if(index==-1) 
		return "";
	else		
		return strtemp.charAt(index)+reverseString(strtemp,--index);
}
}
