<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
        <title>Registration Form</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <meta name="description" content="Login and Registration Form with HTML5 and CSS3" />
        <meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class" />
        <meta name="author" content="Codrops" />
        <link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="demo.css" />
        <link rel="stylesheet" type="text/css" href="style.css" />
		<link rel="stylesheet" type="text/css" href="animate_custom.css" />
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
                             <form  action="HomeController" method="post" autocomplete="on"> 
                             <h3>TechTonic</h3>
                                <h1> Sign up </h1> 
                               
                               <p> 
                                    <label for="usernamesignup" class="uname" >Your Email</label>
                                    <input id="fnamesignup" name="email" required="required" type="email" pattern="[A-Z0-9a-z._%+-]+@atmecs.com" placeholder="manoj@atmecs.com" />
                                </p>
                               
                                <p> 
                                    <label for="usernamesignup" class="uname" >Your Username</label>
                                    <input id="fnamesignup" name="namesignup" required="required" type="text" placeholder="manoj005" />
                                </p>
                               
                                <p> 
                                    <label for="passwordsignup" class="youpasswd" >Your Password </label>
                                    <input id="fpasssignup" name="passsignup" required="required" type="password" placeholder="eg. X8df!90EO"/>
                                </p>
                               
                                <p> 
                                    <label for="passwordsignup" class="youpasswd" >Select User </label>
                                    <select name="selectuser" required>
                                    		<option value="">None</option>
  											<option value="admin">Admin</option>
 											<option value="employee">Employee</option>
 
									</select>
                                </p>
                               
                              
                                
                                <p class="signin button"> 
									<input type="submit" value="Register"/> 
								</p>
                                <p class="change_link">  
									Already a member ?
									<a href="login.jsp" class="to_register"> Go and log in </a>
								</p>
                            </form>
                        </div>

                       
						
                    </div>
                </div>  
            </section>
        </div>
</body>
</html>