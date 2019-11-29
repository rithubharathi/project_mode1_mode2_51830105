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
	color: red;
	font-family: serif;
	font-style: italic;
}

  #submit {
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
/* body{
 background-image: url("C:/Java/bg2.jpg");
}
 */#t1{
	margin-top: 195px;
}
h3{
	text-align:justify;
	color:black;
	font-family:fantasy;
	text-shadow: black;
}
</style>

</head>
<body>
<form:form action="transfer" method="post" modelAttribute="fundtransferbean">
	<table style="margin: auto;" id="t1">
		<%-- <tr><td><h3>From Account</h3></td><td><form:input path="fromAccount" id="f1"/></td><td><form:errors path="fromAccount" class="error" ></form:errors></td></tr>
 --%>		<tr><td><h3>To Account</h3></td><td><form:input path="toAccount" id="f1"/></td><td><form:errors path="toAccount" class="error" ></form:errors></td></tr>
		<tr><td><h3>Amount</h3></td><td><form:input path="amount" id="f1"/></td><td><form:errors path="amount" class="error" ></form:errors></td></tr>
	</table>
		<button type="submit" id="submit">Submit</button>	
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	</form:form>

</body>
</html>