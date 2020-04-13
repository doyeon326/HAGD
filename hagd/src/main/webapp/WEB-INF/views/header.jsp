<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<meta charset="utf-8">
<title>Insert title here</title>
<style>
.dropdown-menu {
    width: 300px !important;
    height: 400px !important;
}
.dropdown-item{
	font-size: 20px !important;
}
.container { max-width: 100%; }

</style>
</head>
<body>
<!-- header -->
<div class="container" style="background-color:#35a79c; height:100px;"  >

<!-- profile -->
<div class="dropdown">
  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="float:right; height: 39.5px;
    width: 47px;">
  </button>
  
  
<div class="dropdown-menu">
  <form class="px-4 py-3">
    <div class="form-group">
 		<h1>${user.get(0).getId()}</h1>
 		<p>${stat}입니다</p>
    </div>

  </form>
  
  <div class="dropdown-divider"></div>
  
  <ul>
   <li class="dropdown-submenu"> <a class="dropdown-item dropdown-toggle" href="${pageContext.request.contextPath}/switchUserStat?stat=${stat}" >Switch Account</a> 
   <ul class="dropdown-menu">
   		<li><a class="dropdown-item" href="#">seller</a></li>
   </ul>
   </li>
 <li> <a class="dropdown-item" href="${pageContext.request.contextPath}/history">History</a> </li>
 <li> <a class="dropdown-item" href="#">Message</a> </li>
 <li> <a class="dropdown-item" href="#">Write</a> </li>
 <li> <a class="dropdown-item" href="#">Message</a> </li>
  <li> <a class="dropdown-item" href="#">Logout</a> </li>
  
  
  </ul>

  

</div><!-- end of profile -->

<!-- search -->
<form action="${pageContext.request.contextPath}/search" method="GET"> 
<div class="search" style=" align-content: center; text-align: center;margin-top: 40px;">
<input type="text" name="search">
<input type="submit" value="ok">
</div>
</form> <!-- end of search -->


</div><!-- end of container -->
</div><!-- end of header -->
</body>
</html>