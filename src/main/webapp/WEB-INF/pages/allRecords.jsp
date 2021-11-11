<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
td{
padding: 20px;
}
</style>
</head>
<body>
<br>
<br>
<a href="optr">Go Back</a>
<br>
<br>
<h1>Welcome To Select Page</h1>
<table border="1">
<tr>
<th>Email</th>
<th>Name</th>
<th>Department</th>
</tr>
<c:forEach var="emp" items="${data}">
      <tr>
          <td>${emp.email}</td>
          <td>${emp.name}</td>
          <td>${emp.dept}</td>
      </tr>
  </c:forEach>
</table>
</body>
</html>