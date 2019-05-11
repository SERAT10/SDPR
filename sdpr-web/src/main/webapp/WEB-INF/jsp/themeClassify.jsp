<%--
  Created by IntelliJ IDEA.
  User: 71763
  Date: 2018/11/13
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Research Field</title>
	<link rel="stylesheet" type="text/css"
		  href="${pageContext.request.contextPath}/staticResource/bootstrap/css/bootstrap.min.css" />
	<script type="text/javascript"
			src="${pageContext.request.contextPath}/staticResource/jquery/jquery-3.3.1.min.js"></script>
	<script type="text/javascript"
			src="${pageContext.request.contextPath}/staticResource/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticResource/css/init.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticResource/css/top.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticResource/css/research.css">
</head>
<body>
	<jsp:include page="top.jsp" />

	<div class="content">
	    <div class="my-row">
	        <div class="my-col">
	            <a href="${pageContext.request.contextPath}/process/selectTheme?pageNum=1&themeId=1">
					<div class="field-name">A</div>
				</a>
	            <div class="field-content">Studies on identifying parameters, values, and the interrelations of parameters of software under test. It is the fundamental activity of combinatorial testing.</div>
	        </div>
	        <div class="my-col">
	            <a href="${pageContext.request.contextPath}/process/selectTheme?pageNum=1&themeId=2">
					<div class="field-name">B</div>
				</a>
	            <div class="field-content">Studies on generating as small test suites as possible. It is the most popular field in combinatorial testing. The many proposed techniques consist of mathematical methods, greedy methods, and search based methods.</div>
	        </div>
	        <div class="my-col">
	            <a href="${pageContext.request.contextPath}/process/selectTheme?pageNum=1&themeId=3">
					<div class="field-name">C</div>
				</a>
	            <div class="field-content">Studies on improving the test suite by prioritization, minimization and selection techniques.</div>
	        </div>
	    </div>
	
	    <div class="my-row">
	        <div class="my-col">
	            <a href="${pageContext.request.contextPath}/process/selectTheme?pageNum=1&themeId=4">
					<div class="field-name">D</div>
				</a>
	            <div class="field-content">Studies on locating the concrete failure causing interactions.</div>
	        </div>
	        <div class="my-col">
	            <a href="${pageContext.request.contextPath}/process/selectTheme?pageNum=1&themeId=5">
					<div class="field-name">E</div>
				</a>
	            <div class="field-content">Studies on measuring the effectiveness of CT and comparing CT with other testing methods.</div>
	        </div>
	        <div class="my-col">
	            <a href="${pageContext.request.contextPath}/process/selectTheme?pageNum=1&themeId=6">
					<div class="field-name">F</div>
				</a>
	            <div class="field-content">Studies on applying, improving, and popularizing CT and its procedures in real world.</div>
	        </div>
	    </div>

		<%--<div class="Tag-introduce">--%>
			<%--<p>Tags</p>--%>
			<%--<div class="tag-item">--%>
				<%--<a class="btn btn-info" href="${pageContext.request.contextPath }/article/searchAll.action">Search Bassed</a>--%>
				<%--<p>The problem is formulated to an optimization problem, and heuristic search based algorithms are used to find solutions.</p>--%>
			<%--</div>--%>
			<%--<div class="tag-item">--%>
				<%--<a class="btn btn-info" href="${pageContext.request.contextPath }/article/searchAll.action">Constraint</a>--%>
				<%--<p>The invalid combinations are identified, and constraint solving techniques are applied.</p>--%>
			<%--</div>--%>
			<%--<div class="tag-item">--%>
				<%--<a class="btn btn-info" href="${pageContext.request.contextPath }/article/searchAll.action">Priority</a>--%>
				<%--<p>The order of test suite is important.</p>--%>
			<%--</div>--%>
			<%--<div class="tag-item">--%>
				<%--<a class="btn btn-info" href="${pageContext.request.contextPath }/article/searchAll.action">Reduction</a>--%>
				<%--<p>The size of test suite is reduced without impacting some given metrics.</p>--%>
			<%--</div>--%>
			<%--<div class="tag-item">--%>
				<%--<a class="btn btn-info" href="${pageContext.request.contextPath }/article/searchAll.action">Sequence CA</a>--%>
				<%--<p>The covering array to test the sequences of events.</p>--%>
			<%--</div>--%>
			<%--<div class="tag-item">--%>
				<%--<a class="btn btn-info" href="${pageContext.request.contextPath }/article/searchAll.action">Adaptive CT</a>--%>
				<%--<p>The initial testing results are used to feedback and guide next testing procedures.</p>--%>
			<%--</div>--%>
			<%--<div class="tag-item">--%>
				<%--<a class="btn btn-info" href="${pageContext.request.contextPath }/article/searchAll.action">Software Product Line</a>--%>
				<%--<p>The CT method is applied to test software product lines (SPL).</p>--%>
			<%--</div>--%>
			<%--<div class="tag-item">--%>
				<%--<a class="btn btn-info" href="${pageContext.request.contextPath }/article/searchAll.action">Tool</a>--%>
				<%--<p> Testing tools for CT.</p>--%>
			<%--</div>--%>
			<%--<div class="tag-item">--%>
				<%--<a class="btn btn-info" href="${pageContext.request.contextPath }/article/searchAll.action">Survey</a>--%>
				<%--<p>Survey works.</p>--%>
			<%--</div>--%>
		<%--</div>--%>
	</div>
</body>
</html>
