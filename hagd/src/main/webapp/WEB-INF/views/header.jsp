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

.container { max-width: 100%; }
</style>
</head>
<body>
<!-- header -->
<div class="container" style="background-color:#35a79c; height:100px;"  >

<!-- profile -->
<div class="profile" style="width: 50px;height: 50px;background-color:grey;float: right;border-radius: 60%; margin-top: 30px;" id="dropdownMenuButton" data-toggle="dropdown" aria-expanded="false">
	<div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
	<!-- dropdown -->
		<a class="dropdown-item" href="#">정보
		<!-- user switch -->
			<div class="custom-control custom-switch">
  				<input type="checkbox" class="custom-control-input" id="customSwitch1" checked>
 		 		<label class="custom-control-label" for="customSwitch1">사용자 전환</label>
			</div><!-- end of user switch **have to ask how to let drop down fixed when it's clicked like <th>tag in table -->
			
		</a>
		<a class="dropdown-item" href="#">정보수정</a>
		<a class="dropdown-item" href="#">메세지</a>
		<a class="dropdown-item" href="#">히스토리</a>
	</div><!-- end of dropdown -->
</div> <!-- end of profile -->

<!-- search -->
<form> 
<div class="search" style=" align-content: center; text-align: center;margin-top: 40px;">
<input type="text" name="search">
<input type="submit" value="ok">
</div>
</form> <!-- end of search -->


</div><!-- end of header -->
</body>
</html>