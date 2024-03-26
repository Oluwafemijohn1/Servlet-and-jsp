package com.ephemzy;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		int k = (int) req.getAttribute("k");
		k = k * k;
		PrintWriter out = resp.getWriter();
		out.println("Result is : " + k);
	}

}
