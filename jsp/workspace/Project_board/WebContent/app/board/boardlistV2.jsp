<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="header.jsp" %>
<meta charset="UTF-8">
<title>공지사항</title>
<style>

 /* 	a:visited{
		color:#99209b;
		text-decoration:none;
	}
	a:hover{
		color:#99209b;
		text-decoration:none;
		font-weight:bold;
	}
 	a:link {
		color:#99209b;
		text-decoration:none;
	}  */
	table{
		margin: 0 auto;
	} 

	
	
	 

</style>
</head>
<body>
	<c:set var="boardList" value="${requestScope.boardList }"/>
	<c:set var="totalCnt" value="${requestScope.totalCnt }"/>
	
	<c:set var="nowPage" value="${requestScope.nowPage }"/>
	<c:set var="totalPage" value="${requestScope.totalPage }"/>
	<c:set var="startPage" value="${requestScope.startPage }"/>
	<c:set var="endPage" value="${requestScope.endPage }"/>
	
	
	<div class="col">
		<section class="py-5 text-center container">
		    <div class="row py-lg-5">
		      <div class="col-lg-6 col-md-8 mx-auto">
		        <h1 class="fw-light">공지사항</h1>
		        <p class="lead text-muted">자동차가 필요한 순간 모카와 함께하세요!</p>
		      </div>
		    </div>
		  </section>
	
	<div class="container">
		<div class="row">
			<form method="post" name="search" action="searchbbs.jsp">
				<table class="pull-right">
					<tr>
						<td><select class="form-control" name="searchField">
								<option value="0">선택</option>
								<option value="bbsTitle">제목</option>
								<option value="userID">작성자</option>
								<option value="contents">내용</option>
						</select></td>
						<td><input type="text" class="form-control"
							placeholder="검색어 입력" name="searchText" maxlength="100"></td>
						<td><button type="submit" class="btn btn-success">검색</button></td>
					</tr>

				</table>
			</form>
		</div>
	</div>	   
		  
		<table style="width: 900px;border: 0px;">
<!-- 			<tr align="center" valign="middle">
				<td><h3>MVC게시판</h3> </td>
			</tr>                            -->  
			<tr align="right" valign="middle">
				<td>글 개수 : ${totalCnt }개</td>
			</tr>
		</table>
		
		<table class="container table table-hover" border="1" style="border-collapse: collapse; border-spacing: 0;width: 900px" >
			<tr align="center" valign="middle">
				<th width="8%">번호</th>
				<th width="50%">제목</th>
				<th width="15%">작성자</th>
				<th width="17%">날짜</th>
				<th width="10%">조회수</th>
			</tr>
			<c:choose>
				<c:when test="${boardList != null and fn:length(boardList) > 0 }">
					<!-- 게시글 작성 : 글이 있는 경우 -->
					<c:forEach var="board" items="${boardList }">
						<tr align="center" valign="middle"
							onmouseover="this.style.background='#bbdefb'" 
							onmouseout="this.style.background=''" >
							<td height="23px;"> ${board.boardnum } </td>
							<td height="23px;"> 
								<a href="${pageContext.request.contextPath}/board/BoardView.mc?boardnum=${board.boardnum }">
									${board.boardtitle }
								</a> 
							</td>
							<td height="23px;"> ${board.username } </td>
							<td height="23px;"> ${board.boarddate } </td>
							<td height="23px;"> ${board.boardreadcount } </td>
						</tr>
					</c:forEach>
				</c:when>
				<c:otherwise>
					<!-- 게시글 작성 : 글이 없는 경우 -->
					<tr style="height: 50px">
						<td colspan="5" style="text-align: center;">등록된 게시물이 없습니다.</td>
					</tr>
				</c:otherwise>
			</c:choose>
		</table>
		<br>
		<table style="margin-left:180px;">
			<tr align="right" valign="middle">
				<td><a href="${pageContext.request.contextPath}/board/Boardlist.mc" class="btn btn-success pull-right" >목록</a></td> 
				<td><a href="${pageContext.request.contextPath}/board/BoardWrite.mc" class="btn btn-primary pull-right" >글쓰기</a></td>
			</tr>
		</table>
		<!-- 페이징 처리 -->
		<table style="border: 0px; width: 900px;">
			<tr align="center" valign="middle">
				<td>
				
					<c:if test="${nowPage > 1 }">
						<a href="${pageContext.request.contextPath}/board/Boardlist.mc?page=${nowPage-1}">[&lt;]</a>
					</c:if>
					
					<c:forEach var="i" begin="${startPage }" end="${endPage }">
						<c:choose>
							<%-- 현재 보고있는 페이지는 a tag 제거 --%>
							<c:when test="${i == nowPage }">[${i }]</c:when>
							<c:otherwise>
								<a href ="${pageContext.request.contextPath}/board/Boardlist.mc?page=${i}">[${i }]</a>							
							</c:otherwise>
						</c:choose>	
					</c:forEach>
					
					<c:if test="${nowPage < totalPage }">
						<a href="${pageContext.request.contextPath}/board/Boardlist.mc?page=${nowPage+1}">[&gt;]</a>
					</c:if>	
				</td>
			</tr>
		</table>
		
		
		
	</div>
</body>
<script type="text/javascript">
function filter() {
	
	var value, name, item, i;
	
	value = document.getElementById("value").value.toUpperCase();
	item = document.getElementsByClassName("item");
	
	for( i = 0; i < item.length; i++ ) {
		name = item[i].getElementsByClassName("name");
		if( name[0].innerHTML.toUpperCase().indexOf(value) > -1 ) {
			item[i].style.display = "block";
		} else {
			item[i].style.display = "none";
		}
	}
}

</script>



<%@ include file="footer.jsp"%>
</html>
















