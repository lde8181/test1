<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
<script type="text/javascript" src="/TestProject/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/TestProject/js/bootstrap.min.js"></script>
<link href="/TestProject/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript">
window.onload=function(){
	 alert("regist 페이지입니다.");
};

$(function(){
	$("#repw").blur(function(){
		var a = $("#pw").val();
		var b = $("#repw").val();
		if(a!=b){
			$("#ans").text("패스워드가 일치하지 않습니다");
			$("#ans").css("color","red");
		}else{
			$("#ans").text("패스워드가 일치합니다");
			$("#ans").css("color","green");
		}
});
});
$(function(){
	   $("#move").click(function(){
	      location.href = "/TestProject/BBSListServlet";
	   });
	});

</script>
</head>
<body>
<form action="/TestProject/RegistServlet" method="post">
	<div class="container-fluid">
    <section class="container">
		<div class="container-page">				
			<div class="col-md-6">
				<h3 class="dark-grey">Registration</h3>
				
				<div class="form-group col-sm-12">
					<label for="id">ID</label>
					<input type="text" name="id" 
					class="form-control" 
					id="id" placeholder="ID">
				</div>
				
				<div class="form-group col-sm-6">
					<label for="pw">Password</label>
					<input type="password" name="pw" 
					class="form-control" id="pw" 
					placeholder="PW">
				</div>
				
				<div class="form-group col-sm-6">
					<label for="repw">Repeat Password</label>
					<input type="password" 
					name="repw" class="form-control" 
					id="repw" placeholder="Repeat Password">
				</div>
				<div class="form-group col-sm-12">
					<p id="ans"></p>
				</div>
								
				<div class="form-group col-sm-6">
					<label for="name">Name</label>
					<input type="text" name="name" 
					class="form-control" id="name" 
					placeholder="이름">
				</div>
				
				<div class="form-group col-sm-6">
					<label>Gender</label>
					<label for="gender">
					<input type="radio" 
					name="gender" class="form-control" 
					id="gender" value="남">남</label>
					<label for="gender">
					<input type="radio" 
					name="gender" class="form-control" 
					id="gender" value="여">여</label>
				</div>			
				
				<div class="form-group col-sm-6">
					<label for="age">AGE</label>
					<input type="text" name="age" 
					class="form-control" id="age" 
					placeholder="나이">
				</div>				
				
				<div class="form-group col-sm-6">
					<label for="job">JOB</label>
					<input type="text" name="job" 
					class="form-control" id="job" 
					placeholder="직업">
				</div>
				
				<div class="form-group col-sm-6">
					<label for="address">Address</label>
					<input type="text" name="address" 
					class="form-control" id="address" 
					placeholder="주소">
				</div>
				
				<div class="form-group col-sm-6">
					<button type="submit"
					class="btn btn-primary">등록</button>
				</div>
			</div>
		</div>
	</section>
</div>
</form>
<div class="col-sm-12">
	<button id="move">이동</button>
</div> 
</body>
</html>