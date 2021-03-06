<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.*"%>
<%@ taglib prefix="mytag" uri="tag_attribute" %>
<html>
<head><title>Iterate Tag</title></head>
<body>
	<%
	List<String> all = new ArrayList<String>();
	all.add("one");
	all.add("two");
	all.add("three");
	request.setAttribute("all", all);
	%>

	<mytag:present name="all" scope="request">
		<mytag:iterate id="url" name="all" scope="request">
			<h3>number: ${url}</h3>
		</mytag:iterate>
	</mytag:present>
</body>
</html>