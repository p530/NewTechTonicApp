package com.manoj;

import java.awt.Component;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.mvc.Add;
import com.mvc.ConnectToDB;
import com.mvc.Employee;
import com.mvc.SelectUser;

/**
 * Servlet implementation class HomeController
 */
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();

		String user = request.getParameter("selectuser");
		
		Employee e1 = new Employee(request.getParameter("email"),request.getParameter("namesignup"),request.getParameter("passsignup"));
		
		try {
			//System.out.println(email+" "+uname+" "+pass);
			
			
			SelectUser sel = new SelectUser();
			
			ResultSet rs = sel.getUserEmail(e1.getEmail());
			
			if(rs.next())
			{
				System.out.println("User Email Already Exists");
			
				 //JOptionPane.showMessageDialog(null, "Done......!", "User Email Already Exists", JOptionPane.INFORMATION_MESSAGE);
				RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
				rd.forward(request, response);
				
				
			}
			else
			{
				Add add = new Add();
				add.AddUser(e1.getEmail(), e1.getUname(), e1.getPass(), user);
				
				
				System.out.println("Successfully Registered New User.");
			 
				
				RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
				rd.forward(request, response);
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
