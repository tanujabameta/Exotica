<%-- 
    Document   : trr
    Created on : 17 Jun, 2016, 4:39:12 PM
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
        <form action="final.jsp">
         <h2>Select the cab service
                <select name="cab">
                        <option>OLA</option>
                        <option>private</option>
                        <option>public</option>
                </select>
        </h2>
        <input type="submit" value="next">
        </form>
         <% 
              String hotel=(String)request.getParameter("hotel");
              String days=(String)request.getParameter("days");
              session.setAttribute("hotel",hotel);
              session.setAttribute("days",days);
           
          %>
        
    </body>
</html>
