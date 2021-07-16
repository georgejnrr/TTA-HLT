<%-- 
    Document   : update
    Created on : Jun 29, 2021, 10:55:29 AM
    Author     : GEORGE JNR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Student</title>
    </head>
    <body>
         <!-Using JSP tag to include master page design across other pages->
        
        <jsp:include page="master.html"/>
    <center>
        <h2>Student Update</h2>
        
         <!--
        Create a <form> for accepting "sid" and "score"
        on "submit button" call action "update"
        
        -->
        <form action="update" method="get">
            <table>
                <tr>
                    <td>SID <input type="text" name="sid"/></td>
                    
                </tr>
                <tr>
                    <td>Score <input type="text" name="score"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Update"/></td>
                </tr>
            </table>
            
        </form>
    </center>
    </body>
</html>
