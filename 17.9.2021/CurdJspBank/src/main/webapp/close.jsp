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
String accountuser=(String)session.getAttribute("user");
try {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url=application.getInitParameter("url");
	String username=application.getInitParameter("username");
	String password=application.getInitParameter("password");
	Connection con=DriverManager.getConnection(url, username, password);
	String query="delete from bankaccount where id=? and bank_user=?";
	PreparedStatement st = con.prepareStatement(query);	
	st.setInt(1,accountid);
	st.setString(2,accountuser);
	int i=st.executeUpdate();	
	if(i>0)
	{
		out.println(request.getParameter("acctype"));
		 response.sendRedirect("login.jsp?uname="+accountuser+"&pwd="+session.getAttribute("password"));
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