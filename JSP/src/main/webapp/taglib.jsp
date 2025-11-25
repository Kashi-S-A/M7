<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

	<h1>TagLib Session</h1>

	<c:set var="a" value="100"></c:set>

	<h2>
		<c:out value="${a}"></c:out>
	</h2>

	<c:choose>
		<c:when test="${a > 100}">a is greater than 100</c:when>
		<c:when test="${a < 100 }">a is less than 100</c:when>
		<c:otherwise>a is equal to 100</c:otherwise>
	</c:choose>

	<%-- 
	<c:redirect url="https://www.naukri.com/nlogin/login?URL=http://www.naukri.com/mnjuser/recommendedjobs"></c:redirect>
 	--%>

	<c:import url="https://www.instagram.com/"></c:import>
</body>
</html>
