<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="insertaccount.jsp">
Account Type : <select name="acctype">
<option>Select</option>
<option value="Savings Account">Savings Account</option>
<option value="Trading Account">Trading Account</option>
<option value="Salary Account">Salary Account</option>
<option value="Business Account">Business Account</option>
</select>
<input type="hidden" value="<%=session.getAttribute("user")%>" name="accuser"/>
<input type="submit" value="create account"/>
</form>

</body>
</html>