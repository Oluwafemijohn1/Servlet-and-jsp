package com.ephemzy;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;
		
		PrintWriter out = resp.getWriter();
		out.println("Result" + k);
	}
	
//	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		int k = i + j;
//		
//		PrintWriter out = resp.getWriter();
//		out.println("Result" + k);
//	}
	
	
	// Using dispatcher
//	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		int k = i + j;
//		
//		resp.sendRedirect("sq");
//	}
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;
		
		resp.sendRedirect("sq?k=" + k);
	}

}
