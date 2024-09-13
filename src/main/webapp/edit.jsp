<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Employee</title>
</head>
<body bgcolor="#00FFFF">
  <form action="MyServlet" method="post">
    <h1 align="center">Edit Employee</h1>
    <h1>
      <a href="index.jsp">List Employees</a>
    </h1>
    <table border="1" align="center" cellpadding="5"
      style="font-size: 200%; font-family: inherit; font-style: normal; background-color: window;">
      <tr>
        <td>Enter Employee ID</td>
        <td><input type="text" name="id" required></td>
      </tr>
      <tr>
        <td>Enter Employee Email</td>
        <td><input type="text" name="email" required></td>
      </tr>
      <tr>
        <td>Enter Employee City</td>
        <td><input type="text" name="city" required></td>
      </tr>
      <tr>
        <td>Enter Employee Country</td>
        <td><input type="text" name="country" required></td>
      </tr>
      <tr>
        <td></td>
        <td align="center"><input type="submit" name="Action"
          value="Edit Employee"></td>
      </tr>
    </table>
  </form>
</body>
</html>
