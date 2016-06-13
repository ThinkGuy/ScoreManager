<%@ page language="java"  pageEncoding="UTF-8"%> 
<%@ include file="index.jsp" %> 
<html>
	<head>
		<title>学生成绩管理系统</title>
	</head>
	
	<body>
		<form action="scoreManager.do">
			<input type="hidden" name="wantTo" value="searchCourseInfo"/>
			<input type="submit" value="查询课程信息"/> <br>
		</form>
	</body>
</html>