<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="com.lin.jstl.*" %>
<%@ taglib uri="tag_jstl_c" prefix="c" %>
<html>
<head><title>set JSDL bean tag</title></head>
<body>
<%
SimpleInfo sim = new SimpleInfo();
request.setAttribute("simple", sim);
%>
<c:set value="Hello MLDN !!!" target="${simple}" property="content"/>
	<h2>属性内容：${simple.content}</h2>

</body>
</html>