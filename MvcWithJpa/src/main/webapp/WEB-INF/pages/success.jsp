<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
<a href="./">Home</a>
<h2>${msg}</h2>
<hr>
<p>
Name:: ${std.name}<br>
Dept:: ${std.dept}
</p>
</body>
</html>