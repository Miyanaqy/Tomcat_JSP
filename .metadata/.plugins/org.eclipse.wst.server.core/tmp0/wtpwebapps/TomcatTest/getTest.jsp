<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.io.*,java.util.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>learning JSP</title>
</head>
<body>
<% String name = new String(request.getParameter("name").getBytes("ISO-8859-1"),"UTF-8"); %>
<H1>使用 GET 方法读取数据</H1>
<ul>
<li><p><b>站点名:</b><%= name %></p></li>
<li><p><b>网址:</b><%= request.getParameter("url") %></p></li>
</ul>
</body>
</html>