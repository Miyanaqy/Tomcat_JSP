
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*" %>
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
String name = request.getParameter("filename");
String content = request.getParameter("filecontent");
String filename = this.getServletContext().getRealPath("/") + "note" + File.separator + name;
File file = new File(filename);
if(!file.getParentFile().exists()){
	file.getParentFile().mkdir();
}
PrintStream ps = new PrintStream(new FileOutputStream(file));
ps.println(content);
ps.close();
%>
<%
Scanner scan = new Scanner(new FileInputStream(file));
scan.useDelimiter("\n");
StringBuffer sb = new StringBuffer();
while(scan.hasNext()){
	sb.append(scan.next()).append("<br>");
	
}
scan.close();
%>
<%= sb %>
<%= filename %>
</body>
</html>