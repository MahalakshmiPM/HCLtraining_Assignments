package LambdaPack;

public class cust {
  String name;
  int cid;
  int amount;
  
public cust(String name, int cid, int amount) {
	super();
	this.name = name;
	this.cid = cid;
	this.amount = amount;
	}
  
   @Override
public String toString() {
     return "cust [name=" + name + ", cid="+ cid + ", amount=" + amount + "]";
     }
}
