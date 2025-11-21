<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	String name = request.getParameter("un");
	String email = request.getParameter("ue");
	String address = request.getParameter("ua");
	%>

	<h1>User Details</h1>
	<h3>Name : <%=name %></h3>
	<h3>Email : <%=email %></h3>
	<h3>Address : <%=address %></h3>
	
	<hr>
	
	<h1>User Details</h1>
	<h3>Name : <%=request.getParameter("un") %></h3>
	<h3>Email : <%=request.getParameter("ue") %></h3>
	<h3>Address : <%=request.getParameter("ua") %></h3>
	
	<hr>
	
	<h1>User Info</h1>
	<h3>Name : ${param.un}</h3>
	<h3>Email : ${param.ue}</h3>
	<h3>Add : ${param.ua}</h3>
	
</body>
</html>