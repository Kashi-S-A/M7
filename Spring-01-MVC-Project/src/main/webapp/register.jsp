<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Enter user details</h1>
	<form action="register" method="post">
		Name : <input type="text" name="username" placeholder="enter name" required><br>
		Email : <input type="email" name="useremail" placeholder="enter email" required><br>
		Phone : <input type="number" name="phone" placeholder="enter phone" required><br>
		Password : <input type="password" name="pwd" placeholder="enter password" required><br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>