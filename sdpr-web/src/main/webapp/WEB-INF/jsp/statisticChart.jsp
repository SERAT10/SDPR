<%--
  Created by IntelliJ IDEA.
  User: 71763
  Date: 2018/11/13
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Statistic Chart</title>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/staticResource/jquery/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticResource/css/init.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticResource/css/statistic.css">
    <script src="${pageContext.request.contextPath}/staticResource/scripts/echarts.js"></script>
    <script type="text/javascript">
        var path = "${pageContext.request.contextPath}";
    </script>
</head>
<body>
    <div class="point">
        <ul class="menu">
            <li>
                <a href="#NOP">
                    <img src="${pageContext.request.contextPath}/staticResource/images/top.png">
                </a>
                <p>Top</p>
            </li>
            <li>
                <a href="#NOP">
                    <img src="${pageContext.request.contextPath}/staticResource/images/publication.png">
                </a>
                <p>Number of Publication</p>
            </li>
            <li>
                <a href="#DOF">
                    <img src="${pageContext.request.contextPath}/staticResource/images/distribution.png">
                </a>
                <p>Distribution of Field</p>
            </li>
            <li>
                <a href="#RPOF">
                    <img src="${pageContext.request.contextPath}/staticResource/images/relative.png">
                </a>
                <p>Relative Proportion of Field</p>
            </li>
            <li>
                <a href="#SITW">
                    <img src="${pageContext.request.contextPath}/staticResource/images/world.png">
                </a>
                <p>Scholar in the World</p>
            </li>
            <li>
                <a href="#NOI">
                    <img src="${pageContext.request.contextPath}/staticResource/images/institutions.png">
                </a>
                <p>Number of Institutions</p>
            </li>
            <li>
                <a href="${pageContext.request.contextPath}/goAction/goIndex">
                    <img src="${pageContext.request.contextPath}/staticResource/images/search.png">
                </a>
                <p>Search</p>
            </li>
        </ul>
    </div>

    <!-- 出版社数量 -->
    <!--
        组合测试出版物的数量从1985年到2018年
        你需要改的是下面的js文件里面的数据
     -->
    <div class="NOP" id="NOP">
        <div class="number-of-publication">
            <p class="title">Number of Publication</p>
            <div class="line"></div>
            <p class="introduce">The annual and cumulative number of combinatorial testing publications.</p>
            <div class="figure" id="nop-charts"></div>
        </div>
    </div>
    <script type="text/javascript" src="${pageContext.request.contextPath}/staticResource/scripts/nop-charts.js"></script>

    <!-- 研究领域分布 -->
    <div class="DOF" id="DOF">
        <div class="distribution-of-field">
            <p class="title">Distribution of Field</p>
            <div class="line"></div>
            <p class="introduce">The distribution of different combinatorial testing research fields.</p>
            <div class="figure" id="dof-charts"></div>
        </div>
    </div>
    <script type="text/javascript" src="${pageContext.request.contextPath}/staticResource/scripts/dof-charts.js"></script>

    <!-- 研究领域相对比例 -->
    <div class="RPOF" id="RPOF">
        <div class="relative-proportion-of-field">
            <p class="title">Relative Proportion of Field</p>
            <div class="line"></div>
            <p class="introduce">The relative proportions of each combinatorial testing<br>research field for each year.</p>
            <div class="figure" id="rpof-charts"></div>
        </div>
    </div>
    <script type="text/javascript" src="${pageContext.request.contextPath}/staticResource/scripts/rpof-charts.js"></script>

    <!-- 世界学者 -->
    <div class="SITW" id="SITW">
        <div class="scholar-in-the-world">
            <p class="title">Scholar in the World</p>
            <div class="line"></div>
            <p class="introduce">The distribution of scholars of combinatorial testing<br>community all over the world.</p>
            <div class="figure" id="sitm-charts"></div>
        </div>
    </div>
    <script type="text/javascript" src="${pageContext.request.contextPath}/staticResource/scripts/world.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/staticResource/scripts/sitm-charts.js"></script>

    <!-- 机构数量 -->
    <div class="NOI" id="NOI">
        <div class="number-of-institutions">
            <p class="title">Number of Institutions</p>
            <div class="line"></div>
            <p class="introduce">The number of new institutions that contribute to combinatorial<br>testing community for each year.</p>
            <div class="figure" id="not-charts"></div>
        </div>
    </div>
    <%--<script type="text/javascript" src="${pageContext.request.contextPath}/staticResource/scripts/noi-chart.js"></script>--%>
</body>
</html>
