<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@ include file="header.jsp" %>
<head>
	<style>
		section {
			text-align:center;
			line-height:5px;
			background-color:white;
			color:black;
			width:100%;
			height:100%;
			float:left;
			
	</style>
<meta charset="UTF-8">
<meta name="viweport" content="width=device-width",initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">

<title>JSP view</title>
</head>
<body>

	<section class="sub-con">
    
		<h2 class="sub-Title">Q&amp;A</h2>
		<div style="padding:5px;"> </div>
					<p class="sTxt">자동차가 필요한 순간 모카와 함께 하세요!</p>
					</section>
					<div style="padding:20px;"> </div>

 <div class="container">
 	<div class="row">
 	
 	<table class="table table-striped" style="text-align: center; border: 1px solid #dddddd">
 			<thead>
 			 <tr>
 				<th colspan="3" style="background-color: #eeeeee; text-align: center;">게시판 글 보기 </th>	
 			 </tr>
 			</thead>
 			<tbody>
 				<tr>
 					<td style="width: 20%;">글 제목</td>
 					<td colspan="2"></td>
 				</tr>
 					<tr>
 					<td>작성자</td>
 					<td colspan="2"></td>
 				</tr>
 				<tr>
 					<td>작성일자</td>
 					<td colspan="2"></td>
 				</tr>
 					<tr>
 					<td>내용</td>
 					 
 					<td colspan="2" style="min-height: 200px; text-align: left;"></td>
 				</tr>
 			</tbody>
 			
 			</table>
 			
 			<a href="bbs.jsp"  class="btn btn-primary " style="width:50px; height:30px;">목록</a>
 			
 			<a  class="btn btn-primary" style="width:50px; height:30px;">수정</a>
 			<a  class="btn btn-primary" style="width:50px; height:30px;">삭제</a>
 			
 	
 		
 			
 	</div>
 </div>
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
 <script src="js/bootstrap.js"></script>
</body>
</html>