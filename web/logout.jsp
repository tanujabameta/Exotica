<%-- 
    Document   : logout
    Created on : 23 Jun, 2016, 4:56:55 PM
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
        <%
            session.invalidate();
            //response.sendRedirect("login1.jsp");
            
            %>

    </body>
</html>
 