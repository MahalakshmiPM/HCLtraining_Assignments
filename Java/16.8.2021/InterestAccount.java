package Others;

public class InterestAccount extends Banking {
	String name;
	double balance;
	String pin;
	double interest;
	double fee;
	
	public InterestAccount(String name) {
		this.name = name;	
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
	this.interest=this.balance*0.7;	
	}
	
	String checkPinValidity(){
		String pin = super.checkPinValidity();
		this.pin=pin;
		return pin;
	}

	@Override
	public String toString() {
		return "InterestAccount [name=" + name + ", balance=" + balance + ", pin=" + pin + ", interest=" + interest
				+ ", fee=" + fee + "]";
	}
	
	void withdraw(double withdraw){
		this.balance=this.balance-withdraw;
		System.out.println("Amount withdrawn :"+withdraw);
		System.out.println("Balance :"+this.balance);
	}


	void Deposit(double deposit){
		this.balance=this.balance+deposit;
		System.out.println("Amount deposited :"+deposit);
		System.out.println("Balance :"+this.balance);
		}
	
	}

