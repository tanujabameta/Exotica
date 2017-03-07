<%-- 
    Document   : final
    Created on : 17 Jun, 2016, 4:42:38 PM
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
             
            String cab=(String)request.getParameter("cab");
            String s=(String) session.getAttribute("login");
            String destination=(String)session.getAttribute("destination");
            String hotel =(String)session.getAttribute("hotel");
            String days=(String)session.getAttribute("days");
        %>
            <h2>hello  <%=s%> you have requested for the following services</h2>
                 <h3>destination: <%=destination%></h3>
                 <h3>hotel: <%=hotel%></h3>
                 <h3>cab: <%=cab%></h3>
                 <h3>No of days: <%=days%></h3>
           
    </body>
</html>
