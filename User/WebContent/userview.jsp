<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users</title>
</head>
<body>

	
	
			<table>
			<tr><th>User Id</th><th>User Name</th><th>Role</th><th>
			<c:forEach var="u" items="${sessionScope.userList}">
			
			<tr>
				<td>${u.userId}</td>
				<td>${u.uName}</td>
				<td>${u.role}</td>
				
				<td><a href="edit?userId=${u.userId}&uName=${u.uName}&role=${u.role}">Edit </a></td>
				<td><a href="delete?userId=${u.userId}&uName=${u.uName}&role=${u.role}">Delete</a></td>
				
			</tr>
			</c:forEach>
			</table>	
					
</body>
</html>			
			
			
			
			
