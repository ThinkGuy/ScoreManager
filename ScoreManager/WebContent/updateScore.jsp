<%@ page language="java"  pageEncoding="UTF-8"%> 

<html>
	<head>
		<title>学生成绩管理系统</title>
	</head>
	
	<body>
		<form action="scoreManager.do">
			<h2>更新课程信息</h2> <br><br>
			<input type="hidden" name="wantTo" value="updateScore"/>
			请输入学号:<input type="text" name="sid"/> <br><br>
			请输入课程号:<input type="text" name="cid"/> <br><br>
			请输入成绩:<input type="text" name="score"/> <br><br>
			<input type="submit" value="update"/>
		</form>
	</body>
</html>