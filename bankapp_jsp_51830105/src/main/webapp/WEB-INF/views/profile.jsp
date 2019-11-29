<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="profile" method="post" modelAttribute="userdetail">
	<table style="margin: auto;margin-top: 100px">
		<tr><td>Enter NAME:</td><td><form:input path="name"/></td></tr>
		<tr><td>ENTER AGE</td><td><form:input path="age" /></td></tr>
		<tr><td>ENTER EMAIL</td><td><form:input path="email" /></td></tr>
		<tr><td>ENTER PHONE</td><td><form:input path="phone" /></td></tr>
		<tr><td>ENTER ADDRESSLINE 1</td><td><form:input path="addressline1" /></td></tr>
		<tr><td>ENTER CITY</td><td><form:input path="city" /></td></tr>
		<tr><td>ENTER STATE</td><td><form:input path="state" /></td></tr>
		<tr><td>ENTER PINCODE</td><td><form:input path="pincode" /></td></tr></table>
</form:form>

<%-- <c:if test="${form.action=='add'}">
<form:form action="add" method="post" modelAttribute="userdetail">
	<table style="margin: auto;margin-top: 100px">
		<tr><td>Enter Name:</td><td><form:input path="name"/></td></tr>
		<tr><td>Enter AccountNumber:</td><td><form:input path="accountNumber"/></td></tr>
		<tr><td>Enter Email ID:</td><td><form:input path="email"/></td></tr>
		<tr><td>Enter PhoneNumber:</td><td><form:input path="phoneNumber"/></td></tr>
		<tr><td>Enter Address:</td><td><form:input path="address"/></td></tr>
		<tr><td><input type="submit" value="Add"/></td></tr>
		</table>
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />

</form:form>
</c:if>
 --%>
</body>
</html>