package CurdApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ManageBookDOA implements ManageBookDOAInter {

	@Override
	public Connection getConnection() {
		Connection con=null;
		try {
			Class.forName(driverclass);
			con=DriverManager.getConnection(jdbcurl, username, password);
					} catch (ClassNotFoundException  | SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	@Override
	public void insertbooks(ManageBooks m) {
		try(Connection con = getConnection()){
			String query= "insert into BookManagement values(?,?,?,?)";
			PreparedStatement ps= con.prepareStatement(query);
			ps.setInt(1,m.getBookId());
			ps.setString(2,m.getBookname());
			ps.setInt(3,m.getBorrowerId());
			ps.setString(4,m.getReturned());
			ps.executeUpdate();
		}catch(SQLException e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public ManageBooks selectbook(int id) {
		ManageBooks m=null;
		try(Connection con = getConnection()){
		String query ="select * from BookManagement where bookId=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1,id);
		ResultSet rs = ps.executeQuery();

		while(rs.next()) {
			m = new ManageBooks();
			m.setBookId(id);
			m.setBookname(rs.getString(2));
			m.setBorrowerId(rs.getInt(3));		
			m.setReturned(rs.getString(6));	
		}	
	}catch(SQLException e) 
	{
		e.printStackTrace();
	}
		return m;
	}

	@Override
	public List<ManageBooks> selectAllBooks() {
		ManageBooks m=null;
		List<ManageBooks> al=new ArrayList();
		try(Connection con = getConnection()){
		String query ="select * from BookManagement";
		PreparedStatement ps=con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();

		while(rs.next()) {
			m = new ManageBooks();
			m.setBookId(rs.getInt(1));
			m.setBookname(rs.getString(2));
			m.setBorrowerId(rs.getInt(3));
			m.setReturned(rs.getString(4));	
			al.add(m);
		}	
	}catch(SQLException e) 
	{
		e.printStackTrace();
	}
		return al;
	}

	@Override
	public boolean deleteBook(int id) {
		Boolean deleted =false;
		try(Connection con = getConnection()){
			String query ="delete from BookManagement where bookid=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, id);
			deleted= ps.executeUpdate()>0;
		}catch(Exception e)
		{
		e.printStackTrace();
		}
		return deleted;
	}

	@Override
	public boolean updateBook(ManageBooks m) {
		Boolean updated =false;
		try(Connection con = getConnection()){
			String query ="update BookManagement set bookname=?,borrowerId=?,returned=? where bookId=?";
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setString(1,m.getBookname());
			ps.setInt(2,m.getBorrowerId());
			ps.setString(3,m.getReturned());
			ps.setInt(4,m.getBookId());
			updated= ps.executeUpdate()>0;
	
		}catch(Exception e)
		{
		e.printStackTrace();
		}
		return updated;
	}

}
