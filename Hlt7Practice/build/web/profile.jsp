<%-- 
    Document   : profile
    Created on : Jun 25, 2021, 1:24:28 PM
    Author     : GEORGE JNR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="style.css"/>
    </head>
    <body>
    <center>
        <h1>Welcome, to your Profile Account</h1>
    </center>
    <hr/>
    
    <%
    request.getSession(false);
   String uname= session.getAttribute("myuser").toString();
    
    %>
    
    <center>
    <h2>Hello, <%= uname%>,</h2>
    <h4><b>Job Title: </b>Software Engineer</h4>
    
    <p id="p1">Lorem Ipsum is simply dummy text of the printing and typesetting industry.
        Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when<br/>
        an unknown printer took a galley of type and scrambled it to make a type specimen book.
        It has survived not only five centuries, but also the leap into electronic typesetting,<br/>
        remaining essentially unchanged. It was popularised in the 1960s with the release of 
        Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing <br/>
        software like Aldus PageMaker including versions of Lorem Ipsum.</p>
    
    <form action="Logout"
        method="post">
        <input type="submit" value="Logout"/>
    </form>
    </center>
    </body>
</html>
