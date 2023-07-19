<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Example OF JSTL</title>
</head>
<body>
<c:set var="i" value="12"/>
<c:remove var="i"/>
<h1><c:out value="Value of i=${i}"/></h1>

</body>
</html>