<%@ page language="java"  pageEncoding="UTF-8"%> 
<%@ include file="index.jsp" %> 
<html>
	<head>
		<title>学生成绩管理系统</title>
	</head>
	
	<body>
		<form action="scoreManager.do">
			<h2>查询学生成绩</h2> <br><br>
			<input type="hidden" name="wantTo" value="searchScore"/>
			请输入学号:<input type="text" name="sid"/> <br><br>
			<input type="submit" value="search"/>
		</form>
	</body>
</html>