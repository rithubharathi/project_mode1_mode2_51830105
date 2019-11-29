<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Page</title>
</head>
<body>
<form:form action ="register" method="post" modelAttribute="registerbean">
<table>
<tr><td>ENTER NAME :</td><td><form:input path="name" /></td></tr>
<tr><td>ENTER EMAIL ID :</td><td><form:input path="email"/></td></tr>
<tr><td>ENTER PASSWORD :</td><td><form:input path="password"/></td></tr>
<tr><td>CONFIRM PASSWORD :</td><td><form:input path="cPassword"/></td></tr>
<tr><td><input type="submit" value="REGISTER"></td></tr>
</table>
</form:form>
</body>
</html>