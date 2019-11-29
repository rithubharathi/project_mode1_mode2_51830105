<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style >
#logout{
	margin-left: 200px;
	margin-top: 200px;
	display: block;
    width: 100px;
    height: 30px;
    background: navy;
    padding: 5px;
    text-align: center;
    border-radius: 5px;
    color: white;
    font-weight: bold;

}
h3{	
 text-align:center;
 font-family: sans-serif;
 font-style: italic;
}

</style>

</head>
<body>
<h3>WELCOME </h3>
<a href="allcustomer">VIEW CUSTOMER DETAILS</a><br/>
<a href="addcustomer">ADD CUSTOMER</a><br/>

<form action="logout">
<button type="submit" value="logout">LOGOUT</button>
</form>
</body>
</html>