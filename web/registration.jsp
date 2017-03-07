<%-- 
    Document   : registration
    Created on : 20 Jun, 2016, 4:35:34 PM
    Author     : TANUJA BAMETA
--%>



<%@page import="java.lang.String"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form method="get" action="error.jsp">
                <table>
                    <tr>
                        <% 
                            try
                            {
                                ArrayList<String> s=(ArrayList<String>)session.getAttribute("errorMessage");
                                for(String er :s)
                                       {
                                           out.println(er);
                                       }
                            } 
                            catch(NullPointerException e)
                            {
                               System.out.println(e); 
                            }
                        %>
                    </tr>
                    <tr><td>Name</td>
                        <td><input type="text" name="name"></td>
                    </tr>    
                    <tr><td>Address</td>
                        <td><input type="text" name="add"></td>
                    </tr>    
                    <tr><td>Contact no</td>
                        <td><input type="text" name="con"></td>
                    </tr>   
                    <tr><td>Login id</td>
                        <td><input type="text" name="login"></td>
                    </tr>    
                    <tr><td>Password</td>
                        <td><input type="password" name="pass"></td>
                    </tr>    
                    <tr><td>re-enter password</td>
                        <td><input type="password" name="rpass"></td>
                    </tr> 
                    <tr><td><input type="submit" value="submit"></td>
                    </tr>
                </table>  
            </form>
    </body>
</html>
