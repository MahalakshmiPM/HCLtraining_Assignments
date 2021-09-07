/*write a program to accept values in the form of 
 * rows and cols then find out each digit is even or odd*/


import java.util.Scanner;
class Show2d{
	void display(int a[][],int r,int c)
	{	
		for(int i=0;i<(r);i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]+"\t");
				}
			System.out.println();
         }
     }
}
class Array2d {
	String oddeven(int x)
	{
		if(x%2==0)
			return "Even";
		else 
			return "Odd"; 
	}

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		String ans;
		System.out.println("enter size of rows");
		int r=inp.nextInt();
		System.out.println("enter size of columns");
		int c=inp.nextInt();
		int[][] ar2d=new int[r][c];
		Array2d ob=new Array2d();
		System.out.println("Enter array values");
		for(int i=0;i<r;i++) 
			for(int j=0;j<c;j++)
				ar2d[i][j]=inp.nextInt();
		System.out.println("---Your 2D Array---");
		Show2d s2d=new Show2d();
		s2d.display(ar2d,r,c);
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				ans=ob.oddeven(ar2d[i][j]);
				System.out.println("array["+i+"]["+j+"] = "+ar2d[i][j]+" ==> "+ans);
			}
		}	
	}
}
