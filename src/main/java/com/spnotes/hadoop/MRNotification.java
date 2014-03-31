package com.spnotes.hadoop;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MRNotification
 */
public class MRNotification extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MRNotification() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entering MRNotification.doGet()");
		process(request,response);
		System.out.println("Exiting MRNotification.doGet()");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entering MRNotification.doPost()");
		process(request,response);
		System.out.println("Exiting MRNotification.doPost()");
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		System.out.println("Entering MRNotification.process()");
		response.setContentType("text/html");
		response.getWriter().println("<h1>Hello from MRNotification</h1>");
		System.out.println("Query String " + request.getQueryString());
		Enumeration headers = request.getHeaderNames();
		while(headers.hasMoreElements()){
			String name =(String) headers.nextElement();
			System.out.println(name + " -> " + request.getHeader(name));
		}
		
		System.out.println("Exiting MRNotification.process()");
	}

}
