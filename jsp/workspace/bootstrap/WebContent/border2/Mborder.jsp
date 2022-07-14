<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="header.jsp" %>


<div class="col">
<section class="py-5 text-center container">
    <div class="row py-lg-5">
      <div class="col-lg-6 col-md-8 mx-auto">
        <h1 class="fw-light">공지사항</h1>
        <p class="lead text-muted">자동차가 필요한 순간 모카와 함께하세요!</p>
      </div>
    </div>
  </section>
  
  <div class="search-wrap">
				<div class="select-box">
					<select class="selectbox" name="searchCondition" id="searchCondition">
						<option value="" selected="selected">전체</option>
						<option value="1" >제목</option>
						<option value="2" >내용</option>
					</select>
				</div>

				<nav class="navbar navbar-light bg-light">
				  <div class="container-fluid">
				    <form class="d-flex">
				      <input class="form-control me-2" type="Search" placeholder="검색어를 입력해주세요." aria-label="search">
				      <button class="btn btn-outline-success" type="submit">검색</button>
				    </form>
				  </div>
				</nav>
			</div>
  
  
<table class="container table table-hover">
	<thead>
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>날짜</th>
		<th>조회수</th>
	</tr>
	</thead>
	<tbody>
	<tr>
		<td>1</td>	
		<td>공지사항</td>	
		<td>운영자</td>	
		<td>2020.06.10</td>	
		<td>1</td>
	</tr>	
	<tr>
		<td>2</td>	
		<td>필독해주세요</td>	
		<td>운영자</td>	
		<td>2020.06.10</td>	
		<td>1</td>
	</tr>	
	<tr>
		<td>3</td>	
		<td>주의사항</td>	
		<td>운영자</td>	
		<td>2020.06.10</td>	
		<td>1</td>
	</tr>	
	</tbody>		
</table>

<hr/>
<div class="text-end">

<a href="border.jsp" class="btn btn-success">목록</a>
<a class="btn btn-secondary">수정</a>
<a class="btn btn-danger">삭제</a>
<a href="BorderWrite.jsp" class="btn btn-primary pull-right">글쓰기</a>


<div class="text-center">
	<nav aria-label="Page navigation example">
  <ul class="pagination">
    <li class="page-item">
      <a class="page-link" href="#" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
      </a>
    </li>
    <li class="page-item"><a class="page-link" href="#">1</a></li>
    <li class="page-item"><a class="page-link" href="#">2</a></li>
    <li class="page-item"><a class="page-link" href="#">3</a></li>
    <li class="page-item">
      <a class="page-link" href="#" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
    </li>
  </ul>
</nav>
	</div>
</div>

</div>

<%@ include file="footer.jsp"%>