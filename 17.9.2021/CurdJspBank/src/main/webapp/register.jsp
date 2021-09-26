<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="database.jsp">
<table >
<tr>
	<td> enter your firstname : </td>
	<td><input type="text" name="fname"></td>
</tr>

<tr>
	<td> enter your lastname : </td>
	<td><input type="text" name="lname"></td>
</tr>

<tr>
	<td> enter your middlename : </td>
	<td><input type="text" name="mname"></td>
</tr>

<tr>
	<td> enter your username : </td>
	<td><input type="text" name="uname"></td>
</tr>

<tr>
	<td> enter your password : </td>
	<td><input type="password" name="pwd"></td>
</tr>

<tr>
	<td> enter your mobile number : </td>
	<td><input type="text" name="mob"></td>
</tr>

<tr>
	<td> enter your address : </td>
	<td><textarea rows="5" cols="30" name="address"></textarea></td>
</tr>

<tr>
	<td><input type="submit" value="register"></td>
	<td><input type="reset"></td>
</tr>

</table>
</form>

</body>
</html>