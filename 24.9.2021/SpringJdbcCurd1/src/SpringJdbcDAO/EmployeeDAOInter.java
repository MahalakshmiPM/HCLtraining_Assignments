package SpringJdbcDAO;

import java.util.List;

import SpringJdbcModel.EmployeeBean;

public interface EmployeeDAOInter {
	public int insertEmplyee(EmployeeBean b);
	public int updateEmployee(EmployeeBean b);
	public int deleteEmployee(EmployeeBean b);
	public List<EmployeeBean> displayAllEmployees1();
	public List<EmployeeBean> displayAllEmployees2();
}
