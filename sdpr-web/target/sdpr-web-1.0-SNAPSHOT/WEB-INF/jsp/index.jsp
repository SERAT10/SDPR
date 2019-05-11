<%--
  Created by IntelliJ IDEA.
  User: Chentyit
  Date: 2019/4/9
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/staticResource/bootstrap/css/bootstrap.min.css"/>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/staticResource/jquery/jquery-3.3.1.min.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/staticResource/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticResource/css/init.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticResource/css/index.css">
    <script type="text/javascript">
        var index = 0;

        function surprise() {
            index++;
            if (index === 10) {
                alert("你触发了一个彩蛋");
            }
            if (index === 13) {
                alert("没啦，别点了");
            }
            if (index === 16) {
                alert("行吧，满足你一下，又双叒叕触发了一个");
                index = 0;
            }
        }
    </script>
</head>
<body>
<div class="header clearfix">
    <div class="tool-name">S&nbsp;&nbsp;D&nbsp;&nbsp;P&nbsp;&nbsp;R</div>

    <div class="tool-bar">
        <ul class="first-floor">
            <li class="first" title="Statistic Chart">
                <a href="${pageContext.request.contextPath}/goAction/goCharts">
                    <img src="${pageContext.request.contextPath}/staticResource/images/Statistic-Chart.png"/>
                </a>
                <p>Statistic Chart</p>
            </li>

            <li class="first" title="Scholar Rank">
                <a href="${pageContext.request.contextPath}/goAction/goScholarRank">
                    <img src="${pageContext.request.contextPath}/staticResource/images/Scholar-Rank.png"/>
                </a>
                <p>Scholar Rank</p>
            </li>

            <li class="first" title="All Thesis List">
                <a href="${pageContext.request.contextPath}/goAction/thesisList">
                    <img src="${pageContext.request.contextPath}/staticResource/images/All-Thesis-List.png"/>
                </a>
                <p>All Paper List</p>
            </li>

            <li class="first" title="Scholar & Institution">
                <a href="${pageContext.request.contextPath}/goAction/goScholarInstitution">
                    <img src="${pageContext.request.contextPath}/staticResource/images/Scholar-Institution.png"/>
                </a>
                <p>Scholar & Institution</p>
            </li>

            <li class="first" title="Theme Classify">
                <a href="${pageContext.request.contextPath}/goAction/goThemeClassify">
                    <img src="${pageContext.request.contextPath}/staticResource/images/Theme-Classify.png"/>
                </a>
                <p>Theme Classify</p>
            </li>

            <li class="first" title="Pubtication Venue">
                <a href="${pageContext.request.contextPath}/goAction/goPublicationVenue">
                    <img src="${pageContext.request.contextPath}/staticResource/images/Publication-Venue.png"/>
                </a>
                <p>Pubtication Venue</p>
            </li>
        </ul>
    </div>
</div>

<div class="search">
    <!-- 搜索背景 -->
    <div class="search-picture"></div>
    <!-- 背景覆盖 -->
    <div class="search-topLayer"></div>
    <!-- 信息选择检索 -->
    <div class="search-topLayer-top">
        <p class="SDPR">Software Defect Prediction Repositories</p>

        <p class="pages">all <button class="btn btn-info" onclick="surprise()">${count}</button> publications</p>

        <form action="${pageContext.request.contextPath}/process/select?pageNum=1" method="post">
            <div class="input">
                <input type="text" name="search" placeholder="TITLE" class="title"/>
            </div>
            <div class="button">
                <button type="submit">SEARCH</button>
            </div>
        </form>
    </div>
</div>

<div class="about">
    <div class="about-top">ABOUT</div>

    <div class="line"></div>

    <div class="about-content">
        This repository is designed and maintained by
        <a href="https://smartse.github.io/" target="_blank">Chen Xiang</a>,
        <a href="#" target="_blank">Liu Ke</a> and
        <a href="http://www.chentyit.cn/" target="_blank">Chen Tianyi</a>.<br>
        We warmly welcome any comments and suggestions about this repository.<br>
        If any of your paper is missed, please let us know.
    </div>
</div>

<!--尾部-->
<div class="footer">
    黔ICP备18007069号-2
</div>
</body>
</html>
