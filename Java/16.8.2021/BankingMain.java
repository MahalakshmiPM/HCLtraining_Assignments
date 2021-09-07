package Others;
import java.util.Scanner;
public class BankingMain {

	public static void main(String[] args) {
		boolean pinCheck;
		String pin;
		int menu,choice;
		double deposit;
		Scanner inp= new Scanner(System.in); 
		Banking a = null;		
		
		System.out.println("Enter Name ");
		String name=inp.nextLine();	
		System.out.println("Hi "+name);
		System.out.println("Enter the type of account");
		System.out.println("1.Regular account\n2.Interest Account\n3.Checking Account\n4.CD Account\n");
		menu=inp.nextInt();
			switch(menu)
			{
			case 1:
				a=new RegularAccount(name);
				a.checkPinValidity();			
				System.out.println("Enter depodit amount(minimum 500 else 10 rupees panality)"); 
				deposit=inp.nextDouble();
				a.create(deposit);
				System.out.println(a);
				break;
			case 2:
				a=new InterestAccount(name);
				a.checkPinValidity();
				System.out.println("Enter deposit amount"); 
				deposit=inp.nextDouble();
				a.create(deposit);
				System.out.println(a);
				break;
			case 3:
				a=new CheckingAccount(name);
				a.checkPinValidity();			
				System.out.println("Enter depodit amount(minimum 100 else 10 rupees panality)"); 
				deposit=inp.nextDouble();
				a.create(deposit);
				System.out.println(a);
				break;
			case 4:
				a=new CdAccount(name);
				a.checkPinValidity();
				System.out.println("Enter deposit amount"); 
				deposit=inp.nextDouble();
				a.create(deposit);
				System.out.println(a);
				break;
			}
		do {	
			System.out.println("Enter your choice");
			System.out.println("1.withdraw  2.deposit  3.continue transaction  0.exit");
			choice=inp.nextInt();
			switch(choice) {
			case 1:
			System.out.println("Enter amount to be withdrawn");
			a.withdraw(inp.nextDouble());
			System.out.println(a);
			break;
			case 2:
				System.out.println("Enter amount to be deposited");
				a.Deposit(inp.nextDouble());
				System.out.println(a);
			break;
			}
		}while(choice!=0);
		
	
	}
}