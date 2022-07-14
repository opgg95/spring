package com.koreait.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myservlet")
public class MyServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest arg0, 
			HttpServletResponse arg1) throws ServletException, IOException {
			
		arg0.setAttribute("result", "success");
		
		RequestDispatcher dispatcher
			= arg0.getRequestDispatcher("/el/el_test3.jsp");
		dispatcher.forward(arg0, arg1);
	}
}
