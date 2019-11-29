<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="sec" uri="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="deposit" method="post" modelAttribute="TransactionBean">
<table>
<tr><td>ENTER ACCOUNT NUMBER</td><td><form:input path="accountNumber"/></td></tr>
<tr><td>ENTER AMOUNT </td><td><form:input path="amount"/></td></tr>
</table>
<input type="submit" value="DEPOSIT">
</form:form>
<form:form action="withdraw" method="post" modelAttribute="TransactionBean">
<table>
<tr><td>ENTER ACCOUNT NUMBER</td><td><form:input path="accountNumber"/></td></tr>
<tr><td>ENTER AMOUNT </td><td><form:input path="amount"/></td></tr>
</table>
<input type="submit" value="WITHDRAW">
</form:form>

</body>
</html>