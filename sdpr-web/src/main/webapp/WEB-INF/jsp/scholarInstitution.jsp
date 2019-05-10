<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 71763
  Date: 2018/11/13
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Scholar&Institution</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/staticResource/bootstrap/css/bootstrap.min.css"/>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/staticResource/jquery/jquery-3.3.1.min.js"></script>
    <script type="text/javascript"
            src="${pageContext.request.contextPath}/staticResource/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticResource/css/init.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/staticResource/css/scholar.css">
</head>
<body>

<jsp:include page="top.jsp"/>

<div class="content">
    <div class="my-aside-nav">
        <ul class="list-group">
            <li class="list-group-item"><a href="#Scholar" style="color: #000000;">Scholar</a></li>
            <li class="list-group-item"><a href="#Institution" style="color: #000000;">Institution</a></li>
            <li class="list-group-item"><a href="#Country" style="color: #000000;">Country</a></li>
        </ul>
    </div>

    <div class="my-information">
        <%--  此处代码逻辑比较硬核，但是我在当时觉得最有效的方法了，如果有需要阅读这段代码，那以下的注释会很有必要仔细查看  --%>
        <div class="list Scholar" id="Scholar">
            <p>Scholar</p>

            <%--
                从后台获取一个 Map，类型是 Map<String, List<String>>
                key 值代表的是开头的是什么字母
                value 是这个字母相关的学者姓氏
            --%>
            <c:forEach items="${lastNameMap}" var="lastNameAlphabet" varStatus="status">

                <%-- 这里过滤掉 value 为0的键值对 --%>
                <c:if test="${lastNameAlphabet.value.size() != 0}">
                    <span class="area-name">${lastNameAlphabet.key}</span>

                    <%-- 下面的代码逻辑有些许复杂，分为两种情况，数据只有一行，和数据有多行 --%>
                    <table class="table table-hover my-list">
                        <tbody>
                        <%--
                            情况一：
                            数据量超过4个，也就是一行应该有的数目
                        --%>
                        <c:if test="${lastNameAlphabet.value.size() >= 4}">
                            <%-- 先将满足一行4个的情况打印出来，显示到页面 --%>
                            <c:forEach begin="1" end="${lastNameAlphabet.value.size() / 4}" var="row">
                                <c:set value="${row}" var="r"/>
                                <tr>
                                    <c:forEach begin="0" end="3" var="col">
                                        <td><a href="#">${lastNameAlphabet.value.get((row - 1) * 4 + col)}</a></td>
                                    </c:forEach>
                                </tr>
                            </c:forEach>
                            <%-- 最后把剩余几个打印完成 --%>
                            <tr>
                                <c:forEach begin="${r * 4}" end="${lastNameAlphabet.value.size() - 1}" var="col">
                                    <td><a href="#">${lastNameAlphabet.value.get(col)}</a></td>
                                </c:forEach>
                                <%-- 这个的作用就是补全表格，要不然前端显示会有问题 --%>
                                <c:forEach begin="1" end="${(r + 1) * 4 - lastNameAlphabet.value.size()}">
                                    <td></td>
                                </c:forEach>
                            </tr>
                        </c:if>

                        <%--
                            情况二：
                            不满足一行4个，直接遍历就行
                        --%>
                        <c:if test="${lastNameAlphabet.value.size() < 4}">
                            <c:forEach items="${lastNameAlphabet.value}" var="lastName">
                                <td><a href="#">${lastName}</a></td>
                            </c:forEach>
                            <%-- 这个的作用就是补全表格，要不然前端显示会有问题 --%>
                            <c:forEach begin="1" end="${4 - lastNameAlphabet.value.size()}" var="i">
                                <td></td>
                            </c:forEach>
                        </c:if>
                        </tbody>
                    </table>
                </c:if>
            </c:forEach>
        </div>

        <div class="list Institution" id="Institution">
            <p>Institution</p>

            <span class="area-name">A</span>

            <table class="table table-hover my-list">
                <tbody>
                <tr>
                </tr>
                </tbody>
            </table>
        </div>

        <div class="list Country" id="Country">
            <p>Country</p>

            <span class="area-name">A</span>

            <table class="table table-hover my-list">
                <tbody>
                <tr>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
<%--
    写在后面：
    这里的代码相当硬核，但是因为 jstl 语法和 java 语法差别实在太大
    在目前看来，我只能用这种方式实现了，感谢阅读这么垃圾的代码（溜）
--%>
</body>
</html>
