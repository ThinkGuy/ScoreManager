<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.scoreManager.model.Course"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.scoreManager.model.Student"%>
<%@ page language="java"  pageEncoding="UTF-8"%> 
<%@ include file="index.jsp" %> 
<html>
	<head>
		<title>学生成绩管理系统</title>
	</head>
	
	<body>
		<table class="imagetable">
			<tr>
				<th>课程号</th><th>课程名</th>
			</tr>
		<%
			ArrayList<Course> courses = 
				(ArrayList<Course>)request.getAttribute("courses");
		
			for (Course course : courses) {
		%>
		<tr>
			<td><%=course.getCid()%></td><td><%=course.getCname()%></td>
		</tr>
		<%
			}
		
		%>
		</table>
	</body>
</html>