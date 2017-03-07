<%-- 
    Document   : tr
    Created on : 17 Jun, 2016, 4:38:12 PM
    Author     : TANUJA BAMETA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="get" action="trr.jsp">
            <h1>Tour Package Booking</h1><br>
            <h2>Select a hotel
                <select name="hotel">
                        <option>Citrus</option>
                        <option>Holiday Inn</option>
                        <option>Taj</option>
                </select>
            </h2>
            <h2>No of days <input type="text" name="days"></h2>
            <br>
            <input type="submit" value="next"> 
        </form>
         <% 
           String dest=(String)request.getParameter("dest");
           session.setAttribute("destination",dest);
       %>
        
    </body>
</html>
