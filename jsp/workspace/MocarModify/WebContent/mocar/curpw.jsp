<%@page import="dao.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userpw = request.getParameter("userpw");
	String userid = (String)session.getAttribute("userid");
	UserDAO mdao = new UserDAO();
	System.out.println(mdao.curpw(userpw, userid));
	System.out.println(userpw);
	if(!mdao.curpw(userpw, userid)){
		out.print("ok");
	} else {
		// 중복된 아이디가 있을 경우
		out.print("not-ok");
	}
%>
