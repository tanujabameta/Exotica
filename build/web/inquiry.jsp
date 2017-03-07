<%-- 
    Document   : inquiry
    Created on : 24 Jun, 2016, 4:07:37 PM
    Author     : TANUJA BAMETA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form>
            <table>
                <tr>       
                    <td> Name:</td>
                    <td><input type="text" name="name"/></td>
                </tr>
                <tr>
                    <td>Address:</td>
                    <td><input type="text" name="address"/></td>
                </tr>  
                <tr>
                    <td>Contact Number:</td>
                    <td><input type="text" name="contact"/></td>
                </tr> 
                <tr>
                    <td>Email:</td>
                    <td><input type="text" name="email"/></td>
                </tr>
                <tr>
                    <td>Query:</td>
                    <td> <textarea rows="5" cols="16"></textarea> </td>
                </tr>
                <tr>
                    <td>Respond via mobile<input type="checkbox" name="mobile" value="mob"/></td>
                    <td>Respond via email<input type="checkbox" name="cemail" value="email"/></td>
                </tr>
                <tr>
                    <td> <p>If you opt respond via mobile specify the date and time our executive to contact you </p></td>
            </tr>
           <tr>
               <td>
                    Date
                    <select name="day">
                    <option value="">day</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                        </select>
            <select name="month">
                    <option value="">month</option>
                    <option value="1">Jan</option>
                    <option value="2">Feb</option>
                    <option value="3">March</option>
                    <option value="4">April</option>
                        </select>
           <select name="year">
                    <option value="">year</option>
                    <option value="1">2016</option>
                    <option value="2">2017</option>
                    <option value="3">2018</option>
                    <option value="4">2019</option>
                        </select>
               </td>
               <td>Time
                   <select name="time">
                    <option value="">time</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                        </select>
               </td>  
                            </tr>
                            <tr>
                                <td><input type="submit" value="submit"/></td>
                 s          </tr>                 
                </table>
             <c:if test="${param.mobile.equals('mob') && param.contact.equals('')}" >
            enter the contact number
        </c:if> 
            <c:if test="${param.cemail.equals('email') && param.email.equals('')}" >
            enter the email
        </c:if> 
          <c:if test="${param.mobile.equals('mob') && (param.day.equals('') || param.month.equals('') || param.year.equals('') ||param.time.equals('')) }" >
            enter date and time
        </c:if>    
        </form>
       
     </body>
</html>
