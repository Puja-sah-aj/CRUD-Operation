package com.dao.Controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {
	

	public MyFilter() {
		super();
	}
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		if(request.getParameter("Action").equals("Add Employee")) {
			chain.doFilter(request, response);
		}
		if(request.getParameter("Action").equals("Edit Employee")) {
			chain.doFilter(request, response);
		}
		if(request.getParameter("Action").equals("Delete")) {
			chain.doFilter(request, response);
		}	
	}
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
