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
</style>
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
			<th>EMPLOYEE ID</th>
			<th>DESIGNATION</th>
			<th>AGE</th>
			<th>EMAIL ID</th>
			<th>PHONE</th>
			<th>ADDRESS</th>
			<th>DELETE</th>
			<th>UPDATE</th>
			
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${employees}" var="employee">
			<tr>
			<td>${employee.id}</td>
			<td>${employee.name}</td>
			<td>${employee.employeeId}</td>
			<td>${employee.designation}</td>
			<td>${employee.age}</td>
			<td>${employee.email}</td>
			<td>${employee.phoneNumber}</td>
			<td>${employee.address}</td>
			<td><a href="delete?id=${employee.id}">Delete</a></td>
			<td><a href="update?id=${employee.id}">Update</a></td>
			</tr>
		</c:forEach>
	</tbody>

</table>
</div>
</div>
</div>
<a href="admin">Back</a>
</body>
</html>