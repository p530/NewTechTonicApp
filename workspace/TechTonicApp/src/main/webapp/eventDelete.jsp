<%@page import="com.mvc.Delete"%>
<%@page import="com.mvc.ConnectToDB"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.Connection,java.sql.DriverManager,java.sql.Statement,java.sql.ResultSet,java.io.PrintWriter" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Event</title>
</head>
<body>
<%

String id1 = request.getParameter("del");
char id2 = id1.charAt(6);
String id=String.valueOf(id2);

Delete del = new Delete();
del.removeEvent(id);



RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
rd.forward(request, response);


%>
</body>
</html>