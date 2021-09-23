package SpringJdbcMain;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringJdbcDAO.EmployeeDAO;
import SpringJdbcModel.EmployeeBean;

public class EmployeeMain {
	public static void main(String[] args) {
	int choice,status;
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	EmployeeDAO dao= (EmployeeDAO) context.getBean("employeeDAObeanID");
	
	Scanner inp = new Scanner(System.in);
	System.out.println();
	
	do {
	System.out.println("Enter : 1.insert  2.update 3.delete 4.print1  5.print2  0.exit");
	choice=inp.nextInt();
	switch(choice){
	case 1:{
		status = dao.insertEmplyee(new EmployeeBean(57358,"Mahalakshmi","TN",30000));
		if(status>0)
		{
			System.out.println("employee inserted successfully");
			System.out.println();
		}
		else
			System.out.println("employee not inserted");
			System.out.println();
			break;}
	case 2:{
		 status = dao.updateEmployee(new EmployeeBean(57358,"Mahalakshmi.P.M","Tamin Nadu",50000));
		if(status>0)
		{
			System.out.println("values updated successfully");
			System.out.println();
		}
		else
			System.out.println("values not updated");
		    System.out.println();
		    break;}
	case 3:{
		status = dao.deleteEmployee(new EmployeeBean(57358));
		if(status>0)
		{
			System.out.println("Employee deleted successfully");
			System.out.println();
		}
		else
			System.out.println("Employee not deleted");
			System.out.println();
			break;}
	case 4:{
		List<EmployeeBean> printstatus1 = dao.displayAllEmployees1();
		if(printstatus1!=null)
		{
			System.out.println(printstatus1);
			System.out.println();
		}
		else
			System.out.println("Employees not printed");
			System.out.println();
			break;}
	case 5:{
		List<EmployeeBean> printstatus2 = dao.displayAllEmployees2();
		if(printstatus2!=null)
		{
			System.out.println(printstatus2);
			System.out.println();
		}
		else
			System.out.println("Employees not printed");
			System.out.println();
			break;}
	}
	}while(choice!=0);
	
}	
}
