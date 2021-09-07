/*File : Count Character
Write a program to count the number of times a character appears in the File. 
(Case insensitive... 'a' and 'A' are considered to be the same)*/

package FileStreamEX;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CountCharOccuranceFile {
	static char ch;
	static int count;
	static int a[]=new int[26];
public static void main(String args[]) {
	for (int i = 0; i <26; i++) 
		a[i]=0;
	try {
		FileWriter fw= new FileWriter("CountOccurance.txt");
		String msg = "Mahalakshmi P M";	
		fw.write(msg);
		fw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
	System.out.println("Successfully written in file");
	}
	
	int chk;
 try {
	 FileReader fr = new FileReader("CountOccurance.txt");
		while((chk=fr.read())!=-1) 
		{
			CountCharOccurance(chk);
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
System.out.println("Occurance of Characters in the file");
 for (int k = 0; k <26; k++) {
	if(a[k]!=0)
		{ch=(char)(k+65);
		System.out.println(ch+" : "+a[k]);
		} 
}
}

static void CountCharOccurance(int chk){
	count=0;
	for (int i = 65; i <= 90; i++) {
		
		if (chk==i)	{
		a[i-65]++;
		}
	}
	for (int i = 97; i <= 122; i++) {
		if (chk==i)	{
			int temp=i-97;
		a[temp]+=1;
		}
	}	
	}
	}	
	
	
	
		


