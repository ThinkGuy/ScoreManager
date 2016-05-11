<%@page import="com.scoreManager.model.Student"%>
<%@ page language="java"  pageEncoding="UTF-8"%> 

<html>
	<head>
		<title>学生成绩管理系统</title>
	</head>
	
	<body>
		学号:${requestScope.student.id} <br>
		姓名:${requestScope.student.name } <br>
		年龄:${requestScope.student.age } <br>
		
		<input type="button" value="重新选择功能" 
			onclick="window.location.href='choose.jsp'">
		<input type="button" value="再查询" 
			onclick="window.location.href='searchStudentInfo.jsp'">
	</body>
</html>