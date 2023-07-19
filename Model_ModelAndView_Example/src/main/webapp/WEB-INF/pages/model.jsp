<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Model Example</title>
</head>
<body>
<h1 align="center">Model Example</h1><br>

<table align="center" style="border:0px;background-color:cyan">
<tr>
<th>Student Name </th>
<th>Roll No</th>
</tr>


<%
List<Integer> no=(List<Integer>)request.getAttribute("roll");
String names[]=(String[])request.getAttribute("name");
for(int i=0;i<names.length;i++){
%>
<tr>
<th><%= names[i] %> </th>
<th><%= no.get(i) %></th>
</tr>

<%
}
%>

</table>


</body>
</html>