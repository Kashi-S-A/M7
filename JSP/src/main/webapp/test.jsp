<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- Declaration Tag -->
	
	<%!
		int a = 10;
	
		public String getMessage(){
			return "Good Morning";
		}
		
		public void test(){
			int b = 10;
			int c = 20;
			int result = a+b;
		}
	%>
	
	<!-- Expression Tag -->
	
	<h1>value of a : <%=a %></h1>
	<h1>Message : <%=getMessage() %></h1>
	<%-- <h1>test : <%=test() %></h1> --%>
	
	<!-- Scriptlet Tag -->
	
	<%
		String message = "How are you ?";//local variable
		
		out.print("<h1>Hey this is service method</h1>");
		
	%>
	
	<h1>Msg : <%=message %></h1>
</body>
</html>