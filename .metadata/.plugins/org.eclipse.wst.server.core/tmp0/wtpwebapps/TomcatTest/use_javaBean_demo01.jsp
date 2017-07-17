<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.mldn.lxh.demo.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
SimpleBean simple = new SimpleBean();
simple.setName("李开复");
simple.setAge(30);

%>
<h2>员工的名字是：<%= simple.getName() %></h2>
<h2>员工的年龄是：<%= simple.getAge() %></h2>
</body>
</html>