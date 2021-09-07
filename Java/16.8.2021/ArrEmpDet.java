import java.util.Scanner;
 class Employee{
	static int total=-1;
	int sapId;
	String name,place,doj;
	double experience,salary;

	Employee(int SapId,String name,String place,double experience,String doj){	
	this.sapId=SapId;
	this.name=name;
	this.place=place;
	this.experience=experience;
	this.doj=doj;
	}
	void salaryCal()
	{
	if(experience<2) {salary=25000;}
	else if(experience>=2 && experience<4) {salary=40000;}
	else if(experience>=4 && experience<6) {salary=60000;}
	else {salary=70000;}
	}

	void display() {
		System.out.println("\nSapId : "+sapId+"\nName : "+name+"\nPlace : "+place+"\nExperience : "+experience+"\nDOJ : "+doj+"\nSalary : "+salary+" INR\n");
	}
}
public class ArrEmpDet {
	int sap;
	String name,place,doj;
	double exp;
	Scanner inp=new Scanner(System.in);
	public static void main(String args[])
	{	
		int n=50;
		ArrEmpDet o=new  ArrEmpDet();
		Scanner inp=new Scanner(System.in);
		
		Employee e[]=new Employee[n];
		
		int choice;

do {
System.out.println("enter below choices");
System.out.println("1.Add Employee\n2.Delete Employee\n3.Edit\n4.Display\n5.exit");
switch(choice=inp.nextInt()) {
	case 1:
		int i=++Employee.total;
		o.add();
		e[i]=new Employee(o.sap ,o.name,o.place,o.exp,o.doj);
		e[i].salaryCal();
		break;
	case 2:
		System.out.println("Enter SAP ID : ");
		int tempsap=inp.nextInt();	
		o.delete(e,tempsap);
        break;
        
	case 3:
		int tem=0;
		System.out.println("Enter SAP ID : ");
		int b=inp.nextInt();	
         for(Employee j:e){
        	 if(j==null) continue;
        	 if(j.sapId==b) {
        		 o.edit(j);
        		 tem++;
        		 break;
        	 	}
         	}
         if(tem==0) System.out.println("Employee not found");
         System.out.println();
        break;
	case 4:
		o.display(e);
		break;
	case 5:
		break;
    default:
    	{System.out.println("Enter valid Choice");
    	break;}
    }

}while(choice!=5);
}

void delete(Employee e[],int tempsap)	{
	int i,j,q,temp=0;
	for(q=0;q<=Employee.total;q++) {
		if(e[q].sapId==tempsap) {
			for(i=q,j=i+1;i<Employee.total;i++,j++) {
				e[i].sapId=e[j].sapId;
				e[i].name=e[j].name;
				e[i].place=e[j].place;
				e[i].doj=e[j].doj;
				e[i].experience=e[j].experience;
				e[i].salary=e[j].salary;
				}
			e[i].sapId=0;
			e[i].name=null;
			e[i].doj=null;
			e[i].experience=0.00;
			e[i].place=null;
			e[i].salary=0.00;
			Employee.total--;
                        temp++;
			System.out.println("successfully deleted");
			}}
		if(temp==0)
			System.out.println("Employee not found");
	
    
  
}
	void edit(Employee j){
		int choice;
		again:
		 do {
    		 System.out.println("Enter below choices to edit");
    		 System.out.println("1.Name\t2.Place\t3.Experience\4.Main Menu");
    		 choice=inp.nextInt();
    		 switch(choice) {
    		 case 1:
    			 System.out.println("Enter new name");
    			 inp.nextLine();
    			 String name=inp.nextLine();
    			 j.name=name;
    			 System.out.println("Changes made successfully");
    			 break;
    		 case 2:
    			 System.out.println("Enter new place");
    			 inp.nextLine();
    			 String place=inp.nextLine();
    			 j.place=place;
    			 System.out.println("Changes made successfully");
    			 break;
    		 case 3:
    			 System.out.println("Enter experience in Yrs");
    			 double exp=inp.nextDouble();
    			 j.experience=exp;
    			 j.salaryCal();
    			 System.out.println("Changes made successfully");
    			 break;
    		 case 4:
    			return;
    		 default:{
    			System.out.println("Invalid Choice");
    			continue again;
    				}
    		 }
    		 
    		 }while(choice>0);
	}
	void add(){
	
		System.out.print("Enter SAP ID : ");
		sap=inp.nextInt();
		System.out.print("Enter name : ");
		inp.nextLine();
		name=inp.nextLine();
		System.out.print("Enter place : ");
		place=inp.nextLine();
		System.out.print("Enter Experience : ");
		exp=inp.nextDouble();
		System.out.print("Enter DoJ : ");	
		inp.nextLine();
		doj=inp.nextLine();	
	}
	
void display(Employee e[]) {
	int choice;
back:
	do{
	System.out.println("\nEnter your choice");
	System.out.println("1.All Employee Details\t2.Specific Employee Detil\n3.Main Menu");
	choice=inp.nextInt();
	switch(choice) {
	case 1:
		int count=0;
		System.out.println("---------------------------------");
		System.out.println("  Total number of employee : "+(Employee.total+1));
		for(int i=0;i<=Employee.total;i++) {
			System.out.print("----------Employee "+(++count)+"----------");
			e[i].display();
			}
		break;
	case 2:
		int tem=0;
		System.out.println("Enter SAP ID : ");
		int sid=inp.nextInt();	
         for(Employee j:e){
        	 if(j.sapId==sid) {
        		j.display();
        		tem++;
        		 break;
        	 	}
         	}
         if(tem==0) System.out.println("Employee not found");
         break;
	case 3:
		return;
	default:
		System.out.println("Invalid choice");
		continue back;
			}
	}while(choice>0);
	}
}
