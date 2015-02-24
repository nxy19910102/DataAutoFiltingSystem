<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">	
    <title>Data Auto-Filting System</title>
	<link rel="stylesheet" type="text/css" href="styles/index.css">
  </head>
  <body>
  	<div class="main">
    	<a href="staffManage/staffManage.jsp">员工管理</a><br>
    	<a href="errorPages/errorManage.jsp">错误管理</a><br>
    	<a href="logs/sessionLog.jsp">会话管理</a><br>
    	<p>SessionId:  <%=request.getSession().getId() %></p><br>
    	<p>Session:  <%=request.getSession().getAttribute("staff_id") %></p><br>
    	<p>Session:  <%=request.getSession().getAttribute("is_admin") %></p><br>
    	<a href="errorPages/error500.jsp">error500</a>
	</div>
  </body>
</html>
