<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Users</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
#logout{
	display: block;
    width: 115px;
    height: 40px;
    background: navy;
    padding: 10px;
    text-align: center;
    border-radius: 5px;
    color: white;
    font-weight: bold;

}
</style>
</head>
<body>
<h1>Welcome ${customer.name}</h1>
<div class="container">
  <div class="row">
    <div class="col-sm-6">

<table class="table table-striped">
	<c:if test="${user.profile == 'admin'}">
	<thead>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>CUSTOMER ID</th>
			<th>ADDRESS</th>
			<th>PHONE</th>
			<th>EMAIL ID</th>
			<th>AGE</th>
			<th>DELETE</th>
			<th>UPDATE</th>
			
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${customers}" var="customer">
			<tr>
			<td>${customer.id}</td>
			<td>${customer.name}</td>
			<td>${customer.custId}</td>
			<td>${customer.address}</td>
			<td>${customer.phoneNumber}</td>
			<td>${customer.email}</td>
			<td>${customer.age}</td>
			<td><a href="delete?id=${customer.id}">Delete</a></td>
			<td><a href="update?id=${customer.id}">Update</a></td>
			</tr>S
		</c:forEach>
	</tbody>
	</c:if>
	<c:if test="${user.profile=='user' || user.profile == 'manager'}">
	<thead>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>CUSTOMER ID</th>
			<th>ADDRESS</th>
			<th>PHONE</th>
			<th>EMAIL ID</th>
			<th>AGE</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${customers}" var="customer">
			<tr>
				<td>${customer.id}</td>
				<td>${customer.name}</td>
				<td>${customer.custId}</td>
				<td>${customer.address}</td>
				<td>${customer.phoneNumber}</td>
				<td>${customer.email}</td>
				<td>${customer.age}</td>
			</tr>
		</c:forEach>
	</tbody>
	</c:if>	
	</table>
</div>
</div>
</div>

	<c:if test="${user.profile == 'admin' || user.profile == 'manager'}">
		<a href="addcustomer" id="addcust">Add customer</a>
	</c:if>
	<br>
<a href="logout" id="logout">logout</a>
<br/>
</body>
</html>