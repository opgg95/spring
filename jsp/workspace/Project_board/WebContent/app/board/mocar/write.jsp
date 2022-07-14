<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@ include file="header.jsp"%>
<main class="ms-sm-auto col-md-9 col-lg-10">
<div class="container col" style="margin-bottom:300px;">
	<div class="grid text-center" style="margin-top:200px;">
		<h1>
			<strong>Q&amp;A</strong>
		</h1>
	</div>
	<div class="grid text-center mb-5">
		<h4>Mo Car에게 궁금한 것을 물어보세요!</h4>
	</div>

 <div class="container">
 	<div class="row">
 	<form method="post" action="writeAction.jsp">
 	<table class="table table-striped" style="text-align: center; border: 1px solid #dddddd">
 			<thead>
 			 <tr>
 				<th colspan="2" style="background-color: #eeeeee; text-align: center;">게시판 글쓰기 양식</th>
 				
 			 </tr>
 			</thead>
 			<tbody>
 				<tr>
 						<td><input type="text" class="form-control" placeholder="글제목" name="bbsTitle" maxlength="50"></td>
 					</tr>
 					<tr>
 						<td><textarea class="form-control" placeholder="글내용" name="bbsContent" maxlength="2048" style="height:350px;"></textarea></td>
 					</tr>	
 			</tbody>			
 			</table>
 			<input type="submit" class="btn btn-primary pull-right" style="width:1150px; height:30px;" value="확인">
 			
 	</form>
 		
 			
 	</div>
 </div>
</main>
<%@ include file="footer.jsp"%>