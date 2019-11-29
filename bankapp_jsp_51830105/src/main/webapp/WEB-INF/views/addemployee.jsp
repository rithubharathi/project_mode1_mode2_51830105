<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
  #addcust {
    display: block;
    width: 115px;
    height: 40px;
    background: green;
    padding: 10px;
    text-align: center;
    border-radius: 5px;
    color: white;
    font-weight: bold;
}
</style>

</head>
<body>

<form:form action ="addemployee" method="post" modelAttribute="empdetails">
<table style="margin: auto;margin-top: 100px">
	<%-- <form:hidden path="id"/> --%>
	<tr><td>ENTER NAME :</td><td><form:input path="name"/></td></tr>
	<tr><td>ENTER EMPLOYEE ID :</td><td><form:input path="employeeId"/></td></tr>
	<tr><td>ENTER DESIGNATION :</td><td><form:input path="designation"/></td></tr>
	<tr><td>ENTER AGE :</td><td><form:input path="age"/></td></tr>
	<tr><td>ENTER EMAIL ID :</td><td><form:input path="email"/></td></tr>
	<tr><td>ENTER PHONE NUMBER :</td><td><form:input path="phoneNumber"/></td></tr>
	<tr><td>ENTER ADDRESS :</td><td><form:input path="address"/></td></tr>
	<tr><td><input type="submit" value="ADD" id="addcust"></td></tr>
	<tr><td> <input name="${_csrf.parameterName }" type="hidden" value="${_csrf.token }" /></td></tr>
</table>
</form:form>

</body>
</html>