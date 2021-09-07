/*write a program for car racing game, 8 cars which start at same point, 
 * randomly any car can win, but in middle information like who reached 
 * petrol pump , pitstop point first should be intimated*/

package ThreadEx;

public class CarRacing {

	public static void main(String[] args) {
		
	                          	         //Normal Method 
		Car c = new Car();
		Thread t1 = new Thread( new Runnable() {
												public void run() {	
													c.racing();}
												}
								);
                                       	//  using non static method
		CarRacing o = new CarRacing();
		Thread t2 = o.CreateThreadNonStaticMeth();
		                                //  Using Static Method 
		Thread t3 = CreateThreadStaticMeth();
		Thread t4 = CreateThreadStaticMeth();
		Thread t5 = CreateThreadStaticMeth();
		Thread t6 = CreateThreadStaticMeth();
		Thread t7 = CreateThreadStaticMeth();
		Thread t8 = CreateThreadStaticMeth();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
	}	
	
Thread CreateThreadNonStaticMeth()//Thread is return type
{		
	Car c = new Car();
	Thread t = new Thread(new Runnable(){
					 public void run(){	
				   		   c.racing();}
					    				}
							 );
		return t;
}
	
	
	
static Thread CreateThreadStaticMeth() //Return Type is Thread
{
	Car c = new Car();
	return (new Thread(new Runnable(){
				 public void run() {c.racing();
				                   }}
					 )
			);
}
}

class Car{ 
	static int check=1;	
void racing() {
	String ThreadName=Thread.currentThread().getName();
for (int i = 0; i <= 100; i++) {
	System.out.println(ThreadName+" : "+i);
	if(i==25 && check==1)	
		{check++;System.out.println(ThreadName+": Reached Petrol pump First");}
	if(i==50 && check==2)	
		{check++;System.out.println(ThreadName+": ...Reached Half Lap First...");}
	if(i==75 && check==3)	
		{check++;System.out.println(ThreadName+": Reached Pit Stop First");}
	if(i==100 && check==4)	
		{check++;System.out.println(ThreadName+": ....WINNER....Lap completed ....");break;}
	if(i==100 && check==5)	
		{check++;System.out.println(ThreadName+": ....RUNNER....Lap completed.....");break;}
}
}	
}