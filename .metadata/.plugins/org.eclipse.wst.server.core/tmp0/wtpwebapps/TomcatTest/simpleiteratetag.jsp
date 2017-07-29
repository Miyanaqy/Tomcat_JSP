<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="mytag" uri="tag_simple" %>
<html>
<head><title>simple iterate tag</title></head>
<body>
	<h1>
	<%
		List<String> all = new ArrayList<String>();
		all.add("one");
		all.add("two");
		all.add("three");
		request.setAttribute("all", all);
	%>
		<mytag:simpleiterate id="url" name="all" scope="request">
			<h2>number: ${url}</h2>
		</mytag:simpleiterate>
	</h1>
</body>
</html>