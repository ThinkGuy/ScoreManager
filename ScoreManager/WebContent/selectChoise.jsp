<%@ page language="java" pageEncoding="UTF-8"%>

<html>
	<head>
		<title>学生成绩管理系统</title>
	</head>
	
	<body>
		<input type="button" value="查询学生信息" 
			onclick="window.location.href='searchStudentInfo.jsp'"> <br>
			
		<form action="scoreManager.do">
			<input type="hidden" name="wantTo" value="searchCourseInfo"/>
			<input type="submit" value="查询课程信息"/> <br>
		</form>
		
		<input type="button" value="查询学生成绩" 
			onclick="window.location.href='searchScore.jsp'"> <br>
	</body>
</html>