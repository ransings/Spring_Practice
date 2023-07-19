<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Employee</title>
</head>
<body>

<a href="./">Home</a>
<h1 align="center">Registered Student Details</h1>
<table border="1px" bgcolor="cyan" style="margin:50px 0px 0px 400px">
<tr>
<th>Std_ID</th>
<th>Std_Name</th>
<th>Department_Name</th>
<th>College_Fees</th>
<th>Std_Percentage</th>
<th>Actions</th>
</tr>

<c:if test="${empty studs}">
<tr>
<td colspan="5"><center>No Records found</center></td>
</tr>
</c:if>
<c:forEach var="std" items="${studs}">
<tr>
<td>${std.id}</td>
<td>${std.name}</td>
<td>${std.dept}</td>
<td>${std.fees}</td>
<td>${std.percentage}</td>
<td>
<a href="delete?sno=${std.id}">delete</a>
<a href="edit?sno=${std.id}">edit</a>
</td>
</tr>
</c:forEach>

</table>

</body>
</html>