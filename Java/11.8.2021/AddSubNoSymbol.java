package Basics;
	/*write a program to find out addition and subtraction of two variables where 
	 one is static and another one is non-static without using + and - symbols.*/
public class AddSubNoSymbol{
static int a=5,x=25;
int b=10,y=20;
public static void main(String[] args){
AddSubNoSymbol obj=new  AddSubNoSymbol();
while(obj.b!=0){
int ans=a & obj.b;
a^=obj.b;
obj.b=ans<<1;
}
System.out.println("adding a(5) and b(10) = "+ a);

while(obj.y!=0){
int ans=~x & obj.y;
x^=obj.y;
obj.y=ans<<1;
}
System.out.println("Subtracting x(25) and y(20) = "+ x);
}
}
