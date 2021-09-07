//How to check if two String is Rotations of eachother? 

package Assignment;

public class Rotation {
	
    	public static void main(String[] args) {
            String a = "super";
            String b = "persu";

            if (checkRotation(a, b))
                System.out.println("Strings are rotations of each other.");
            else
                System.out.println("Strings are not rotations of each other.");
    	}
    	
    	static boolean checkRotation(String s1, String s2) {
        if (s1.length() != s2.length())
          return false;
        String temp = s1 + s1;
        if (temp.indexOf(s2) != -1) {
            return true; 
        } else {
            return false;
        }

    }

  
    }