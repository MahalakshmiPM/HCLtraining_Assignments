package CurdApplication;

import java.sql.Connection;
import java.util.List;

public interface ManageBookDOAInter {
	public static final String jdbcurl=("jdbc:mysql://localhost:3306/personaldb");
	public static final String driverclass="com.mysql.cj.jdbc.Driver";
	public static final String username="Mahalakshmi";
	public static final String password="9442169769";
	Connection getConnection();
	void insertbooks(ManageBooks m);
	ManageBooks selectbook(int id);
	List<ManageBooks> selectAllBooks();
	boolean deleteBook(int id);
	boolean updateBook(ManageBooks m);
}
