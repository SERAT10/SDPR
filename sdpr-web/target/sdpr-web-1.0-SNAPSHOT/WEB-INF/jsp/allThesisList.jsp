<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 71763
  Date: 2018/11/13
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>All Paper List</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/staticResource/bootstrap/css/bootstrap.min.css" />
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/staticResource/jquery/jquery-3.3.1.min.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/staticResource/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticResource/css/init.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticResource/css/paper.css">
</head>
<body>
<jsp:include page="top.jsp"/>

<div class="content">
    <div class="page-num">
        <button type="button" class="btn btn-info my-btn" id="list-num" disabled="disabled">${count}</button>
        <p>Pages found</p>
    </div>

    <c:forEach items="${thesisList}" var="thesis">
        <ul class="list-group my-group" style="opacity: 0.8">
            <li class="list-group-item">作者:&nbsp;${thesis.themeAuthor}</li>
            <li class="list-group-item">论文标题:&nbsp;${thesis.thesisTitle}</li>
            <c:if test="${thesis.thesisClassic == 0}">
                <li class="list-group-item">论文来源:&nbsp;${thesis.thesisOrganization}</li>
            </c:if>
            <c:if test="${thesis.thesisClassic == 1}">
                <li class="list-group-item">论文来源:&nbsp;${thesis.thesisPublisher}</li>
            </c:if>
            <li class="list-group-item">年份:&nbsp;${thesis.thesisYear}</li>
            <li class="list-group-item">
                <a href="#" data-toggle="collapse" data-target="#thesis${thesis.thesisId}">BibTex</a>
                <div id="thesis${thesis.thesisId}" class="collapse">${thesis.thesisBibtex}</div>
            </li>
            <li class="list-group-item">
                <a href="${thesis.thesisDoi}">DOI</a>
            </li>
        </ul>
    </c:forEach>

    <ul class="pagination container justify-content-center">
        <li class="page-item">
            <c:choose>
                <c:when test="${search != null}">
                    <a class="page-link" href="${pageContext.request.contextPath}/rest/process/select?pageNum=${pageInfo.prePage}&search=${search}">&laquo;</a>
                </c:when>
                <c:when test="${journalName != null}">
                    <a class="page-link" href="${pageContext.request.contextPath}/rest/process/selectJournal?pageNum=${pageInfo.prePage}&journalName=${journalName}">&laquo;</a>
                </c:when>
                <c:when test="${bookTitleName != null}">
                    <a class="page-link" href="${pageContext.request.contextPath}/rest/process/selectBookTitle?pageNum=${pageInfo.prePage}&bookTitleName=${bookTitleName}">&laquo;</a>
                </c:when>
                <c:when test="${themeId != 0}">
                    <a class="page-link" href="${pageContext.request.contextPath}/rest/process/selectTheme?pageNum=${pageInfo.prePage}&themeId=${themeId}">&laquo;</a>
                </c:when>
            </c:choose>
        </li>
        <c:forEach items="${pageInfo.navigatepageNums}" var="i">
            <c:choose>
                <c:when test="${pageInfo.pageNum == i}">
                    <li class="page-item active">
                </c:when>
                <c:otherwise>
                    <li class="page-item">
                </c:otherwise>
            </c:choose>
            <c:choose>
                <c:when test="${search != null}">
                    <a class="page-link" href="${pageContext.request.contextPath}/rest/process/select?pageNum=${i}&search=${search}">${i}</a>
                </c:when>
                <c:when test="${journalName != null}">
                    <a class="page-link" href="${pageContext.request.contextPath}/rest/process/selectJournal?pageNum=${i}&journalName=${journalName}">${i}</a>
                </c:when>
                <c:when test="${bookTitleName != null}">
                    <a class="page-link" href="${pageContext.request.contextPath}/rest/process/selectBookTitle?pageNum=${i}&bookTitleName=${bookTitleName}">${i}</a>
                </c:when>
                <c:when test="${themeId != 0}">
                    <a class="page-link" href="${pageContext.request.contextPath}/rest/process/selectTheme?pageNum=${i}&themeId=${themeId}">${i}</a>
                </c:when>
            </c:choose>
            </li>
        </c:forEach>
        <li class="page-item">
            <c:choose>
                <c:when test="${search != null}">
                    <a class="page-link" href="${pageContext.request.contextPath}/rest/process/select?pageNum=${pageInfo.nextPage}&search=${search}">&raquo;</a>
                </c:when>
                <c:when test="${journalName != null}">
                    <a class="page-link" href="${pageContext.request.contextPath}/rest/process/selectJournal?pageNum=${pageInfo.nextPage}&journalName=${journalName}">&raquo;</a>
                </c:when>
                <c:when test="${bookTitleName != null}">
                    <a class="page-link" href="${pageContext.request.contextPath}/rest/process/selectBookTitle?pageNum=${pageInfo.nextPage}&bookTitleName=${bookTitleName}">&raquo;</a>
                </c:when>
                <c:when test="${themeId != 0}">
                    <a class="page-link" href="${pageContext.request.contextPath}/rest/process/selectTheme?pageNum=${pageInfo.nextPage}&themeId=${themeId}">&raquo;</a>
                </c:when>
            </c:choose>
        </li>
    </ul>
</div>
</body>
</html>