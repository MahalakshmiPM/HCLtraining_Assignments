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
	String query="select * from bankaccount where id=?" ;
	PreparedStatement st = con.prepareStatement(query);	
	st.setInt(1,accountid);

	ResultSet rs=st.executeQuery();	
	if(rs.next())
	{%> 
	        	<!--if we use normal input type <input type="text" name="acctype" value="rs.getString(2)"> -->
	<form action="changeaccount.jsp?ID="/>
	Account Type:
	<select name="acctype">
	         <%
 			String already=rs.getString(2);
			if(already.equals("Savings Account")){
	  		  %>	<option value="Savings Account" selected>Savings Account</option>
					<option value="Trading Account">Trading Account</option>
					<option value="Salary Account">Salary Account</option>
					<option value="Business Account">Business Account</option>	
			<%}if(already.equals("Trading Account")){
			 %>		<option value="Savings Account" >Savings Account</option>
					<option value="Trading Account" selected>Trading Account</option>
					<option value="Salary Account">Salary Account</option>
					<option value="Business Account">Business Account</option>	
			<%}if(already.equals("Salary Account")){
			 %>		<option value="Savings Account" >Savings Account</option>
					<option value="Trading Account" >Trading Account</option>
					<option value="Salary Account" selected>Salary Account</option>
					<option value="Business Account">Business Account</option>	
			<%}if(already.equals("Business Account")){
			 %>		<option value="Savings Account" >Savings Account</option>
					<option value="Trading Account" >Trading Account</option>
					<option value="Salary Account" >Salary Account</option>
					<option value="Business Account" selected>Business Account</option>	
			<%} %>
	</select>
	<input type="hidden" value="<%=accountid%>" name="ID"/>
	<input type="hidden" value="<%=session.getAttribute("user")%>" name="accuser"/>
	<input type="submit" value="confirm changes"/>
	</form><%
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