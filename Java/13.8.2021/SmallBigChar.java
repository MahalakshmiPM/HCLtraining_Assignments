/*write a program to accept n number of characters 
 * and find out smallest and biggest character.*/


import java.util.Scanner;
class SmallBig{
	char temp;
	void findchar(char ch[]) {
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[j]<ch[i]) {
					temp=ch[j];
					ch[j]=ch[i];
					ch[i]=temp;}
				}
			}
System.out.println("smallest character : "+ch[0]);
System.out.println("biggest character : "+ch[ch.length-1]);
}
}

public class SmallBigChar {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter size of array");
		int x=inp.nextInt();
		char n[]=new char[x];
		System.out.println("Enter "+x+" chars");
		for(int i=0;i<x;++i){
			n[i]=inp.next().charAt(0);}
		SmallBig sbc=new SmallBig();
		sbc.findchar(n);

	}

}
