<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&display=swap"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
<style type="text/css">
.imgdiv {
	position: relative;
	width: 577px;
	height: 577px;
	left: 363px;
	top: 120px;
	background: #D9D9D9;
	
}

.imgdiv .imgsub {
	margin-top: 24px;
	width: 124px;
	height: 124px; 
	background : #D9D9D9;
	float: left;
	margin-right: 24px;
	background: #D9D9D9;
}

.imgdiv .imgmain{
	width: 577px;
	height: 577px;
}

.btndiv{
position: absolute;
left: 1020px; 
top: 613px; 


}

.btndiv .heart, .btndiv .cart, .btndiv .buynow{
position: relative;
box-sizing: border-box; 
width: 84px; 
height: 84px; 
border: 1px solid #000000;
margin-right: 24px;
}
</style>
</head>
<%

%>
<body>
	<form action="">

		<div class="imgdiv">
			<img class="imgmain" alt="" src="/Model1-2/image/sofa/greensofa1.jpg">

			<img class="imgsub" alt="" src="/Model1-2/image/sofa/greensofa2.jpg" onclick="" >
			<img class="imgsub" alt="" src="/Model1-2/image/sofa/greensofa3.jpg">
			<img class="imgsub" alt="" src="/Model1-2/image/sofa/greensofa4.jpg">
		</div>

		<div class="btndiv">
			<button name="heart" class="heart">
			</button>
			<button name="cart" class="cart">
				<!--style="box-sizing: border-box; position: absolute; width: 84px; height: 84px; left: 1128px; top: 613px; border: 1px solid #000000;" -->	
			</button>
			<button name="buynow" class="buynow">
				<!-- style="position: absolute; width: 361px; height: 84px; left: 1236px; top: 613px; background: #D9D9D9; font-family: 'Inter'; font-style: normal; font-weight: 400; font-size: 16px; line-height: 19px; color: #000000;" -->
			BUY NOW
			</button>
		</div>
	</form>

</body>
</html>