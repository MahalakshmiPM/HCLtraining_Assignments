package ThreadEx;

public class ThreadRunnable {
public static void main(String args[]) {
Thread1 t1 = new Thread1();
Thread2 t2 = new Thread2();
Runnable1 r1 = new Runnable1();
Thread tr1 = new Thread(r1);
Runnable2 r2 = new Runnable2();
Thread tr2 = new Thread(r2);
t1.start();
t2.start();
tr1.start();
tr2.start();

}
}

class Thread1 extends Thread{
	public void run() {
	for(int i=0;i<=25;i++) {
		System.out.println("Thread1 : "+i);
	}
	}
}

class Thread2 extends Thread{
	public void run() {
	for(int i=26;i<=50;i++) {
		System.out.println("Thread2 : "+i);		
	}
	walk();
	}
	void walk() {
		System.out.println("i am walking");// Service method
	}
}

class Runnable1 implements Runnable{
	
	public void run() {
		int a;
		for(int i=51;i<=75;i++) {
			System.out.println("Runnable1: "+i);
			//a=3/0;
		}
		
		}
}


class Runnable2 implements Runnable{
	
	public void run() {
		for(int i=75;i<=100;i++) {
			System.out.println("Runnable2: "+i);
		}
		}
}
