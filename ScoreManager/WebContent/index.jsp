<%@ page language="java"  pageEncoding="UTF-8"%> 
<html>
	<head>
		<title>学生成绩管理系统</title>
		<link rel="stylesheet" type="text/css" href="css/common.css"/>
    	<link rel="stylesheet" type="text/css" href="css/main.css"/>
		<link href="css/table.css" rel="stylesheet" type="text/css" />
		<link href="css/button.css" rel="stylesheet" type="text/css" />
	</head>
	
	<body>
	<div class="topbar-wrap white">
	    <div class="topbar-inner clearfix">
	        <div class="topbar-logo-wrap clearfix">
	            <h1 class="topbar-logo none"><a href="index.html" class="navbar-brand">后台管理</a></h1>
	            <ul class="navbar-list clearfix">
	                <li><a class="on" href="index.jsp">首页</a></li>
	            </ul>
	        </div>
	        <div class="top-info-wrap">
	            <ul class="top-info-list clearfix">
	                <li><a href="login.jsp">退出</a></li>
	            </ul>
	        </div>
	    </div>
	</div>
    <div class="sidebar-wrap">
        <div class="sidebar-title">
            <h1>菜单</h1>
        </div>
        <div class="sidebar-content">
            <ul class="sidebar-list">
                <li>
                    <a href="#"><i class="icon-font">&#xe003;</i>查询</a>
                    <ul class="sub-menu">
                        <li><a href="searchStudentInfo.jsp"><i class="icon-font">&#xe003;</i>查询学生信息</a></li>
                        <li><a href="searchCourseInfo.jsp"><i class="icon-font">&#xe003;</i>查询课程信息</a></li>
                        <li><a href="searchScore.jsp"><i class="icon-font">&#xe003;</i>查询学生信息</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="icon-font">&#xe018;</i>修改</a>
                    <ul class="sub-menu">
                        <li><a href="updateStudentInfo.jsp"><i class="icon-font">&#xe018;</i>修改学生信息</a></li>
                        <li><a href="updateCourseInfo.jsp"><i class="icon-font">&#xe018;</i>修改课程信息</a></li>
                        <li><a href="updateScore.jsp"><i class="icon-font">&#xe018;</i>修改学生成绩</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="icon-font">&#xe017;</i>添加</a>
                    <ul class="sub-menu">
                        <li><a href="insertStudentInfo.jsp"><i class="icon-font">&#xe017;</i>添加学生信息</a></li>
                        <li><a href="insertCourseInfo.jsp"><i class="icon-font">&#xe017;</i>修改课程信息</a></li>
                        <li><a href="insertScore.jsp"><i class="icon-font">&#xe017;</i>添加学生成绩</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="icon-font">&#xe037;</i>删除</a>
                    <ul class="sub-menu">
                        <li><a href="deleteStudentInfo.jsp"><i class="icon-font">&#xe037;</i>删除学生信息</a></li>
                        <li><a href="deleteCourseInfo.jsp"><i class="icon-font">&#xe037;</i>删除课程信息</a></li>
                        <li><a href="deleteScore.jsp"><i class="icon-font">&#xe037;</i>删除学生成绩</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
    <!--/sidebar-->
</div>
</body>
</html>