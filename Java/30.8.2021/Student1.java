package LambdaPack;

public class Student1 implements Comparable{
	String name;
	int id;
	String address;
	double mat;
	double sci;
	double soc;
	int len;
	public Student1(String name, int id, String address, double mat, double sci, double soc) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.mat = mat;
		this.sci = sci;
		this.soc = soc;
	}
double getTotal() {
	return mat+sci+soc;}	
double getAvg() {
	return ((mat+sci+soc)/3);}
int getLength() {return name.length();}

@Override
public String toString() {
	return "Student1 [name=" + name + ", id=" + id + ", address=" + address + ", mat=" + mat + ", sci=" + sci + ", soc="
			+ soc + ", getTotal()=" + getTotal() + ", getAvg()=" + getAvg() + "]";
}
@Override
public int compareTo(Object o) {
	Student1 s = (Student1)o;
	if(this.getTotal()>s.getTotal() || (this.getTotal()==s.getTotal() && this.mat<s.mat))
	{
	return 1;	
	}
	else 
	{
	return -1;	
	}
}

}


