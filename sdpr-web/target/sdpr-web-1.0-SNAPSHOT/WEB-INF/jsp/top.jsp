<%--
  Created by IntelliJ IDEA.
  User: Chentyit
  Date: 2019/4/10
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/staticResource/bootstrap/css/bootstrap.min.css" />
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/staticResource/jquery/jquery-3.3.1.min.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/staticResource/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticResource/css/init.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticResource/css/top.css">
</head>
<body>
<div class="top clearfix">
    <!-- 返回搜索主页 -->
    <div class="go-home">
        <a href="${pageContext.request.contextPath}/rest/goAction/goIndex">
            <img src="${pageContext.request.contextPath}/staticResource/images/main.png">
        </a>
    </div>

    <!-- 搜索 -->
    <div class="search">
        <form action="${pageContext.request.contextPath}/rest/process/select?pageNum=1" method="post">
            <div class="input">
                <input type="text" name="search" placeholder="Search"/>
            </div>

            <div class="button">
                <button type="submit">
                    <img src="${pageContext.request.contextPath}/staticResource/images/search.png">
                </button>
            </div>
        </form>
    </div>
</div>
</body>
</html>
