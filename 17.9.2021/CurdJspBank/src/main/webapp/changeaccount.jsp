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
int accountid=Integer.parseInt(request.getParameter("ID"));
String accounttype=request.getParameter("acctype");

try {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url=application.getInitParameter("url");
	String username=application.getInitParameter("username");
	String password=application.getInitParameter("password");
	Connection con=DriverManager.getConnection(url, username, password);
	String query="update bankaccount set type=? where id=?";
	PreparedStatement st = con.prepareStatement(query);	
	st.setString(1,accounttype);
	st.setInt(2,accountid);
	int i=st.executeUpdate();	
	if(i>0)
	{

response.sendRedirect("login.jsp?uname="+session.getAttribute("user")+"&pwd="+session.getAttribute("password"));
	}
	else
	{
		out.println("account cannot be created");
			
	}
	
	
	
} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
%>


</body>
</html>