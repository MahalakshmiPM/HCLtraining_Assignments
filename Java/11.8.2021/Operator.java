package Basics;
	/*write  a program demonstrating all operators*/
public class Operator {

	public static void main(String[] args) {
		int a=10,b=20,c=50;
		System.out.println("\nArithmetic Operators");
	    System.out.println("a + b = " + (a + b));
	    System.out.println("a - b = " + (a - b));
	    System.out.println("a * b = " + (a * b));
	    System.out.println("a / b = " + (a / b));
	    System.out.println("a % b = " + (a % b));
	   
	    System.out.println("\nLogical Operators");
	    System.out.println("(a>5)&&(b<5) = "+((a>5) && (b<5))); 
	    System.out.println("(a>5)||(b<5) = "+((a>5) || (b<5))); 
	    System.out.println("!(a==b) = "+!((a==b)));
	    
	    System.out.println("\nRelational Operators");
	    System.out.println("a==b = "+(a == b));  
	    System.out.println("a!=b = "+(a != b));  
	    System.out.println("a>b = "+(a > b));  
	    System.out.println("a<b = "+(a < b)); 
	    System.out.println("a>=b = "+(a >= b));  
	    System.out.println("a<=b = "+(a <= b)); 
	    
	    System.out.println("\nCompound Operators");
	    System.out.println("c+=a = " + (c+=a));
	    System.out.println("c-=a = " +(c-=a));
	    System.out.println("c*=a = " +(c*=a));
	    System.out.println("c/=a = " +(c/=a));
	    System.out.println("c%=a = " +(c%=a));
	}

}
