<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>welcome to my site</title>
</head>
<body>
<%
if(session.getAttribute("userid") != null){
	%>
	<h1>welcome to the site,my name is Miyanaqy</h1>
	<h2>you can make friend to me, or <a href="logout.jsp">logout</a></h2>
	<%		
}else{
	%>
	<h2>No, you can't read the page. I think you need to <a href="login.jsp">login</a> </h2>
	<%
}
%>

</body>
</html>