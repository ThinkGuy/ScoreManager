<%@page import="java.util.ArrayList"%>
<%@page import="com.scoreManager.model.Student"%>
<%@page import="com.scoreManager.model.Course"%>
<%@ page language="java"  pageEncoding="UTF-8"%> 
<%@ include file="index.jsp" %> 
<html>
	<head>
		<title>学生成绩管理系统</title>
		<link href="css/table.css" rel="stylesheet" type="text/css" />
		<link href="css/button.css" rel="stylesheet" type="text/css" />
	</head>
	
	<body>
		<div id="content">
			${requestScope.student.name}同学，你的成绩为：
		</div>
			
		<table class="imagetable">
			<tr>
				<th>课程号</th><th>课程名</th><th>成绩</th>
			</tr>
			<%
				Student student = (Student)request.getAttribute("student");
				ArrayList<Course> courses = student.getCourses();
			
				for (Course course : courses) {
			%>
			<tr>
				<td><%=course.getCid()%></td>
				<td><%=course.getCname()%></td>
				<td><%=course.getScore()%></td>
			</tr>
			<%
				}
			%>
		</table>
	</body>
</html>