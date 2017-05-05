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

import com.mvc.Add;
import com.mvc.ConnectToDB;
import com.mvc.SelectUser;

/**
 * Servlet implementation class AddEventController
 */
public class AddEventController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEventController() {
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

		String date = request.getParameter("edate");
		String title = (String)request.getParameter("title");
		String desc = (String)request.getParameter("desc");
		String pres = (String)request.getParameter("pres");
		
		
		try {
			
			
			SelectUser sel = new SelectUser();
			
			ResultSet rs = sel.getEvent();
			int cnt = 0;
			while(rs.next())
			{
				cnt++;
			}
			cnt++;
			Add add = new Add();
			add.AddAppliedUser(cnt, date, title, desc, pres);
			
			System.out.println("Added New Event");	
			RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
			rd.forward(request, response);
				
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
