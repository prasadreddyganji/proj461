package com.web.devproj;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class AddServlet extends HttpServlet
{

public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
  {
	PrintWriter out = res.getWriter();
	res.setContentType("text/html");
	  double result = 0;
	  String i = req.getParameter("source");
	  String j = req.getParameter("dest");
      double val = Double.parseDouble(req.getParameter("amount"));
	 if(i.equals("Dollar"))
	 {
		 if(j.equals("Dollar"))
			 result = val;
		 if(j.equals("Rupee"))
			 result = 75 * val;
		 else if(j.equals("Euro"))
			 result = 0.82 * val;
		 else if(j.equals("Dinar"))
			 result = 0.30 * val;
	 }
		 out.println("<!DOCTYPE html>\r\n"
		 		+ "<html>\r\n"
		 		+ "<head>\r\n"
		 		+ "<style>\r\n"
		 		+ "body {\r\n"
		 		+ "  background-color: coral;\r\n"
		 		+ "}\r\n"
		 		+ "</style>\r\n"
		 		+ "</head>\r\n"
		 		+ "<body>\r\n"
		 		+ "\r\n"
		 		+ "<h1>Result is: </h1>\r\n"
		 		+ "\r\n"
		 		+ result
		 		+ "\r\n"
		 		+ "</body>\r\n"
		 		+ "</html>\r\n");

	 
	  //Cookie cookie =new Cookie("k", k+"");
	 // res.addCookie(cookie);
	 // res.sendRedirect("sq");
	  
  }
}
