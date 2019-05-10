<%--
  Created by IntelliJ IDEA.
  User: 71763
  Date: 2018/11/13
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Publication Venue</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/staticResource/bootstrap/css/bootstrap.min.css"/>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/staticResource/jquery/jquery-3.3.1.min.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/staticResource/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticResource/css/init.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticResource/css/pubtication.css">
</head>
<body>
<jsp:include page="top.jsp" />

<div class="list">
    <div class="rj">
        <p class="title">Refereed Journals</p>
        <div class="line"></div>
        <c:forEach items="${journalList}" var="journal">
            <a href="${pageContext.request.contextPath}/rest/process/selectJournal?pageNum=1&journalName=${journal}">
                <p class="element">${journal}</p>
            </a>
        </c:forEach>
    </div>
    <div class="rc">
        <p class="title">Refereed Conferences</p>
        <div class="line"></div>
        <c:forEach items="${conferenceList}" var="conference">
            <a href="${pageContext.request.contextPath}/rest/process/selectBookTitle?pageNum=1&bookTitleName=${conference}">
                <p class="element">${conference}</p>
            </a>
        </c:forEach>
    </div>
    <div class="others">
        <p class="title">Others</p>
        <div class="line"></div>
        <%--<c:forEach items="${otherList }" var="other">--%>
            <%--<a href="${pageContext.request.contextPath }/article/searchByArticle.action?publisher=${other }">--%>
                <%--<p class="element">${other }</p>--%>
            <%--</a>--%>
        <%--</c:forEach>--%>
    </div>
</div>
</body>
</html>
