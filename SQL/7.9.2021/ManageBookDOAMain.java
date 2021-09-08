package CurdApplication;

import java.util.List;
import java.util.Scanner;

public class ManageBookDOAMain {

	public static void main(String[] args) {
		int choice;
		
		Scanner inp= new Scanner(System.in);
		
		do {
		System.out.println("..............Welcome..........");
		System.out.println("Enter below choices");
		System.out.println("1.AddBooks  2.GetBook  3.AllBooksDetail 4.DeleteBook 5.UpdateBook   6.Exit");
		choice=inp.nextInt();
		
		ManageBookDOAInter mbdao= new ManageBookDOA();
		switch(choice) {
		case 1:{
			ManageBooks m=new ManageBooks();
			System.out.println("Enter BookId,BookName,BorrowerId,returned");
			m.setBookId(inp.nextInt());
			inp.nextLine();
			m.setBookname(inp.nextLine());
			m.setBorrowerId(inp.nextInt());
			inp.nextLine();
			m.setReturned(inp.nextLine());
			mbdao.insertbooks(m);
			System.out.println("Book is  Successfully  inserted");
			break;
		}
		case 2:{
			System.out.println("Enter Book ID");
			int id=inp.nextInt();
			ManageBooks m=mbdao.selectbook(id);
			if(m!=null) {System.out.println("Book selected Successfully");
			System.out.println(m);
			//System.out.println(m.getBookId()+" | "+m.getBookname()+" | "+m.getBorrowerId()+" | "+m.getReturned());
			}
			else System.out.println("Book not selected/found");
			break;
			}
		case 3:{
			List <ManageBooks> l=mbdao.selectAllBooks();
			System.out.println("All Books selected Successfully");
			l.stream().forEach(System.out::println); 
			break;
			}
		case 4:{
			System.out.println("Enter BookId");
			int id=inp.nextInt();
			boolean temp=mbdao.deleteBook(id);
			if(temp==true) System.out.println("book deleted successfully");
			else System.out.println("book not deleted/found");
			break;
			}
		case 5:{
			ManageBooks m=new ManageBooks();
			System.out.println("Enter BookId,BookName,BorrowerId,returned");
			m.setBookId(inp.nextInt());
			inp.nextLine();
			m.setBookname(inp.nextLine());
			m.setBorrowerId(inp.nextInt());
			inp.nextLine();
			m.setReturned(inp.nextLine());
			mbdao.updateBook(m);
			System.out.println("Book updated Successfully");
			break;	
		}
		
		
		}}while(choice!=6);
	}}
