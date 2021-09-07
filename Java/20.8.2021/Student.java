package FileEx;

import java.io.Serializable;

public class Student implements Serializable{
	
	int sid;
	String name,dept;
	public Student(int sid, String name, String dept) {
		this.sid = sid;
		this.name = name;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", dept=" + dept + "]";
	}

	
	
}
