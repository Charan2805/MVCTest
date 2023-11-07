<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.reg{
   border: solid 1px;
   height: 200px;  
   width: 300px;
   margin-left: 400px; 
   margin-top: 100px;
   background-color: wheat;
}
</style>
</head>
<body>
<centre>
<form action="TestServlet" method="post">
<br><br>
<div class="reg">
<table font color="#3581E4">
<h1>Welcome to JSP</h1>
<tr>
<td><b><font color="#3581E4">Username :</font></b></td>
<td><input type="text" placeholder="Enter username" name="username" required></td>
</tr>
<tr>
<td><b><font color="#3581E4">Password :</font></b></td>
<td><input type="password" placeholder="Enter password" name="password" required></td>
</tr>
<tr><td></td>
<td>
<button class="clearfix" type="submit" class="signupbtn">Login</button></td>
</tr>
</table>
</div>
</form>
</centre>
</body>
</html>