import java.util.Scanner;

public class Arr1D {

	public static void main(String[] args) {
		Scanner inp=new Scanner (System.in);
		System.out.println("enter Size");
		int x=inp.nextInt();
		int a[]=new int[x];
		System.out.println("Enter Array elements");
		for(int i=0;i<(a.length);i++)
		{
			a[i]=inp.nextInt();
		}
		
		for(int i=0;i<x;i++)
		{
		if(a[i]%2==0)
			System.out.println(a[i]+" ==> Even");
		else
			System.out.println(a[i]+" ==> Odd");
		}
		

	}

}
