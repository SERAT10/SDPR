<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 71763
  Date: 2018/11/13
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Ranking Scheme</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/staticResource/bootstrap/css/bootstrap.min.css"/>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/staticResource/jquery/jquery-3.3.1.min.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/staticResource/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticResource/css/init.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticResource/css/rank.css">
</head>
<body>
<jsp:include page="top.jsp"/>

<div class="content">
    <div class="synopsis">
        <p class="name">Ranking Scheme</p>
        <p class="how">This ranking system applies a publication counting based criterion, and assumes that every
            scholar or institution contributes equally in each publication. Different publication venues are assigned to
            different weights to make the importance of each publication be accounted.</p>
        <div class="line"></div>
        <p class="none">In detail, the selected leading journals and conferences and their weights are as follows:</p>
        <ul>
            <li>TSE, IEEE Transactions on Software Engineering (3.0)</li>
            <li>TOSEM, ACM Transactions on Software Engineering and Methodology (3.0)</li>
            <li>JSS, Journal of Systems and Software (1.8)</li>
            <li>IST, Information and Software Technology (1.8)</li>
            <li>ESEM, Empirical Software Engineering (1.8)</li>
            <li>STVR, Software Testing, Verification and Reliability (1.8)</li>
        </ul>

        <ul>
            <li>ICSE, International Conference on Software Engineering (2.5)</li>
            <li>FSE, International Symposium on the Foundations of Software Engineering, (2.5)</li>
            <li>ASE, International Conference on Automated Software Engineering (1.5)</li>
            <li>ISSTA, International Symposium on Software Testing and Analysis (1.5)</li>
            <li>ISSRE, International Symposium on Software Reliability Engineering (1.5)</li>
            <li>ICSM, International Conference on Software Maintenance (1.5)</li>
            <li>PROMISE (1)</li>
        </ul>
        <div class="line"></div>
    </div>

    <p class="table-title">Top 30 Authors</p>

    <table class="table myself-table" id="authors-table">
        <thead>
            <tr>
                <th>#</th>
                <th>Name</th>
                <th>TSE</th>
                <th>TOSEM</th>
                <th>JSS</th>
                <th>IST</th>
                <th>EMSE</th>
                <th>STVR</th>
                <th>ICSE</th>
                <th>FSE</th>
                <th>ASE</th>
                <th>ISSTA</th>
                <th>ISSRE</th>
                <th>ICSM</th>
                <th>PROMISE</th>
                <th>Score</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${datas}" var="data" varStatus="status">
                <tr>
                    <td>${status.count}</td>
                    <c:forEach items="${data}" var="row">
                        <td>${row}</td>
                    </c:forEach>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <%-- 机构数据不足，该排名以后再添加 --%>
    <%--<p class="table-title">Top 30 Institutions</p>--%>

    <%--<table class="table myself-table" id="institutions-table">--%>
        <%--<thead>--%>
        <%--<tr>--%>
            <%--<th>#</th>--%>
            <%--<th>Name</th>--%>
            <%--<th>TSE</th>--%>
            <%--<th>TOSEM</th>--%>
            <%--<th>JSS</th>--%>
            <%--<th>IST</th>--%>
            <%--<th>EMSE</th>--%>
            <%--<th>STVR</th>--%>
            <%--<th>ICSE</th>--%>
            <%--<th>FSE</th>--%>
            <%--<th>ASE</th>--%>
            <%--<th>ISSTA</th>--%>
            <%--<th>ISSRE</th>--%>
            <%--<th>ICSM</th>--%>
            <%--<th>Other</th>--%>
            <%--<th>Score</th>--%>
        <%--</tr>--%>
        <%--</thead>--%>
        <%--<tbody>--%>
        <%--</tbody>--%>
    <%--</table>--%>
</div>
</body>
</html>
