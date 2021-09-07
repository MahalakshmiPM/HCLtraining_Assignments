package Others;

public class EmployeeMain {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employee e1 = new Employee(111,"Maha","dindigul");
		System.out.println(e1.getClass());
		System.out.println(e1.hashCode());
		
		Employee e2 = new Employee(222,"Lakshmi","Chennai");
		System.out.println(e2.hashCode());
		
		System.out.println(e1);
		System.out.println(e2); 
		
		Employee e3 = e1;
		System.out.println(e3);
		e3.eid=420;
		System.out.println(e1);
		System.out.println(e3);
	        Employee e4 = (Employee) e2.clone();
		System.out.println(e2);
		System.out.println(e4);
				
		e4.eid = 55;
		System.out.println(e2);
		System.out.println(e4);

		//e4=null;
		System.gc();	
		System.out.println(e4);
		
		System.out.println(e1==e3);
		System.out.println(e2==e4)
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e1.equals(e3));
		System.out.println(e2.equals(e4));
	}
}
