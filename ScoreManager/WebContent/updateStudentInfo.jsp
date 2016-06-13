<%@ page language="java"  pageEncoding="UTF-8"%> 
<%@ include file="index.jsp" %> 
<html>
	<head>
		<title>学生成绩管理系统</title>
	</head>
	
	<body>
		<form action="scoreManager.do">
			<h2>修改学生信息</h2> <br><br>
			<input type="hidden" name="wantTo" value="updateStudentInfo"/>
			请输入学号:<input type="text" name="sid"/> <br><br>
			请输入姓名:<input type="text" name="name"/> <br><br>
			请输入年龄:<input type="text" name="age"/> <br><br>
			<input type="submit" value="update"/>
		</form>
	</body>
</html>