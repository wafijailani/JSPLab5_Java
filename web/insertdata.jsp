<%-- 
    Document   : insertdata
    Created on : Apr 15, 2022, 9:52:46 AM
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@page import="java.sql.*;"%>
    </head>
    <body>
        <%
        String firstname=request.getParameter("firstname");
        String lastname=request.getParameter("lastname");
        String username=request.getParameter("username");
        String pass=request.getParameter("password");
        String address=request.getParameter("address");
        String contact=request.getParameter("contact");
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspdb?autoReconnect=true&useSSL=false","root","Wafijailani84278");
             Statement stmt = con.createStatement();
             stmt.executeUpdate ("insert into jspdb.lab5 (firstname,lastname,username,password,address,contact) values ('" + firstname + "','" + lastname + "','" + username + "','" + pass + "','" + address + "','" + contact + "')");                                                    
             out.println("data inserted");
             con.close();
             
        } catch (Exception e) {
            out.print(e);
        }
        %>
        <br/><a href="index.jsp">Insert Data</a>
        <br/><a href="displaydata.jsp">Display Data</a>
    </body>
</html>
