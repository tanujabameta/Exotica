<%-- 
    Document   : login1
    Created on : 23 Jun, 2016, 4:34:00 PM
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
       
      <form method="get" action="logincontroller">
            <table>
                <% 
             Cookie c[]=request.getCookies();
             String uid="",pass="";
            if(c!=null)
            {
               for(int i=0;i<c.length;i++)
                {
               if(c[i].getName().equals("user"))
               {
                uid=c[i].getValue();
               }
               if(c[i].getName().equals("pass"))
               {
                pass=c[i].getValue();
                
               }
                }
            }
               %>
            
                <tr>
                    <td>Login id</td>
                    <td><input type="text" name="login" value='<%=uid%>'></td>
                </tr>
                <tr>
                    <td>password</td>
                    <td><input type="password" name="pass" value='<%=pass%>'></td>`
                </tr>
                <tr> 
                    <td>Remember me</td>
                    <td><input type="checkbox" name="check"></td>
                </tr>    
                <tr>
                    <td><input type="submit" value="submit"></td>
                    <td><input type="reset" value="reset"></td>
                </tr>
            </table>
         </form>
         
    </body>
</html>
