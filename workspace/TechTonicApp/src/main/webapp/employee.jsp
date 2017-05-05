

<%@page import="com.mvc.SelectUser"%>
<%@page import="com.mvc.ConnectToDB"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> <%@ page import="java.sql.Connection,java.sql.DriverManager,java.sql.Statement,java.sql.ResultSet,java.io.PrintWriter" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6 lt8"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7 lt8"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8 lt8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="UTF-8" />
        <!-- <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">  -->
        <title>Employee Home</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <meta name="description" content="Login and Registration Form with HTML5 and CSS3" />
        <meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class" />
        <meta name="author" content="Codrops" />
        <link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="demo.css" />
        <link rel="stylesheet" type="text/css" href="style.css" />
		<link rel="stylesheet" type="text/css" href="animate_custom.css" />
		
		
		<script type="text/javascript">
		window.history.forward();
		</script>
    </head>



<body>
 <div class="container">
         
         
            <section>				
                <div id="container_demo" >
                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <div id="wrapper">
                        <div id="login" class="animate form">
                           <h1> Employee </h1>
<a href="Home.jsp"><button>Logout</button></a>
<%


SelectUser sel = new SelectUser();
ResultSet rs = sel.getEvent();

%>
<table border=1 style="background-color:pink; align:center">
<tr>
<th>Date</th>
<th>Title</th>
<th>Description</th>
<th>Presenter</th>
<th>Register</th>
</tr>
<%
while(rs.next())
{%>
	

<tr>
<td><%= rs.getString(2) %></td>
<td><%= rs.getString(3) %></td>
<td><%= rs.getString(4) %></td>
<td><%= rs.getString(5) %></td>
<td><form action="eventApply2.jsp" method="post"><button type="submit" name="app" value=<%= rs.getString(1) %> ><%= "Apply" %></button></form></td>

</tr>



<%}%>

</table>
                        </div>

                       
						
                    </div>
                </div>  
            </section>
        </div>
</body>
</html>