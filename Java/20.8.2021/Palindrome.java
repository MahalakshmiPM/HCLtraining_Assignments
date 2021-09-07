//How to check if two String is a rotation of each other?

package Assignment;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      String str, rev = "";
      System.out.println("Enter a string:");
      str = sc.nextLine();
      int length = str.length();
      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + str.charAt(i);
      if (str.equals(rev))
         System.out.println("it is palindrome");
      else
         System.out.println("it is not palindrome");
 
   }
}