package com.koreait.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class DoFrontController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	protected void doProcess(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		System.out.println("URI : " + req.getRequestURI());
	
		String requestURI = req.getRequestURI();
		String responseURI = null;
	
		if( requestURI.equals("/fc/do1.do")) {
			// do.1 에 대한 업무처리
//			req.setAttribute("result", "do1으로 요청보내기!");			// 업무처리
//			req.getRequestDispatcher("do1.jsp").forward(req, resp);	// 응답
			responseURI = new Do1().execute(req, resp);
			
		}else if(requestURI.equals("/fc/do2.do")) {
			// do.2 에 대한 업무처리
//			req.setAttribute("result", "do2으로 요청보내기!");
//			req.getRequestDispatcher("do2.jsp").forward(req, resp);
			responseURI	= new Do2().execute(req, resp);
			
		}else if(requestURI.equals("/fc/do3.do")) {
			// do.3 에 대한 업무처리
//			req.setAttribute("result", "do3으로 요청보내기!");
//			req.getRequestDispatcher("do3.jsp").forward(req, resp);
			responseURI	= new Do3().execute(req, resp);
		}
		
		req.getRequestDispatcher(responseURI).forward(req, resp);
	}
}
