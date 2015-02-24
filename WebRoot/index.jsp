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
	<link href="styles/index.css" rel="stylesheet" type="text/css">
  </head>
<%--
	String test="1";
	Cookie[] cookies = request.getCookies();
	for (Cookie c:cookies){
		test="2";
		if (c.getName().equals("remStaff")){
			test="3";
			if (c.getValue().equals("remStaff")){
				test = "4";
			}
		}
	}
			
 --%>
  <body>
  	<!--  <img class="main" src="img/face.gif"> -->
    <div class="main">
		<h1>Data Auto-Filting System</h1>
	</div>
	<div class="main">
		<h1>数据自动提取系统</h1>
	</div>
	<div class="main">
		<h3>当前在线人数：<%=request.getSession().getServletContext().getAttribute("userNumber")%></h3>
	</div>
	<div class="main">
		<form name="login" action="<%=path%>/servlet/LoginServlet" method="post">
	    	<table>
	    		<tr>
	    			<td><label for="staff_id">用户名：</label></td>
	        		<td><input type="text" name="staff_id" id="staff_id" placeholder="请输入用户名"></td>
	        		<td><input type="checkbox" name="remStaff" id="remStaff" value="remStaff" checked="checked">
	        			<label for="remStaff">记住用户名</label></td>
	        	</tr>
	        	<tr>
	        		<td><label for="password">密码：</label></td>
	        		<td><input type="password" name="password" id="password" placeholder="请输入密码"></td>
	        		<td>&nbsp;&nbsp;&nbsp;<a href="#">忘记密码</a></td>
	        	</tr>
	        	<tr>
	        		<td><label>权限：</label></td>
	        		<td><select name="is_admin">
	        				<option value="normal" selected="selected">普通</option>
	        				<option value="admin">管理员</option>
	        			</select></td>
	        		<td><input type="checkbox" name="remAdmin" id="remAdmin" value="remAdmin" checked="checked">
	        			<label for="remAdmin">记住权限</label></td>
	        	</tr>
	        	<tr >
	        		<td><input type="submit" value="登录"></td>
	        		<td><input type="reset" value="重置"></td>
	        	</tr>
	        </table>
	    </form>
	</div>
  </body>
</html>
