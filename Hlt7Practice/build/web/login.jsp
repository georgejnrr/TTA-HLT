<%-- 
    Document   : login
    Created on : Jun 25, 2021, 1:05:44 PM
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
    <center> <h1>gage<b>.</b></h1></center>
    <center>Log in to Our Online Services<br/>
    Employee
    </center>
    <br/>
    <center>
        <form id="f1" action= "loginServlet"
           method="post">
        <table>
            <tr>
                <td> <label>Username*</label> </td>
               
                <td><label>Password*</label>   </td>
            </tr>
      
      
          
            <tr>
              <td> <input type="text" name="uname"/></td> 
              <td><input type="password" name="pass"/></td>
        </tr>
        
        <tr>
            <td><input type="submit" value="Login "/></td> 
          
         
        </tr>
        </table>  
    </form>
    </center>
    </body>
</html>
