package com.koreait.web.servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/get")
public class Get extends HttpServlet {

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) 
			throws ServletException, IOException {
		
		if(arg0.getMethod().equals("GET")) {
			System.out.println("GET 요청입니다.");
		} else if( arg0.getMethod().equals("POST")) {
			System.out.println("POST 요청입니다.");
		}
	}
}
