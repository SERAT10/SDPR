<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Chentyit
  Date: 2019/5/10
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script type="application/x-javascript">
        addEventListener("load", function() {
            setTimeout(hideURLbar, 0);
            },
            false
        );
        function hideURLbar() {
            window.scrollTo(0,1);
        }
    </script>
    <meta name="keywords" content="Flat Dark Web Login Form Responsive Templates, Iphone Widget Template, Smartphone login forms,Login form, Widget Template, Responsive Templates, a Ipad 404 Templates, Flat Responsive Templates" />
    <link href="${pageContext.request.contextPath}/staticResource/manage/login/css/style.css" rel='stylesheet' type='text/css' />
    <!--webfonts-->
    <link href='#css?family=PT+Sans:400,700,400italic,700italic|Oswald:400,300,700' rel='stylesheet' type='text/css'>
    <link href='#css?family=Exo+2' rel='stylesheet' type='text/css'>
    <!--//webfonts-->
    <script src="http://ajax.useso.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
</head>
<body>
<script>$(document).ready(function(c) {
    $('.close').on('click', function(c){
        $('.login-form').fadeOut('slow', function(c){
            $('.login-form').remove();
        });
    });
});
</script>
    <!--SIGN UP-->
    <h1>SDPR Manager Login</h1>

    <div class="login-form">
        <div class="close"> </div>
        <div class="head-info">
            <label class="lbl-1"> </label>
            <label class="lbl-2"> </label>
            <label class="lbl-3"> </label>
        </div>
        <div class="clear"> </div>

        <div class="avtar">
            <img src="${pageContext.request.contextPath}/staticResource/manage/login/images/avtar.png"  alt="头像"/>
        </div>

        <form method="post" action="${pageContext.request.contextPath}/rest/manage/index">
            <c:if test="${sessionScope.manager == null}">
                <p>没有该管理员，请联系高级管理员进行操作</p>
            </c:if>
            <input type="text"
                   class="text"
                   placeholder="LoginName"
                   name="managerName"
                   onfocus="this.value = '';"
                   onblur="if (this.value == '') {this.value = 'Username';}">

            <div class="key">
                <input type="password"
                       placeholder="LoginPassword"
                       name="managerPassword"
                       onfocus="this.value = '';" 
                       onblur="if (this.value == '') {this.value = 'Password';}"/>
            </div>

            <div class="signin">
                <input type="submit" value="Login" >
            </div>
        </form>
    </div>
</body>
</html>
