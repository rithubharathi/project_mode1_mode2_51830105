<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style >
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

#t{
margin-top: 100px;
margin-left: 100px;
}
</style>
</head>
<body>
<form:form action="addcustomer" method="post" modelAttribute="customerbean">
	<table id="t">
		<tr><form:hidden path="id"/></tr>
		<tr><td>ENTER NAME</td><td><form:input path="name" /></td></tr>
		<tr><td>ENTER AGE</td><td><form:input path="age" /></td></tr>
		<tr><td>ENTER EMAIL</td><td><form:input path="email" /></td></tr>
		<tr><td>ENTER PHONE</td><td><form:input path="phone" /></td></tr>
		<tr><td>ENTER ADDRESSLINE 1</td><td><form:input path="addressline1" /></td></tr>
		<tr><td>ENTER CITY</td><td><form:input path="city" /></td></tr>
		<tr><td>ENTER STATE</td><td><form:input path="state" /></td></tr>
		<tr><td>ENTER PINCODE</td><td><form:input path="pincode" /></td></tr>
	</table>
		<tr><td><input type="submit" value="ADD" id="addcust"></td></tr>
</form:form>
</body>
</html>