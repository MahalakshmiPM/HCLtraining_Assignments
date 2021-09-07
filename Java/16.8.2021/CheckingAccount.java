package Others;

public class CheckingAccount extends Banking{
	String name;
	double balance;
	String pin;
	double interest;
	static final double  min_balance=100;
	double panality;
	int transactions;
	double fee;
	public CheckingAccount(String name) {
		this.name = name;
		this.transactions=0;
	}
	
	String checkPinValidity(){
		String pin = super.checkPinValidity();
		this.pin=pin;
		return pin;
	}
	
	@Override
	void create(double deposit) {
		this.balance=deposit;
	this.panality=0;
	if(this.balance<this.min_balance)
		this.panality=10;
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
	@Override 
	void Deposit(double deposit){
		this.balance=this.balance+deposit;
		System.out.println("Amount deposited : "+deposit);
        this.transactions++;
        this.balance-=0.10;
        System.out.println("Total balance after Transaction : "+this.balance+"(0.10 is deducted for every transaction)");
        }
	
	void withdraw(double withdraw){
		this.balance=this.balance-withdraw;
		System.out.println("Amount withdrawn : "+withdraw);
        this.transactions++;
        this.balance-=0.10;
        System.out.println("Total balance after Transaction : "+this.balance+"(0.10 is deducted for every transaction)");
	}

	@Override
	public String toString() {
		return "CheckingAccount [name=" + name + ", balance=" + balance + ", pin=" + pin + ", interest=" + interest
				+ ", panality=" + panality + ", transactions=" + transactions + ", fee=" + fee + "]";
	}
	}

