package Basics;
	/*write a program to swap two variables where one is static 
	 and other is non-static without using third variable.*/
public class Swap {
static int a=5;
int b=2;
	public static void main(String[] args) {
		Swap obj=new Swap();
		a=a+obj.b;
		obj.b=a-obj.b;
		a=a-obj.b;
		System.out.println("a is = "+a+"\nb is = "+obj.b);
	}

}
