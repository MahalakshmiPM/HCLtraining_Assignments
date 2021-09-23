package SpringJdbcModel;

public class EmployeeBean {
private int eid;
private String ename;
private String eaddress;
private long esalary;

@Override
public String toString() {
	return "EmployeeBean [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", esalary=" + esalary + "]";
}

public EmployeeBean(int eid) {
	super();
	this.eid = eid;
}

public EmployeeBean(int eid, String ename, String eaddress, long esalary) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.eaddress = eaddress;
	this.esalary = esalary;
}

public EmployeeBean() {
	super();
	// TODO Auto-generated constructor stub
}

public int geteid() {
	return eid;
}
public void seteid(int eid) {
	this.eid = eid;
}
public String getename() {
	return ename;
}
public void setename(String ename) {
	this.ename = ename;
}
public String geteaddress() {
	return eaddress;
}
public void seteaddress(String eaddress) {
	this.eaddress = eaddress;
}
public long getesalary() {
	return esalary;
}
public void setesalary(long esalary) {
	this.esalary = esalary;
}




}
