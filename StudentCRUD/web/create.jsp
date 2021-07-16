<%-- 
    Document   : create
    Created on : Jun 29, 2021, 10:54:43 AM
    Author     : GEORGE JNR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Student</title>
          <link rel="stylesheet" href="style.css"/>
    </head>
    <body>
        
        <!-Using JSP tag to include master page design across other pages->
        
        <jsp:include page="master.html"/>
    <center>
        <h3>Student Create</h3>
        <!--Create design form for student records-->
        
        <form action="create" method="get">
              
            Student ID: <input type="text" name="sid"/>
            <br/>
            First Name: <input type="text" name="fname"/>
            <br/>
            Last Name: <input type="text" name="lname"/>
            <br/>
            Score: <input type="text" name="score"/>
            <br/>
            <input type="submit" value="Insert"/>
        </form>
    </center>
    </body>
</html>
