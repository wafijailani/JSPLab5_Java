<%-- 
    Document   : index
    Created on : Apr 15, 2022, 9:47:49 AM
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Input Form</title>
    </head>
    <body>
        <form action="insertdata.jsp">
        First name: <input type="text" name="firstname"/><br><br>
        Last name: <input type="text" name="lastname"/><br><br>
        Username: <input type="text" name="username"/><br><br>
        Password:  <input type="password" name="pwd"/><br><br>
        Address:  <input type="text" name="address"/><br><br>
        Contact:  <input type="text" name="contact"/><br><br>
        <input type ="submit"/>
        <br/><a href="displaydata.jsp">Display Data</a>
        </form>
    
    </body>
</html>
