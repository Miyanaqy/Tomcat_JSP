<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login in JSP</title>
</head>
<body>
<form action="login.jsp" method="POST">
用户名：<input type="text" name="uname"><br>
密码：<input type="password" name="psd"><br>
<input type="submit" value="提交">
<input type="reset" value="重置">

</form>

<% 
String uname = request.getParameter("uname");
String psd = request.getParameter("psd");
if(!(uname == null||psd == null||"".equals(uname)||"".equals(psd))){
	if("Miyanaqy".equals(uname) && "123456".equals(psd)){
		response.setHeader("refresh", "3;URL=welcome.jsp");
		session.setAttribute("userid", uname);
		
		%>
		<h1>login success</h1>
		<h1>if not skip to the welcome page,Please <a href="welcome.jsp">click there</a></h1>
		
		<%
	}else{
		
		%>
			<h1>Invalid user name or password</h1>
		<%
	}
}

%>
</body>
</html>