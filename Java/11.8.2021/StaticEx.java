package Basics;
  /*write a program to find out greater number among two variables where 
  one variable is static another one is non-static using conditional operator.*/

class StaticEx
{
static int a=5;
int b=2;
public static void main(String args[])
	{
	StaticEx obj=new StaticEx();
	int ans=a>obj.b?a:obj.b;
	System.out.println(ans);
	}
}