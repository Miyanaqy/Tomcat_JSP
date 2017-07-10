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
String method = request.getMethod();
String ip = request.getRemoteAddr();
String path = request.getServletPath();
String contextPath = request.getContextPath();
%>

<h2>访问方法：<%= method %></h2>
<h2>客户端ip：<%= ip %></h2>
<h2>访问路径：<%= path %></h2>
<h2>上下文名称：<%= contextPath %></h2>
</body>
</html>