<%@ page language="java" import="java.sql.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String firstname=request.getParameter("fname");
String lastname=request.getParameter("lname");
String middlename=request.getParameter("mname");
String user=request.getParameter("uname");
String pass= request.getParameter("pwd");
Long mobile= Long.parseLong(request.getParameter("mob"));
String address= request.getParameter("address");

try {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url=application.getInitParameter("url");
	String username=application.getInitParameter("username");
	String password=application.getInitParameter("password");
	Connection con=DriverManager.getConnection(url, username, password);
	String query="insert into bankuser values(?,?,?,?,?,?,?)";
	PreparedStatement st = con.prepareStatement(query);	
	st.setString(1, firstname);
	st.setString(2, lastname);
	st.setString(3, middlename);
	st.setString(4, user);
	st.setString(5, pass);
	st.setLong(6, mobile);
	st.setString(7, address);
	int i=st.executeUpdate();	
	if(i>0)
	{
		 out.println("values got inserted ");
	}
	else
	{
		out.println("invalid username and password");
			
	}
	
	
	
} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
%>

</body>
</html>