package Others;

public class CdAccount extends Banking{
	String name;
	double balance;
	String pin;
	double interest;
	double panality;
	double fee;
	int months;
	public CdAccount(String name) {

		this.name = name;
	}
	
	String checkPinValidity(){
		String pin = super.checkPinValidity();
		this.pin=pin;
		return pin;
	}
	
	@Override
	void create(double deposit) {
		this.balance=deposit;
	fees();
	interest();
	}

	@Override
	void fees() {
		this.fee=this.balance*0.1;
		
	}
	
	void interest() {
	this.interest=this.balance*0.15;	
	}
	
	void withdraw(double withdraw){
		this.balance=this.balance-withdraw;
		System.out.println("Amount withdrawn :"+withdraw);
		System.out.println("enter month in number from account creation");
		this.months=inp.nextInt();
		if(this.months<=12) this.panality=this.balance*0.2;
	}

	void Deposit(double deposit){
		this.balance=this.balance+deposit;
		System.out.println("Amount deposited :"+deposit);
		System.out.println("enter month in number from account creation");
		this.months=inp.nextInt();
		if(this.months<=12) this.panality=this.balance*0.2;
		}
	
	@Override
	public String toString() {
		return "CdAccount [name=" + name + ", balance=" + balance + ", pin=" + pin + ", interest=" + interest
				+ ", panality=" + panality + ", fee=" + fee + ", months=" + months + "]";
	}
	
	
}


