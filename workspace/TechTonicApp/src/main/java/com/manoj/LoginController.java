package com.manoj;

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
import javax.servlet.http.HttpSession;

import com.mvc.ConnectToDB;
import com.mvc.SelectUser;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
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
		String email = (String)request.getParameter("email");
		String pass = (String)request.getParameter("pass");
		
		
		try {
			
			SelectUser sel = new SelectUser();
			
			ResultSet rs = sel.getUser(email, pass);
			
			if(rs.next())
			{
				
				System.out.println("Successfully Login");
			
				if(rs.getString(4).equals("admin"))
				{
					System.out.println("Going to Admin HomePage");
					RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
					rd.forward(request, response);
				}
				else
				{
					HttpSession session = request.getSession();
					session.setAttribute("uname", rs.getString(1));
					
					System.out.println("Going to Employee HomePage");
					RequestDispatcher rd = request.getRequestDispatcher("employee.jsp");
					rd.forward(request, response);	
				}
			}
			else
			{
				System.out.println("Wrong UserName/Password");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
