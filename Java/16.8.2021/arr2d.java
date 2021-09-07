import java.util.Scanner;
public class arr2d {
	public static void main(String[] args) {
		Scanner inp=new Scanner (System.in);
		System.out.println("enter r Size");
		int r=inp.nextInt();
		System.out.println("enter c Size");
		int c=inp.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter Array elements");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			a[i][j]=inp.nextInt();
		}}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+"\t");
				
			}System.out.println();
			}
		System.out.println();
	
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				int quo=a[i][j],rem=0;
				while(quo!=0) {
				rem=(rem*10)+(quo%10);
				quo=quo/10;
				}
				System.out.print(rem+"\t");
				
		}System.out.println();
			}
inp.close();
	}

}
