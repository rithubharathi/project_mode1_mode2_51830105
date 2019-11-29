<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Balance</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 
</head>
<body>

<table class="table table-striped" border="1" >
	<thead>
		<tr>
			<th>NAME</th>
			<th>ACCOUNT NUMBER</th>
			<th>BALANCE</th>
		</tr>
	</thead>
	<tbody>
			<tr>
			<td>${account.name}</td>
			<td>${account.accountNumber}</td>
			<td>${account.balance}</td>
			</tr>
	</tbody>
	</table>
	<br/>
<form action="back">
<button type="submit">Home</button>
</form>
	
</body>
</html>