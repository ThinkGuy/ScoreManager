<%@page import="com.scoreManager.model.Student"%>
<%@ page language="java"  pageEncoding="UTF-8"%>
<%@ include file="index.jsp" %> 
<html>
	<head>
		<title>学生成绩管理系统</title>
		<link rel="stylesheet" type="text/css" href="css/common.css"/>
    	<link rel="stylesheet" type="text/css" href="css/main.css"/>
		<link href="css/table.css" rel="stylesheet" type="text/css" />
		<link href="css/button.css" rel="stylesheet" type="text/css" />
	</head>
	
	<body>
	
	<div id="content">
		<table class="imagetable">
			<tr>
				<td>学号</td>
				<td><div>${requestScope.student.id}</div></td>
			</tr>
			<tr>
				<td>姓名</td>
				<td><div>${requestScope.student.name}</div></td>
			</tr>
			<tr>
				<td>年龄</td>
				<td><div>${requestScope.student.age}</div></td>
			</tr>
		</table>
	</div>
	</body>
</html>