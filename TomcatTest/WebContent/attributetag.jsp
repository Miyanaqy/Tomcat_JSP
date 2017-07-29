<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="mytag" uri="tag_attribute" %>
<html>
<head><title>Attribute Tag</title></head>
<body>
<%
	String scope = "session";
	session.setAttribute("username", "李白");
	request.setAttribute("allusers", "王台");
%>
<mytag:present name="username" scope="<%= scope %>">
<h2><%= scope %> 范围存在属性， 内容是: "${sessionScope.username}"</h2>
</mytag:present>
<mytag:present name="allusers" scope="request">
<h2>request 范围存在属性，内容是： "${requestScope.allusers}"</h2>
</mytag:present>
</body>
</html>