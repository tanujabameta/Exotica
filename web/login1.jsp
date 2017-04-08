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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
	<link rel = "stylesheet" href = "sak.css">
    </head>
    <body>
       <div class="modal modal-transparent fade" id="modal-transparent" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog" style="margin-top: 5%;">
    <div class="modal-content" style="height:400px;width:400px">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button> 
        <center><h4 class="modal-title" id="myModalLabel" style="font-family:'Calibri';font-size: 50px;">Welcome!</h4></center>
      </div>
       <div class="modal-body">
      <form method="get" action="okok">
            <table>
              <% 
             Cookie c[]=request.getCookies();
             String uid="",pass="";
            if(c!=null)
            {
               for(int i=0;i<c.length;i++)
                {
               if(c[i].getName().equals("login"))
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
		<td style="font-family:'Calibri';font-size: 30px;">Login id</td>
		<td style="font-family:'Calibri';font-size: 30px;">&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;</td>
		<td><input type="text" name="login" ></td>
	    </tr>
	    <tr>
	        <td><br></td>
	    </tr>
	    <tr>
                <td style="font-family:'Calibri';font-size: 30px;">Password</td>
	        <td style="font-family:'Calibri';font-size: 30px;">&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;&nbsp;</td>
		<td><input type="password" name="pass"></td>
	    </tr> 
  <!-- <tr>
   <td> <p  style="text-size: 20px; margin-left:65%;"></br><a href="">Forget Password?</a></p></td>
    </tr>-->
      
   <tr><td><br><br></td></tr>
     <tr> 
          <td style="font-size:16px;">Remember me</td>
          <td><input type="checkbox" name="check"></td>
      </tr> 
      <tr><td><br><br></td></tr>   
      
    <tr>
    <td><button type="button" class="btn btn-primary btn-lg" data-toggle="modal">Submit</button>
    </td>
    <td>&nbsp;&nbsp;&nbsp;</td>
    <td><button type="button" class="btn btn-primary btn-lg" data-toggle="modal">Reset</button>
    </td>
    </tr>
		</table>
	  </form>
	 </div>
  </div>
</div>
</div>
<br>
  

  
<!-- include jQuery -->
<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
  
<!-- include bootstrap -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
 <script>
 
$(".modal-transparent").on('show.bs.modal', function () {
  setTimeout( function() {
    $(".modal-backdrop").addClass("modal-backdrop-transparent");
  }, 0);
});
$(".modal-transparent").on('hidden.bs.modal', function () {
  $(".modal-backdrop").addClass("modal-backdrop-transparent");
});

$(".modal-fullscreen").on('show.bs.modal', function () {
  setTimeout( function() {
    $(".modal-backdrop").addClass("modal-backdrop-fullscreen");
  }, 0);
});
$(".modal-fullscreen").on('hidden.bs.modal', function () {
  $(".modal-backdrop").addClass("modal-backdrop-fullscreen");
});

 </script>
</body>
</html>
