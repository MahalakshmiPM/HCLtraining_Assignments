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

String user=request.getParameter("uname");
String pass= request.getParameter("pwd");


try {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url=application.getInitParameter("url");
	String username=application.getInitParameter("username");
	String password=application.getInitParameter("password");
	Connection con=DriverManager.getConnection(url, username, password);
	String query="select * from bankuser where user=? and pass=? ";
	PreparedStatement st = con.prepareStatement(query);	

	st.setString(1, user);
	st.setString(2, pass);

	ResultSet rs = st.executeQuery();

	if(rs.next())
	{
		 out.println("welcome To "+user);
		 String qwe="select * from bankaccount where bank_user=?";
			PreparedStatement st1 = con.prepareStatement(qwe);	
			st1.setString(1,user);
			ResultSet rs1 = st1.executeQuery();
			
			session.setAttribute("user",user);
			session.setAttribute("password",pass);
			
								%>	
									<table border="1"  height="100">
										<tr>
											<th>Account ID</th>
											<th>Account Type</th>
											<th colspan="2"><a href="openaccount.jsp">Open New Account</a></th>
										</tr>
								<%	
		     while(rs1.next())
		     {
		
		    	 %>
		    		<tr>
		    			<td align="center"><%=rs1.getInt(1) %></td>
		    			<td align="center"><%=rs1.getString(2) %></td>
		    			<td align="center"><a href="close.jsp?ID=<%=rs1.getInt(1) %>">Close account</a></td>
		    			<td align="center"><a href="change.jsp?ID=<%=rs1.getInt(1) %>">Change account</a></td>
		    		</tr>
		    		
		    		
		    	<%
	
		     }
	
	}
	else
	{
		String message="invalid user or password";
		response.sendRedirect("index.jsp?msg="+message);
			
	}
	
	
	
} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
%>

</body>
</html>