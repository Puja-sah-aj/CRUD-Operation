<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.dao.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Management</title>
</head>
<style>
<!--
a {
  text-decoration: none;
}
-->
</style>
<body bgcolor="#00FFFF">
  <form action="">
    <h1 align="center">Employee Management</h1>
    <h2 align="center">
      <a href="addEmployee.jsp">Add New Employee</a><br>
    </h2>
    <!--  All Employees shown -->
    <h1 align="center">List of Employees</h1>
    <table border="1" align="center" cellpadding="5"
      style="font-size: 200%; font-family: inherit; font-style: normal; background-color: window;">
      <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Speciality</th>
        <th>Email</th>
        <th>City</th>
        <th>Country</th>
        <th>Actions</th>
      </tr>

      <%
        Connection con = DBConnection.getConn();
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("Select * from register");
        while (resultSet.next()) {
      %>

      <tr>
        <td>
          <%
            out.print(resultSet.getInt(1)); // Employee ID
          %>
        </td>
        <td>
          <%
            out.print(resultSet.getString(2)); // Employee Name
          %>
        </td>
        <td>
          <%
            out.print(resultSet.getString(3)); // Employee Speciality
          %>
        </td>
        <td>
          <%
            out.print(resultSet.getString(4)); // Employee Email
          %>
        </td>
        <td>
          <%
            out.print(resultSet.getString(5)); // Employee City
          %>
        </td>
        <td>
          <%
            out.print(resultSet.getString(6)); // Employee Country
          %>
        </td>

        <form action="MyServlet" method="post">
          <td>
            <a value="Edit" name="Action" href="edit.jsp?id=<%=resultSet.getInt(1)%>">Edit</a>
            <input type="hidden" name="j" value="<%= resultSet.getInt(1) %>">
            &nbsp;&nbsp;&nbsp;
            <a href="delete.jsp">Delete</a>
            &nbsp;&nbsp;&nbsp;
          </td>
      </tr>
      </form>
      <%
        }
      %>

    </table>
  </form>
</body>
</html>
