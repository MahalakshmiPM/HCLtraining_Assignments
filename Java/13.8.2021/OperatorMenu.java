/*write a program to print operators menu card like
1. Arithmetic
2. relational
3. logical......
*/

import java.util.Scanner;
class OperatorMenu{
	Scanner inp=new Scanner(System.in);
	
void list(){	
	System.out.println("Enter your choice\n1.Arithmetic\n2.Logical\n3.Relational");
	int choice=inp.nextInt();
	System.out.println("Enter 2 numbers :");
	int a=inp.nextInt();
	int b=inp.nextInt();
	switch(choice){
	case 1:
		arithmetic(a,b);
		break;
	case 2:
		relational(a,b);
		break;
	case 3:
		logical(a,b);
		break;
	default:
		System.out.println("Invalid choice\nTerminating Program");
		break;
		}
}
	public static void main(String[] args) {
		OperatorMenu om=new OperatorMenu();
		om.list();
	}
void arithmetic(int a,int b) {
int choice;
	do {
		System.out.println("Enter your choice\n1.Add  2.Sub  3.Mul  4.Div  5.Mod  6.Back");
		choice=inp.nextInt();
		switch(choice){
			case 1: System.out.println(a+b); break;
			case 2: System.out.println(a-b); break;
			case 3: System.out.println(a*b); break;
			case 4: System.out.println(a/b); break;
			case 5: System.out.println(a%b); break;
			case 6:	OperatorMenu om=new OperatorMenu();om.list(); break;
			default: break;
		}
}while((choice>=1) && (choice<=7));
}

void relational(int a,int b) {
int choice;
do {
	System.out.println("Enter Your Choice\n1.==  2.!=  3.<=  4.>=  5.<  6.>  7.Back");
	choice=inp.nextInt();
	switch(choice){
		case 1: System.out.println(a==b); break;
		case 2: System.out.println(a!=b); break;
		case 3: System.out.println(a<=b); break;
		case 4: System.out.println(a>=b); break;
		case 5: System.out.println(a<b); break;
		case 6: System.out.println(a>b); break;
		case 7: OperatorMenu om=new OperatorMenu();om.list();break;
		default:break;
		}
}while((choice>=1) && (choice<=7));
}
void logical(int a,int b) {
	int choice;
do {
	System.out.println("Enter your choice \n1.And  2.Or  3.XOR  4.Back");
	choice=inp.nextInt();
	switch(choice){
		case 1: System.out.println(a&b); break;
		case 2: System.out.println(a|b); break;
		case 3: System.out.println(a^b); break;
		case 4: OperatorMenu om=new OperatorMenu();om.list();break;	
		default:System.out.println("invalid input");break;
		}
}while((choice>=1) && (choice<=4));
}
}