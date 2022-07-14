<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
	<%@ include file="header.jsp" %>
	
	<div id="carouselExampleIndicators" class="carousel slide col"
		data-bs-ride="carousel">
		<div class="carousel-indicators">
			<button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
			<button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
			<button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
		</div>
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="img/mvis.jpg" class="d-block w-100" alt="...">
			</div>
			<div class="carousel-item">
				<img src="img/mvis1.jpg" class="d-block w-100" alt="...">
			</div>
			<div class="carousel-item">
				<img src="img/mvis2.jpg" class="d-block w-100" alt="...">
			</div>
			<div class=" text-start carousel-caption d-md-block " style="bottom:13rem;">
		        <h2 class = "text-shadow-sm" style="text-shadow: 4px 3px 4px rgb(0 0 0 / 50%);">싸고 편리한 렌트카, 청결하고 쾌적한 차량</h2>
		        <h1 style="text-shadow: 4px 3px 4px rgb(0 0 0 / 50%);"><strong>MO CAR</strong></h1>
		        <h4 style="text-shadow: 4px 3px 4px rgb(0 0 0 / 50%);">언제나 함께하세요 차량 렌트는 Mo car</h4>
	      	</div>
		</div>
		
		<button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
			<span class="carousel-control-prev-icon w-25 h-25" aria-hidden="true"></span>
			<span class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
			<span class="carousel-control-next-icon w-25 h-25" aria-hidden="true"></span> 
			<span class="visually-hidden">Next</span>
		</button>
	</div>
 </div>	
	
<%@ include file="footer.jsp" %>

