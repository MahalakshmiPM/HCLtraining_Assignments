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

String accounttype=request.getParameter("acctype");
String accountuser=request.getParameter("accuser");


try {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url=application.getInitParameter("url");
	String username=application.getInitParameter("username");
	String password=application.getInitParameter("password");
	Connection con=DriverManager.getConnection(url, username, password);
	String query="insert into bankaccount (type,bank_user)values(?,?)";
	PreparedStatement st = con.prepareStatement(query);	
	st.setString(1,accounttype);
	st.setString(2,accountuser);
	int i=st.executeUpdate();	
	if(i>0)
	{

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