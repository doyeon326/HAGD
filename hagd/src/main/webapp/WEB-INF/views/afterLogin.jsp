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
</style>
<body>
<%@include file = "header.jsp" %>

<div class="contentouter" style="text-align: -webkit-center;margin-top: 20px;" >
<div class="contentinner" style="display: -webkit-inline-box;background-color: #83d0c9; width:60%">
<div class="productimg" style="height:100px; width:100px; background-color:grey;">
</div>
<div class="content" style=" margin-left: 30px;text-align: left;">
<h1>글제목</h1>
<p>내용입니다</p>
</div>
</div>
</div>
</body>
</html>