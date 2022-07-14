<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@ include file="header.jsp" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
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

<title>JSP login</title>
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
 				<th style="background-color: #eeeeee; text-align: center;">번호</th>
 				<th style="background-color: #eeeeee; text-align: center;">제목</th>
 				<th style="background-color: #eeeeee; text-align: center;">작성자</th>
 				<th style="background-color: #eeeeee; text-align: center;">작성일</th>
 			 </tr>
 			</thead>
 			<tbody>
 				<tr>
 					<td>1</td>
 					<td>안녕하세요</td>
 					<td>조민우</td>
 					<td>2022-06-07</td>
 				
 				</tr>
 			</tbody>
 			</table>
 			 <div class="btn-group me-2" role="group" aria-label="First group">
    <button type="button" class="btn btn-outline-secondary ">1</button>
    <button type="button" class="btn btn-outline-secondary ">2</button>
    <button type="button" class="btn btn-outline-secondary ">3</button>
    <button type="button" class="btn btn-outline-secondary ">4</button>
  </div>
  
 			<a class ="btn btn=success btn-arraw-left"></a>
 			<a href="write.jsp" class="btn btn-primary pull-right">글쓰기</a>
 	</div>
 </div>
 	
 	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
 	<script src="js/bootstrap.js"></script>
 	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>