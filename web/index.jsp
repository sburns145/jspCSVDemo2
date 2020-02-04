<%-- 
    Document   : index
    Created on : Jan 25, 2020, 12:17:39 PM
    Author     : scott.burns
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Entry Form</h1>
        
        <form name="Name Input Form" action="response.jsp">
            Enter Your Name: 
            <input type="text" name="name" />
            
            Enter a number:
            <input type="number" name="x" />
            <input type="submit" value="OK" />
        </form>
        
    </body>
</html>
