/*write an example to accept student details and depending on student details create directory depending on stream, ECE,Mech,CSC, EEE, student details should be created by creating student name .txt file and his personal details should be stored*/




package FileEx;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class DirectorysFiles {

	public static void main(String[] args) {
		File f1=new File("F:\\Workspace\\JavaTraining\\FileEx\\StudentDirectory");
		f1.mkdir();
		Scanner inp = new Scanner(System.in);
		do {	
		System.out.println("Enter student id");
		int sid=inp.nextInt();
		System.out.println("Enter student name");
		inp.nextLine();
		String sname=inp.nextLine();
		System.out.println("Enter student dept");
		String sdept = inp.nextLine();
		Student s1=new Student(sid,sname,sdept);
		System.out.println(s1);
		
		String dept=checkDept(sdept);
		DeptDirectoryStdNameFile(s1,dept);
		System.out.println("\nEnter 0 to exit\nEnter 1 to add student");
		}while(inp.nextInt()!=0);	
		
	}
static  String checkDept(String sdept){
	if (sdept.equalsIgnoreCase("ECE")==true)		return "ECE";
	else if (sdept.equalsIgnoreCase("EEE")==true) 	return "EEE";
	else if (sdept.equalsIgnoreCase("MECH")==true) 	return "Mech";
	else if (sdept.equalsIgnoreCase("IT")==true)	return "IT";
	else if (sdept.equalsIgnoreCase("CSE")==true)	return "CSE";
	else return null;
 }

static void  DeptDirectoryStdNameFile(Student s1,String dept) {

	File f2 = new File("F:\\Workspace\\JavaTraining\\FileEx\\StudentDirectory\\"+dept);
	f2.mkdir();
	try {
		FileOutputStream fos = new FileOutputStream("F:\\Workspace\\JavaTraining\\FileEx\\StudentDirectory\\"+dept+"\\"+s1.name+".txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		System.out.println("Succesfully created student file");
	}
	
}
}
