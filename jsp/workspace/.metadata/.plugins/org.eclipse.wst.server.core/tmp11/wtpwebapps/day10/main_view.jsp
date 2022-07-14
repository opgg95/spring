<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String userid =  (String)session.getAttribute("session_id");
		if(userid != null){
	%>
	<script>
		alert("<%=userid%>(김자바)님 안녕하세요!");
	</script>
	<p>
		어서오세요, <%=userid%>(김자바)님  <input type="button" value="로그아웃"> 
	</p>
	
	<% } else { %>
		<script>
			alert("로그인 후 이용하세요!");
			location.href = "login_view.jsp";
		</script>
	<% } %>
	
	
</body>
</html>


















