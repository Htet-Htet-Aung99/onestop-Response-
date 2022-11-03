package com.jdc.directinvoke;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/include")
public class IncludeServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		pw.append("<h2>Include Servlet</h2>").flush();
		
		//get RequestDispatch Object from request
		RequestDispatcher dispatcher=req.getRequestDispatcher("message");
		
		//from servlet context only absolute path
		//dispatcher=getServletContext().getRequestDispatcher("/message");
		dispatcher=getServletContext().getNamedDispatcher("Message");
		dispatcher.include(req,resp);
	}

}
