<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Employee</title>
</head>
<body>
<h1 align="center">Employee Details</h1>
<table border="0" bgcolor="cyan" style="margin:50px 0px 0px 140px">
<tr>
<th>Emp_ID</th>
<th>Emp_Name</th>
<th>Emp_Salary</th>
<th>Emp_Location</th>
</tr>

<tr>
<td>${emp.id}</td>
<td>${emp.name}</td>
<td>${emp.salary}</td>
<td>${emp.location}</td>
</tr>

</table>

</body>
</html>