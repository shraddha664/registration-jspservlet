<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<form action="<%= request.getContextPath()%>/register" method="post">
<h1>Employee register form</h1>
<table style="width:80%">

<tr>
<td>Id</td>
<td><input type="number" name="id" /></td>
</tr>

<tr>
<td>First Name</td>
<td><input type="text" name="firstName" /></td>
</tr>

<tr>
<td>Last Name</td>
<td><input type="text" name="lastName" /></td>
</tr>

<tr>
<td>User Name</td>
<td><input type="text" name="username" /></td>
</tr>

<tr>
<td>Password</td>
<td><input type="password" name="password" /></td>
</tr>

<tr>
<td>Address</td>
<td><input type="text" name="address" /></td>
</tr>

<tr>
<td>Contact</td>
<td><input type="text" name="contact" /></td>
</tr>

</table>
<input type="submit" value="Submit" />

</form>
</div>
</body>
</html>