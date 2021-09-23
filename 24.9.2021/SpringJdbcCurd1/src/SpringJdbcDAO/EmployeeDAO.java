package SpringJdbcDAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import SpringJdbcModel.EmployeeBean;


public class EmployeeDAO implements EmployeeDAOInter{

private JdbcTemplate jdbctemp;
	
	public void setJdbctemp(JdbcTemplate jdbctemp) {
	this.jdbctemp = jdbctemp;
	}

	@Override
	public int insertEmplyee(EmployeeBean e) {
		String query="insert into employee values("+e.geteid()+",'"+e.getename() +"','"+ e.geteaddress() +"',"+e.getesalary()+")";
		return jdbctemp.update(query) ;
	}

	@Override
	public int updateEmployee(EmployeeBean e) {
		String query="update employee set empname='"+e.getename()+"',empaddress='"+e.geteaddress()+"',empsalary="+e.getesalary()+" where empid="+e.geteid();
		return jdbctemp.update(query) ;
	}

	@Override
	public int deleteEmployee(EmployeeBean e) {
		String query="delete from employee where empid="+e.geteid();
		return jdbctemp.update(query) ;
	}

	@Override
	public List<EmployeeBean> displayAllEmployees1() {
		return jdbctemp.query("select * from employee",new RowMapper<EmployeeBean>() {
			   public EmployeeBean mapRow(ResultSet rs,int row) throws SQLException {
				EmployeeBean e = new EmployeeBean();
				e.seteid(rs.getInt(1));
				e.setename(rs.getString(2));
				e.seteaddress(rs.getString(3));
				e.setesalary (rs.getLong(4));
				return e;
				}
			});
	}

	@Override
	public List<EmployeeBean> displayAllEmployees2() {
		return jdbctemp.query("select * from employee",(rs,row)-> {
				EmployeeBean e = new EmployeeBean();
				e.seteid(rs.getInt(1));
				e.setename(rs.getString(2));
				e.seteaddress(rs.getString(3));
				e.setesalary (rs.getLong(4));
				return e;
				});
	}
}
