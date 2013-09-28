package com.jenkins.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveUserList
 */
@WebServlet("/SaveUserList")
public class SaveUserList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * Default constructor. 
     */
    public SaveUserList() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String name = request.getParameter("txtName") != null ? request.getParameter("txtName") : "";
	  String address = request.getParameter("txtAddress") != null ? request.getParameter("txtAddress") : "";;
	  String phoneNo = request.getParameter("txtPhoneNo") != null ? request.getParameter("txtPhoneNo"): "";;
	  String emailId = request.getParameter("txtEmailId") != null ? request.getParameter("txtEmailId") : "";;
	  String country = request.getParameter("optCountry") != null ? request.getParameter("optCountry") : "";;
	  
	  SaveDelegate delegate = new SaveDelegate();
	  delegate.saveUsers(name,address,phoneNo,emailId,country);
	  
	  response.sendRedirect("welcome.jsp");
	}
}
