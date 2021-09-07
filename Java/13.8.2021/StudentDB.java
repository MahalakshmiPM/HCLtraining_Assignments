/*write a program to accept student details like 
 * name, rollno, age, math, phy, chem. find out total and average of student. 
 * based on average give grade >75-A,>65&<=75-B,>35&<=65-C,<=35-D using methods.*/


import java.util.Scanner;
class Student{
	int rollno,age,math,phy,chem,avg,total;
	char grade;
	String name;
Student(String name,int rollno,int age,int math,int phy,int chem){
	this.rollno=rollno;
	this.name=name;
	this.age=age;
	this.math=math;
	this.phy=phy;
	this.chem=chem;}
void average(){
	total=math+phy+chem;
	avg=total/3;
	}
void grade() {
	if(avg>75)
		grade= 'A';
	else if(avg<=75 && avg>65)
		grade = 'B';
	else if(avg<=65 && avg>35)
		grade = 'C';
	else 
		grade = 'D';
}
void display() {
	System.out.println("-----------------------------");
System.out.println("Name : "+name+"\nRollno : "+rollno+"\nage : "+age+"\nmath : "+"\nphy : "+phy+"\nchem : "+chem);
System.out.println("------------");
System.out.println("Total : "+total+"\nAverage : "+avg+"\nGrade : "+grade);
	System.out.println("-----------------------------");
}
}
public class StudentDB {
	String name;
	int rollno,age,math,phy,chem;
	void getinput()
	{
		Scanner inp=new Scanner (System.in);	
		System.out.println("Enter Name");
		name=inp.nextLine();
		System.out.println("Enter Roll Number");
		rollno=inp.nextInt();
		System.out.println("Enter Age");
		age=inp.nextInt();
		System.out.println("Enter Maths Mark");
		math=inp.nextInt();
		System.out.println("Enter Physics Mark");
		phy=inp.nextInt();
		System.out.println("Enter Chemistry Mark");
		chem=inp.nextInt();
	}
	public static void main(String args[])
	{
		    StudentDB s=new StudentDB();
		    s.getinput();
		 	Student s1=new Student(s.name,s.rollno,s.age,s.math,s.phy,s.chem);
			s1.average();
			s1.grade();
			s1.display();
	}
}
