<%-- 
    Document   : error
    Created on : 20 Jun, 2016, 4:00:04 PM
    Author     : TANUJA BAMETA
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
           try
           {
            int c =0;
            String uname,address,contactno,loginid,pass,repass;
            ArrayList<String> errorMessage;
            errorMessage=new ArrayList<String>();
            errorMessage.clear();
            uname=request.getParameter("name");
            address=request.getParameter("add");
            contactno=request.getParameter("con");
            loginid=request.getParameter("login");
            pass=request.getParameter("pass");
            repass=request.getParameter("rpass");
            if(errorMessage.isEmpty())
            {
               
                if(uname.equals(""))
                {
                    errorMessage.add("Please enter the name");
                    uname="";
                    c=1;
                }
                
                else if(address.equals(""))
                {
                    errorMessage.add("Please enter the address");
                    address="";
                     c=1;
                }
                
                
                else if(contactno.equals(""))
                {
                    errorMessage.add("Please enter the contactno");
                    contactno="";
                     c=1;
                }
                
                
                else if(loginid.equals(""))
                {
                    errorMessage.add("Please enter the loginid");
                    loginid="";
                     c=1;
                }
                 
               
                else if(pass.equals(""))
                {
                    errorMessage.add("Please enter the password");
                    pass="";
                    c=1;
                }
                else if(repass.equals(""))
                {
                    errorMessage.add("Please re-enter the password");
                    repass="";
                    c=1;
                }
                else if(!(pass.equals("") && repass.equals("")))
                 {
                     if(!(pass.equals(repass)))
                     {
                       errorMessage.add("your password and re-entered password are not equal"); 
                       pass="";
                       repass="";
                       c=1;
                     }
                     
                 }
                else
                {
                    c=0;
                }
            
               if(c==1)
                    {
                            session.setAttribute("name", uname);
                            session.setAttribute("address", address);
                            session.setAttribute("contactno", contactno);
                            session.setAttribute("login", loginid);
                            session.setAttribute("pass", pass);
                            session.setAttribute("repass", repass);
                            session.setAttribute("errorMessage",errorMessage);
                            RequestDispatcher rd=request.getRequestDispatcher("registration.jsp");
                            rd.forward(request, response);
                    }
                if(c==0)
                    {
                            RequestDispatcher rd=request.getRequestDispatcher("exotica1");
                            rd.forward(request, response);  
                    }
                  
            }}
           catch(NullPointerException e)
                            {
                               System.out.println(e); 
                            }
           
            %>
    </body>
</html>
