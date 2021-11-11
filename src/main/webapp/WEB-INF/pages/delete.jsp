<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<br>
<a href="optr">Go Back</a>
<br>
<br>

<h1>Welcome To Delete Page</h1>


<form action="delete" method="post">
            <fieldset>
              <legend>Email</legend>
               <input name="email" id="email" />
            </fieldset>
          <button name="delete">Delete Emp</button>
   </form>
   <h1>${msg}</h1>
   
</body>
</html>