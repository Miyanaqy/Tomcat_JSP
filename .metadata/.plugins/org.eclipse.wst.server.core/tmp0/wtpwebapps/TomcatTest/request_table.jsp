<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	request.setCharacterEncoding("UTF-8");
%>
<center>
<table border="1">
<tr>
<td>参数名</td>
<td>参数内容</td>
</tr>
<%
 Enumeration enu = request.getParameterNames();
while(enu.hasMoreElements()){
	String paramName = (String)enu.nextElement();
	%>
	
	
	<tr>
	<td>
	<%= paramName %>
	</td>
	<td>
	<%
		if(paramName.startsWith("**")){
			String[] paramValues = request.getParameterValues(paramName);
			for(int i=0;i<paramValues.length;i++){
				%>
				<%= paramValues[i] %>、
				<%
			}
 		}else{
 			String paramValue = request.getParameter(paramName);
 			%>
 				<%= paramValue %>
 			<%
 		}
	%>
	</td>
	</tr>
	<%
}
%>
</table>
</center>
</body>
</html>