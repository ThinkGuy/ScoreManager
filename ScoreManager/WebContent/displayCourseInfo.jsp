<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.scoreManager.model.Course"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.scoreManager.model.Student"%>
<%@ page language="java"  pageEncoding="UTF-8"%> 

<html>
	<head>
		<title>学生成绩管理系统</title>
	</head>
	
	<body>
		<%
			ArrayList<Course> courses = 
				(ArrayList<Course>)request.getAttribute("courses");
		
			for (Course course : courses) {
		%>
		<tr>  
		<td><%=course.toString()%></td> <br>  
		</tr>  
		<%
			}
		
		%>
		
		<input type="button" value="重新选择功能" 
			onclick="window.location.href='choose.jsp'"> <br>
		<input type="button" value="再查询" 
			onclick="window.location.href='search.jsp'">
	</body>
</html>