	package com.quanlyphongtro.controller.web;
	
	import java.io.IOException;
	
	import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	//import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	
	
	
//	@WebServlet(urlPatterns = {"/trang-chu"})
	public class HomeController extends HttpServlet {
	
		private static final long serialVersionUID = 1L;
		
		private static String path = "/views/web/home.jsp";
	
		protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   RequestDispatcher rd = request.getRequestDispatcher(path);
//		   RequestDispatcher rd = request.getRequestDispatcher("home.jsp");

		    if (rd == null) {
		        System.out.println("❌ Dispatcher is NULL! Path not found: " + path);
		        response.getWriter().println("Dispatcher is NULL for: " + path);
		        return;
		    } else {
		        System.out.println("✅ Dispatcher created successfully for: " + path);
		    }

		   rd.forward(request, response);
		}
	
		protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    
		}
	}
