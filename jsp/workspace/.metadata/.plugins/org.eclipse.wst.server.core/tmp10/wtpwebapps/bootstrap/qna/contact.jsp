<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="header.jsp"%>
<main class="col-md-9 ms-sm-auto col-md-9 ms-sm-auto col-lg-10" >
<div class="container col" style="margin-bottom:300px;">
	<div class="grid text-center" style="margin-top: 200px;" >
		<h1>
			<strong>CONTACT</strong>
		</h1>
	</div>
	<div class="grid text-center mb-5">
		<h4>궁금한 점이 있다면 Mo Car에게 문의하세요!</h4>
	</div>
	<div class="container row mx-auto">
		<div class="row g-3">
			<div class="form-floating col">
				<input type="text" class="form-control" id="floatingInput" placeholder="title"
					aria-label="title">
				<label for="floatingInput">title</label>
			</div>
			<div class="form-floating col">
				<input type="text" class="form-control" id="floatingInput" placeholder="name"
					aria-label="name">
				<label for="floatingInput">name</label>
			</div>
		</div>
		<div class="row g-3">
			<div class="form-floating col">
			  <input type="email" class="form-control" id="floatingInput" placeholder="name@example.com">
			  <label for="floatingInput">Email</label>
			</div>
			<div class="form-floating col">
			  <input type="email" class="form-control" id="floatingInput" placeholder="010-0000-0000">
			  <label for="floatingInput">phone</label>
			</div>
		</div>
		<div class="row g-3">
			<div class="form-floating">
			  <textarea class="form-control" placeholder="Leave a comment here" id="floatingTextarea1" style="height: 200px"></textarea>
			  <label for="floatingTextarea2">Comments</label>
			</div>
		</div>
		<div class="text-center">
			<button type="button" class="btn btn-outline-primary w-50 py-3 mt-4">문의하기</button>
		</div>
	</div>

</div>
</main>


<%@ include file="footer.jsp"%>