<%@ page language="java"  pageEncoding="UTF-8"%> 
<%@ include file="index.jsp" %> 
<html>
	<head>
		<title>学生成绩管理系统</title>
	</head>
	
	<body>
		<form action="scoreManager.do">
			<h2>删除课程信息</h2> <br><br>
			<input type="hidden" name="wantTo" value="deleteCourseInfo"/>
			请输入课程号:<input type="text" name="cid"/> <br><br>
			<input type="submit" value="delete"/>
		</form>
	</body>
</html>