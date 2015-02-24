<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>Data Auto-Filting System</title>
	<%-- link href="styles/index.css" rel="stylesheet" type="text/css"--%>
  </head>
  <body>
  	<div class="main">
    	<h1>系统出错啦！</h1>
    	<h2>请联系管理员处理该问题或在下方留言，请写明工号，操作步骤等，尽量具体，以便管理员查错（500字以内）</h2>
    	<form name="error" method="post" action="<%=path%>/errorPages/errorUploaded.jsp">
    		<textarea name="detail" rows="10" cols="60" placeholder="请具体描述错误"></textarea><br>
    		<input type="submit" value="提交">
    	</form>
    </div>
  </body>
</html>