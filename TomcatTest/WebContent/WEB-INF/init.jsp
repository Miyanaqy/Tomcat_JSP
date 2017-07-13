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
	String dbDriver = config.getInitParameter("driver");
	String dbUrl = config.getInitParameter("url");
%>

<h2>驱动程序：<%= dbDriver %></h2>
<h2>链接地址：<%= dbUrl %></h2>
</body>
</html>