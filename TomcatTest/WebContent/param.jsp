<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="tag_jstl_c" prefix="c" %>
<html>
<head><title>c import</title></head>
<body>
<h3>name参数：${param.name}</h3>
<h3>url参数：${param.url}</h3>
<c:redirect url="hello.html">
	<c:param name="name" value="lin"/>
	<c:param name="url" value="www.lin.com"/>
</c:redirect>
</body>
</html>
