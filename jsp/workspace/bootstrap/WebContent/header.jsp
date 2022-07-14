<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="UTF-8">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.88.1">
<title>mocar</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
	
	<style>
		.nav-link:hover {
		    color: #fff;
		    background-color: #0d6efd;
	  	}  
	</style>
	
</head>
<body>


	<main>
	<div class="row g-0 align-items-start clearfix">
		<div class="d-flex flex-column flex-shrink-0 p-3 bg-light order-first"
			style="width: 280px; height: 100vh;">
			<a href="/"
				class="d-flex align-items-center mb-3 mb-md-0 me-md-auto link-dark text-decoration-none">
				<span class="fs-4">Logo</span>
			</a>
			<hr>
			<ul class=" nav nav-pills flex-column mb-auto" id="navbarToggler8">
				<li class="nav-item"><a href="#" class="nav-link link-dark" aria-current="page"> 렌트예약 </a></li>
				<li class="nav-item"><a href="#" class="nav-link link-dark"> 공지사항 </a></li>
				<li class="nav-item"><a href="#" class="nav-link link-dark"> Q&amp;A </a></li>
				<li class="nav-item"><a href="#" class="nav-link link-dark"> 찾아오시는 길 </a></li>
				<li class="nav-item"><a href="#" class="nav-link link-dark"> Contact </a></li>
			</ul>
			<hr>

			<a href="#"
				class="d-flex align-items-center link-dark text-decoration-none"
				id="dropdownUser2" data-bs-toggle="dropdown" aria-expanded="false">
			</a>
			<button type="button" class="btn d-flex" data-bs-toggle="modal"
				data-bs-target="#staticBackdrop">
				<strong>login</strong>
			</button>

			<!-- Modal -->
			<div class="modal fade" id="staticBackdrop" data-bs-backdrop="static"
				data-bs-keyboard="false" tabindex="-1"
				aria-labelledby="staticBackdropLabel" aria-hidden="true">
				<div class="modal-dialog modal-dialog-centered">
					<div class="modal-content">
						<div class="modal-header p-5 pb-4 border-bottom-0">
							<h2 class="fw-bold mb-0">login</h2>
							<button type="button" class="btn-close" data-bs-dismiss="modal"
								aria-label="Close"></button>
						</div>
						<div class="modal-body p-5 pt-0">
							<form class="">
								<div class="form-floating mb-3">
									<input type="email" class="form-control rounded-4"
										id="floatingInput" placeholder="name@example.com"> <label
										for="floatingInput">아이디</label>
								</div>
								<div class="form-floating mb-3">
									<input type="password" class="form-control rounded-4"
										id="floatingPassword" placeholder="Password"> <label
										for="floatingPassword">비밀번호</label>
								</div>
								<button class="w-100 mb-2 btn btn-lg rounded-4 btn-primary"
									type="submit">로그인</button>
								<hr class="my-4">
								<h2 class="fs-5 fw-bold mb-3">다른 방법으로 로그인하기</h2>
								<button
									class="w-100 py-2 mb-2 btn btn-outline-success rounded-4"
									type="submit">
									<svg class="bi me-1" width="16" height="16">
										<use xlink:href="#twitter" /></svg>
									네이버로 로그인하기
								</button>
								<button
									class="w-100 py-2 mb-2 btn btn-outline-primary rounded-4"
									type="submit">
									<svg class="bi me-1" width="16" height="16">
										<use xlink:href="#facebook" /></svg>
									페이스북으로 로그인하기
								</button>
								<button
									class="w-100 py-2 mb-2 btn btn-outline-warning rounded-4"
									type="submit">
									<svg class="bi me-1" width="16" height="16">
										<use xlink:href="#github" /></svg>
									카카오톡으로 로그인하기
								</button>
							</form>

						</div>
					</div>
				</div>
			</div>

		</div>