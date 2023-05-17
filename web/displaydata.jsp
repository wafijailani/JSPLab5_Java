<%-- 
    Document   : displaydata
    Created on : Apr 15, 2022, 10:09:57 AM
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
            try {
            Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspdb?autoReconnect=true&useSSL=false","root","Wafijailani84278");
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM jspdb.lab5");
             %>
             <table border=1 align=center style=text-align:center">
                 <tr>
                     <th>ID</th>
                     <th>First Name</th>
                     <th>Last Name</th>
                     <th>Username</th>
                     <th>Address</th>
                     <th>Contact</th>
                 </tr>
                 
             <%        
             while(rs.next()){
             String ID = rs.getString("id");
             String FirstName = rs.getString("firstname");
             String LastName = rs.getString("lastname");
             String Username = rs.getString("username");
             String Address = rs.getString("address");
             String Contact = rs.getString("contact");
             %>
             <tr>
                     <td> <%= ID %> </td>
                     <td> <%= FirstName %> </td>
                     <td> <%= LastName %> </td>
                     <td> <%= Username %> </td>
                     <td> <%= Address %> </td>
                     <td> <%= Contact %> </td>
             </tr>   
                 
             <%
             }%>
             </table>
             <%
             con.close();
             
        } catch (Exception e) {
            out.print(e);
        }
            
            
            %>
            <br/> <a href="index.jsp"> Insert data</a>
    </body>
</html>
