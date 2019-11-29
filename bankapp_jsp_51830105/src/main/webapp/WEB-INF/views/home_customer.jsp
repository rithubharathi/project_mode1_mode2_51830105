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
#f{
margin-left: 400px;
margin-top: 10px;
}
</style>
<script type="text/javaScript">
function disableBackButton()
{
window.history.forward();
}
setTimeout("disableBackButton()", 0);
</script>
</head>
<body onload="disableBackButton()">
<h3>WELCOME</h3>
 <!-- <a href="profile" >MY PROFILE</a><br/> -->
<a href="checkbalance">CHECK BALANCE</a><br/>
<a href="cashtransaction">BANKING</a><br/>
<a href="transfer">FUND TRANSFER</a>
<form action="logout" id="f">
<button type="submit" id="logout">LOGOUT</button>
</form>
</body>
</html>