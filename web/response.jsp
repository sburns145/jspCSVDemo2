<%-- 
    Document   : response
    Created on : Jan 26, 2020, 8:56:37 AM
    Author     : scott.burns
--%>
<%@ page import="org.mypackage.hello.NameHandler"%>
<%@ page import="org.mypackage.hello.Roster"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.NameHandler" />
        <jsp:useBean id="bean2" scope="session" class="org.mypackage.hello.Roster" />
        <jsp:setProperty name="mybean" property="firstName" />
        <jsp:setProperty name="mybean" property="lastName" />
        <jsp:setProperty name="mybean" property="x" />
        
        <h1>Hello, <jsp:getProperty name="mybean" property="firstName" />!</h1><br>
        <h2>You are number <jsp:getProperty name="mybean" property="x" /> </h2>
       
        <h2> Combined Name:   ${mybean.combine()} </h2>
        <h3> This is a test:  ${mybean.test()} </h3>
        <h3> This is a test:  ${mybean.firstName} </h3>
        <h4> This, is also a test: ${mybean.x} </h4>
        <h5> This is a test of the roster:  ${bean2.printEmplyeeList()} </h5>
        
        <%
            
            NameHandler nh = new NameHandler("Bill");
            out.print(nh.getX());
            String name = nh.combine();
            //Scanner scaner = new Scanner(new FileReader("employees.csv"));
            //String test = scaner.next();
        %>
        
        <p> This is just a test, but my name is <%= name %> </p>
        
        
    </body>
</html>
