package com.src;

public class BankManagementEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c = new Customer();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				c.withDraw(7000);				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				c.deposit(8000);				
			}
			
			
		});
		
		t1.start();
		t2.start();
	}

}

class Customer
{
	
int totalbal=4000;

synchronized void withDraw(int amt)
{
	if(totalbal < amt)
	{
		try {
			System.out.println("Balance not suffiient for Withtrawl........waiting for money to be deposited.....");
			wait();
			
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		totalbal-=amt;
		
		System.out.println("Amount withdrawn");
		


	}
	else
	{
		totalbal-=amt;
		System.out.println("Amount withdrawn");
	}

}

synchronized void deposit(int amt)
{
totalbal+=amt;
System.out.println("Amount deposited");
notify();
}
}
