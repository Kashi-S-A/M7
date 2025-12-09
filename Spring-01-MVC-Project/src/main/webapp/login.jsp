<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Login Here,</h2>
	<p style="color: red">${msg}</p>
	<form action="login" method="post">
		UserName : <input type="text" name="un" placeholder="enter username" required><br>
		Password : <input type="password" name="pwd" placeholder="enter password" required><br>
		<button type="submit">Login</button>
	</form>
</body>
</html>