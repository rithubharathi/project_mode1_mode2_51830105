<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 
</head>
<body>
<div class="container">
  <div class="row">
    <div class="col-sm-6">

<table class="table table-striped">
	
	<thead>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>AGE</th>
			<th>EMAIL ID</th>
			<th>PHONE</th>
			<th>AREA</th>
			<th>CITY</th>
			<th>STATE</th>
			<th>PINCODE</th>
			<th>DELETE</th>
			<th>UPDATE</th>
			
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${customers}" var="customer">
			<tr>
			<td>${customer.id}</td>
			<td>${customer.name}</td>
			<td>${customer.age}</td>
			<td>${customer.email}</td>
			<td>${customer.phone}</td>
			<td>${customer.addressline1}</td>
			<td>${customer.city}</td>
			<td>${customer.state}</td>
			<td>${customer.pincode}</td>
			<td><a href="deletecustomer?id=${customer.id}">Delete</a></td>
			<td><a href="updatecustomer?id=${customer.id}">Update</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</div>
</div>
</div><br/>
<a href="manager">Back</a>
</body>
</html>