<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<style type="text/css">
.error{
	color: red;
	font-family: serif;
	font-style: italic;
}

  #login {
  	margin-left:425px;
    display: block;
    width: 80px;
    height: 30px;
    background:gray;
    padding: 5px;
    text-align: center;
    border-radius: 5px;
    color: white;
    font-weight: bold;
}
</style>

</head>
<body>
${error}<br/>
${message}<br/>
	<form:form action="login" method="post" modelAttribute="userbean">
	<table style="margin: auto;">
		<tr><td>Enter UserName</td><td><form:input path="userId"/></td><td><form:errors path="userId" class="error"></form:errors></td></tr>
		<tr><td>Enter Password</td><td><form:input path="password"/></td><td><form:errors path="password" class="error"></form:errors></td></tr>
	</table>
		<button type="submit" id="login">Login</button>	
	</form:form>
</body>
</html>