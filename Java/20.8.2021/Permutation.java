//How to find all permutations of String?

package Assignment;

import java.util.Scanner;

public class Permutation
{
	public static void main(String[] args)
	{
		System.out.println("Enter any String");
		Scanner inp=new Scanner(System.in);
		String str=inp.nextLine();
		int n = str.length();
		System.out.println("Permutations");
		Permutation permutation = new Permutation();
		permutation.compute(str, 0, n-1);
	}

	private void compute(String str,int first,int last)
	{
		if (first==last)
			System.out.println(str);
		else
		{
			for (int i=first;i<=last;i++)
			{
				str = swap(str,first,i);
				compute(str, first+1, last);
				str = swap(str,first,i);
			}
		}
	}

	public String swap(String str, int i, int j)
	{
		char temp;
		char[] ch= str.toCharArray();
		temp = ch[i] ;
		ch[i] = ch[j];
		ch[j] = temp;
		return String.valueOf(ch);
	}

}


