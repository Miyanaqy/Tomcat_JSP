<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="tag_jstl_c" prefix="c" %>
<%@ taglib uri="tag_jstl_x" prefix="x" %>
<html>
<head><title>JSTL XML tag</title></head>
<body>
<c:import var="add" url="http://localhost:8080/TomcatTest/address.xml" charEncoding="UTF-8" />
<x:parse var="addressXml" doc="${add}" />
<h3>姓名： <x:out select="$addressXml/addresslist/linkman/name"/></h3>
<h3>邮箱：<x:out select="$addressXml/addresslist/linkman/email"/></h3>
</body>
</html> 