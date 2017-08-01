<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="tag_jstl_c" prefix="c" %>
<%@ taglib uri="tag_jstl_sql" prefix="sql" %>
<html>
<head><title>JSTL sql tag</title></head>
<body>
<sql:setDataSource dataSource="jdbc/day01" user="root" password="tiancaiado" var="sqldemo" />
<sql:query var="result"  dataSource="${sqldemo}">
select * from user;
</sql:query>
<h3>一共有${result.rowCount}条记录</h3>
<table border="1" width="100%">
<tr>
<td>id</td>
<td>用户名</td>
<td>密码</td>
</tr>
<c:forEach items="${result.rows}" var="row">
<tr>
<td>${row.id}</td>
<td>${row.username}</td>
<td>${row.password}</td>
</tr>
</c:forEach>
</table>
</body>
</html>