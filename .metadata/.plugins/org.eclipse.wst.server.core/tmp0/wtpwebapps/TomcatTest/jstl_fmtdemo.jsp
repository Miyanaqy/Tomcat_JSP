<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib uri="tag_jstl_fmt" prefix="fmt"%>
<html>
<head><title>JSTL fmt tag</title></head>
<body>
<%
	pageContext.setAttribute("date", new Date());
%>
<h3>中文日期显示：
<fmt:setLocale value="zh_CN"/>
<fmt:formatDate value="${date}"/>
</h3>
<h3>英文日期显示：
<fmt:setLocale value="en_US"/>
<fmt:formatDate value="${date}"/>
</h3>
<fmt:bundle basename="Message">
<fmt:message key="name" var="nameref" />
</fmt:bundle>
<h3>姓名：${nameref}</h3>
<fmt:bundle basename="Message">
<fmt:message key="info" var="inforef">
<fmt:param value="MLDN"/>
</fmt:message>
</fmt:bundle>
<h3>信息：${inforef}</h3>
<fmt:setBundle basename="Message" var="msg"/>
<fmt:message key="city" var="cityref" bundle="${msg}"/>
<h3>姓名： ${nameref}</h3>
<fmt:message key="mes" var="mesref" bundle="${msg}">
<fmt:param value="you"/>
</fmt:message>
<h3>信息：${mesref}</h3>
<fmt:formatNumber value="3516156.165102" pattern="##.###E0" var="num"/>
<h3>科学计数法：${num}</h3>
<fmt:formatNumber value="135131320.0305631" maxIntegerDigits="7" maxFractionDigits="3" groupingUsed="true" var="num"/>
<h3>格式化数字：${num}</h3>
</body>
</html>