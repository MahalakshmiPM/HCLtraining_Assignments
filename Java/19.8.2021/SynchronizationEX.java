package ThreadEx;

public class SynchronizationEX {

	public static void main(String[] args) {
		SynchronizationEX se = new SynchronizationEX();
		Thread t1 = new Thread( new Runnable() {
public void run() {
	se.DispTable(5);
}}
				); 
		Thread t2 = new Thread( new Runnable() {
			public void run() {
				se.DispTable(7);
			}}
							); 

t1.start();
t2.start();
	}
	
	synchronized void DispTable(int n) {
	for (int i = 1; i <=10; i++) {
		System.out.println(n+" * "+i+" = "+(n*i));
			
	}	
	}
	}


