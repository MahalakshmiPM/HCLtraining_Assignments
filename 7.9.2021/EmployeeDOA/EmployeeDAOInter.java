package CurdApplication;

import java.sql.Connection;
import java.util.List;

import Employee.Employee;

public interface EmployeeDAOInter {
	
	public static final String jdbcurl="jdbc:mysql://localhost:3306/personaldb";
	public static final String driverclass="com.mysql.cj.jdbc.Driver";
	public static final String username="Mahalakshmi";
	public static final String password="9442169769";
	
	Connection getConnection();
	void insertEmployee(Employee e);
	Employee selectEmployee(int id);
	List<Employee> selectAllEmployee();
	boolean deleteEmployee(int id);
	boolean updateEmployee(Employee e);

}