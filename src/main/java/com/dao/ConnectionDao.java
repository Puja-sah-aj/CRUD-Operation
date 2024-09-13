package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.model.Employee;

public class ConnectionDao {
	public Employee() {
		
	}
	
	
	public boolean addEmployee(Employee employee) {
		Connection conn = DBConnection.getConn();
		String sql = "insert into register(name,speciality,email,city,country) values(?,?,?,?,?)";
		try {
			PreparedStatement pre = conn.prepareStatement(sql);
			pre.setString(1, employee.getName());
			pre.setString(2, employee.getSpeciality());
			pre.setString(3, employee.getEmail());
			pre.setString(4, employee.getCity());
			pre.setString(5, employee.getCountry());
		int i =	pre.executeUpdate();
		if(i>0) {
			return true;
		}
		
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return false;
	}

	
	
	
	public boolean editEmployee(Employee employee) {
		Connection conn = DBConnection.getConn();
		String sql = "update register set email=?,city=?,country=? WHERE id=?";
		try {
			PreparedStatement pre = conn.prepareStatement(sql);
			pre.setString(1, employee.getEmail());
			pre.setString(2, employee.getCity());
			pre.setString(3, employee.getCountry());
			pre.setInt(4, employee.getId());
		int i =	pre.executeUpdate();
		if(i>0) {
			return true;
		}
		
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return false;
	}
	
	public boolean deleteEmployee(Employee employee) {
		Connection conn = DBConnection.getConn();
		String sql = "delete from register  WHERE id=?";
		try {
			PreparedStatement pre = conn.prepareStatement(sql);
			pre.setInt(1, employee.getId());
		int i =	pre.executeUpdate();
		if(i>0) {
			return true;
		}
		
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return false;
		

		
	}
}
