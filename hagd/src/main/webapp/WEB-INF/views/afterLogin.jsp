<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta charset="utf-8">
<title>Main Page</title>
</head>
<style>
@media (min-width: 1200px)
.container, .container-lg, .container-md, .container-sm, .container-xl {
    max-width: 100%;
}
.container { max-width: 100%; }
.contentinner:hover{
  background: #c7c7c745;
}
</style>
<script>

<%if("/afterLogin".equals((String)request.getAttribute("path"))) { 
 if("SUCCESS".equals((String)request.getAttribute("loginStatus"))) { %>
alert('로그인 성공.');
<% } else { %>
alert('로그인 실패.');
location.href="${pageContext.request.contextPath}/";
<% }} %>

</script>
<body>
<%@include file = "header.jsp" %>
<div class="container"style="text-align: -webkit-center;">
<h1>Hit board</h1>
<%@include file = "orderByHit.jsp" %>
<div class="container inner"></div>
</div>

<c:forEach var="vo" items="${board}">
<div class="contentouter" style="text-align: -webkit-center;margin-top: 30px;" href="#" >
<div class="contentinner" style="display: -webkit-inline-box;border: 1px solid #83d0c9; width:60%">
<div class="productimg" style="height:200px; width:200px; background-color:grey;">
</div>
<div class="content" style=" margin-left: 30px;text-align: left;">
<p>${loginStatus}</p>
<h1>${vo.title}</h1>
<p>${vo.content}</p>

</div>
</div>
</div>
</c:forEach>

</body>
</html>