package com.jdc.directinvoke;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/message",name="Message")
public class MessageServlet extends HttpServlet{
	
	
	

		@Override 
		protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
			resp.getWriter().append("<h2>Message Servlet</h2>").flush();
			
		}
		
	}


