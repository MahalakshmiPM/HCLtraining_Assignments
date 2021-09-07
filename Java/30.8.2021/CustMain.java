package LambdaPack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustMain {
	public static void main(String[] args) {
		ArrayList<cust> al= new ArrayList<cust>();
		al.add(new cust("Maha",11,7000));
		al.add(new cust("meera",16,6000));
		al.add(new cust("qqqq",12,4000));
		al.add(new cust("Sarvesh",13,5000));
		al.add(new cust("Lakshmi",14,2000));
		al.add(new cust("AAAA",15,3000));
		long total = al.stream().filter(
				o->((cust)o).amount>0).count();
		long result = al.stream().filter(
				o->((cust)o).amount>5000).count();
		System.out.println(result+" Customers purchased above Rs.5000");
		double high=0;
	cust c1 =null;
	for (int j = 0; j < total; j++) {
		cust c = (cust)al.get(j);
		if(c.amount>high)	{c1=c; high=c.amount;}}
	System.out.println(c1.name+" won the gift");	
	}	
}

