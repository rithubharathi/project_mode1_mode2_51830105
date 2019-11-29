<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error{
	color:red;
	font-family: serif;
	font-style: italic;
}
  #addcust {
  margin-left:425px;
    display: block;
    width: 100px;
    height: 40px;
    background: gray;
    padding: 10px;
    text-align: center;
    border-radius: 5px;
    color: maroon;
    font-weight: bold;
}
</style>
</head>
<body>

<form:form action="addcustomer" method="post" modelAttribute="customer">
<table style="margin: auto;margin-top: 100px">
	<form:hidden path="id"/>
	<tr><td>ENTER NAME</td><td><form:input path="name"/><td><td><form:errors path="name" class="error"/></td></tr>
	<tr><td>ENTER CUSTOMER ID</td><td><form:input path="custId"/><td><td><form:errors path="custId" class="error"/></td></tr>
	<tr><td>ENTER ADDRESS</td><td><form:input path="address"/></td><td><form:errors path="address" class="error"/></td></tr>
	<tr><td>ENTER PHONE NUMBER</td><td><form:input path="phoneNumber"/></td><td><form:errors path="phoneNumber" class="error"/></td></tr>
	<tr><td>ENTER EMAIL</td><td><form:input path="email"/></td><td><form:errors path="email" class="error"/></tr>
	<tr><td>ENTER AGE</td><td><form:input path="age"/><td><td><form:errors path="age" class="error"/></td></tr>
	
</table>
	<button type="submit" id="addcust">Submit</button>
</form:form>

</body>
</html>