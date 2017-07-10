<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
response.setHeader("refresh","2;URL=login.jsp");
session.invalidate();

%>
<h2>login out the System, you will to home page</h2>
<h2>skip to login page with 2 second after,if out skip <a href="login.jsp">click here</a></h2>
</body>
</html>