package Others;
public class Employee {
    int eid;
    String ename;
    String eplace;    
    
   public Employee(int eid, String ename, String eplace) {
    this.eid = eid;
    this.ename = ename;
    this.eplace = eplace;
    }

@Override
public int hashCode() {
	return eid;}

@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", eplace=" + eplace + "]";
}

@Override
protected Object clone() throws CloneNotSupportedException {
    Employee e=new Employee(eid,ename,eplace);        
    e.eid=this.eid;
    e.ename=this.ename;
    e.eplace=this.eplace;
    return e;
    }
@Override
protected void finalize() throws Throwable {
        System.out.println("I am being  deleted......Bye...Bye...");
}
@Override
public boolean equals(Object obj) {   
    Employee e=(Employee)obj;
    return this.eid==e.eid;
}
}

