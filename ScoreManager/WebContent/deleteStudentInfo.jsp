<%@ page language="java"  pageEncoding="UTF-8"%> 

<html>
	<head>
		<title>学生成绩管理系统</title>
	</head>
	
	<body>
		<form action="scoreManager.do">
			<h2>删除学生信息</h2> <br><br>
			<input type="hidden" name="wantTo" value="deleteStudentInfo"/>
			请输入学号:<input type="text" name="sid"/> <br><br>
			<input type="submit" value="delete"/>
		</form>
	</body>
</html>