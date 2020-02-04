<%-- 
    Document   : response
    Created on : Jan 26, 2020, 8:56:37 AM
    Author     : scott.burns
--%>
<%@ page import="org.mypackage.hello.NameHandler"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.NameHandler" />
        <jsp:setProperty name="mybean" property="name" />
        <jsp:setProperty name="mybean" property="x" />
        <h1>Hello, <jsp:getProperty name="mybean" property="name" />!</h1><br>
        <h2>You are number <jsp:getProperty name="mybean" property="x" /> </h2>
        <%
            NameHandler nh = new NameHandler();
            out.print(nh.getX());
        %>
    </body>
</html>
