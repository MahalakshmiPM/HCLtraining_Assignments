/*write a program to accept a day as a string and print the result.*/

import java.util.Scanner;
public class MenuDay {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
        System.out.println("Entey your choice of Day");
        String choice=inp.next();
        switch (choice){
        	case "Monday" : System.out.println("Welcome to Monday");break;
        	case "Tuesday":System.out.println("Welcome to Tuesday");break;
        	case "Wednesday": System.out.println("Welcome to Wednesday");break;
        	case "Thursday": System.out.println("Welcome to Thursday");break;
        	case "Friday": System.out.println("Welcome to Friday");break;
        	case "Saturday": System.out.println("Welcome to Saturday");break;
        	case "Sunday": System.out.println("Welcome to Sunday");break;
        	default:System.out.println("InValid Day");
        	}
}
	
}