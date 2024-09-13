package com.dao.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ConnectionDao;
import com.model.Employee;

public class MyServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		// TODO Auto-generated method stub
		
		if(req.getParameter("Action").equals("Add Employee")){
			Employee employee = new Employee();
			ConnectionDao connectionDao = new ConnectionDao();
			employee.setName(req.getParameter("name"));
			employee.setSpeciality(req.getParameter("speciality"));
			employee.setEmail(req.getParameter("email"));
			employee.setCity(req.getParameter("city"));
			employee.setCountry(req.getParameter("country"));
			
			@SuppressWarnings("unused")
			boolean result = connectionDao.addEmployee(employee);
			RequestDispatcher rd = req.getRequestDispatcher("addEmployee.jsp");
			rd.include(req, resp);
			
		}
		if(req.getParameter("Action").equals("Edit Employee")) {
			Employee employee = new Employee();
			ConnectionDao connectionDao = new ConnectionDao();
			employee.setEmail(req.getParameter("email"));
			employee.setCity(req.getParameter("city"));
			employee.setCountry(req.getParameter("country"));
			@SuppressWarnings("unused")
			boolean result = connectionDao.editEmployee(employee);
			RequestDispatcher rd = req.getRequestDispatcher("edit.jsp");
			rd.include(req, resp);
		}
		
		if(req.getParameter("Action").equals("Delete")) {
			Employee employee = new Employee();
			ConnectionDao connectionDao = new ConnectionDao();
			employee.setId(Integer.parseInt(req.getParameter("id")));
			
			@SuppressWarnings("unused")
			boolean result = connectionDao.deleteEmployee(employee);
			RequestDispatcher rd = req.getRequestDispatcher("delete.jsp");
			rd.include(req, resp);
			out.println("delete sucessfully");
		}
		
	}
	

}
