<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html5>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add User Form</title>
<link rel="stylesheet" href="styles/useraddformstyle.css">
<script type="text/javascript" src="scripts/useraddvalidation.js"></script>
</head>
<body>

<%@ include file="header.html" %>
<h2>${useradderror}</h2>
<div class="usercontainer">
<form name="addForm" action="adduser" method="post" onsubmit="return validateUserForm()">
	
		<label for="uid">User ID :</label>
		<input type="text" name="userId" id="uid" placeholder="Enter User ID">
		
		
		<label for="unm">User Name :</label>
		<input type="text" name="uName" id="unm" placeholder="Enter User Name">
		
		<label for="url">User Role:</label>
		<input type="text" name="role" id="url" placeholder="Enter User Role">
		
		
		<input type="submit" value="submit">
		<input type="reset">
		
	</form>
	
</div>	

</body>

<%@ include file="footer.html" %>
</html>