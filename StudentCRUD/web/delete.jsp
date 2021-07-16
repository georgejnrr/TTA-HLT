<%-- 
    Document   : delete
    Created on : Jun 29, 2021, 10:55:10 AM
    Author     : GEORGE JNR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Student</title>
    </head>
    <body>
         <!-Using JSP tag to include master page design across other pages->
        
        <jsp:include page="master.html"/>
    <center>
        <h2>Student Delete</h2>
        <form action="delete" method="get">
            <table>
                <tr>
                    <td>SID <input type="text" name="sid"/></td>
                    
                </tr>
                
                
                <tr>
                    <td><input type="submit" value="Delete"/></td>
                </tr>
            </table>
            
        </form>
    </center>
    </body>
</html>
