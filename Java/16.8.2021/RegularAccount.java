package Others;

public class RegularAccount extends Banking {
String name;
double balance;
String pin;
static final double  min_balance = 500;
double panality;
double fee;

public RegularAccount(String name) {
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

this.panality=0;
if(this.balance<this.min_balance)
	this.panality=10;
fees();
}
@Override
void fees() {
	this.fee=this.balance*0.1;
}

@Override
public String toString() {
	return "RegularAccount [name=" + name + ", balance=" + balance + ", pin=" + pin + ", min_balance=" + min_balance
			+ ", panality=" + panality + "]";
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