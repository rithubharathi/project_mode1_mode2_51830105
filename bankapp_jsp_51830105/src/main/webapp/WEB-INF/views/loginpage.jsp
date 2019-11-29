<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My app login</title>
<style >
#t{
margin: auto;
}
#login{
	margin:auto;
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
#f{
	margin: auto;
}
</style>

</head>
<body>
<h3>MY APP LOGIN</h3>

New user ?
<form action="register">
<button type="submit" >Register here</button><br/>
</form>
<c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION}">
	<font color="red">
	<c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message }"></c:out>
	</font>
</c:if>
<form  action='myloginprocessingurl' method='POST' id="f">
 	<table>
	    <tr><td>UserName</td><td><input type='text' name='email' value=''></td></tr>
	    <tr><td>Password</td><td><input type='password' name='password'/></td></tr>
	    <tr><td colspan='2'><input name="submit" type="submit" value="Login"/></td></tr>
	 <%--   <tr><td> <input name="${_csrf.parameterName }" type="hidden" value="${_csrf.token }" /></td></tr> --%>
 	 </table>
</form>
<c:if test="${param.logout!=null }">
	<font color="red">
	<i>You logged out successfully!</i>
	</font>
</c:if>
	
</body>
</html>