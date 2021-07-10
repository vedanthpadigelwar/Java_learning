<%-- 
    Document   : xtrnalserver
    Created on : Jun 28, 2018, 11:21:55 PM
    Author     : 7559
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
body {font-family: Arial, Helvetica, sans-serif;}
* {box-sizing: border-box}

/* Full-width input fields */
input[type=text], input[type=password] {
    width: 100%;
    padding: 15px;
    margin: 5px 0 22px 0;
    display: inline-block;
    border: none;
    background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
    background-color: #ddd;
    outline: none;
}

hr {
    border: 1px solid #f1f1f1;
    margin-bottom: 25px;
}

/* Set a style for all buttons */
button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
    opacity: 0.9;
}

button:hover {
    opacity:1;
}

/* Extra styles for the cancel button */
.cancelbtn {
    padding: 14px 20px;
    background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn {
  float: left;
  width: 50%;
}

/* Add padding to container elements */
.container {
    padding: 16px;
}

/* Clear floats */
.clearfix::after {
    content: "";
    clear: both;
    display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
    .cancelbtn, .signupbtn {
       width: 100%;
    }
}
</style>
    </head>
    <body onload='assign()'>
        <h1>Hello World!</h1>
    <%-- start web service invocation --%><hr/>
    
    
    
    <form action='externalserver/xtr_client_sservlet'method="post" id='abc'>
        
        
        <div class="container">
   
    <p>Please fill in this form to create an account.</p>
    <hr>
        
        
        
          UserName: <input type ="text" name="username"  
                           required 
               placeholder="4 to 8 characters long" /><br/>
          </br>
          Password:<input type ="password" name="password" required placeholder="5 to 12 characters long"/></br>
           </br>
          Name: <input type ="text" name="name" required placeholder="alphabes only"/><br/>
          </br>
          address: <input type ="text" name="address"   placeholder="optional"/><br/>
          </br>
          country1: 
           </br>
           <select value="country1">
               <option selected disabled>select your country</option>
            <option value="india">india</option>
            <option value="saab">australia</option>
            <option value="mercedes">usa</option>
            <option value="audi">uk</option>
            </select>
          <br/>
          </br>
          zipcode:
           </br>
           <input type ="number" name="zipcode" required  placeholder="must be numeric"/><br/>
          </br>
          email id: <input type ="text" name="email id" required placeholder="must be a valid email id"/><br/>
          </br>
          gender: <input type ="radio" name="gender" value = "male"/>male
                  <input type ="radio" name="gender" value = "female"/>female
                  <input type ="radio" name="gender" value = "others"/>others
          <br/>
          language: <input type ="checkbox" name="language" value="english" style="margin-bottom:15px" /> english
                    <input type ="checkbox" name="language" value="french" style="margin-bottom:15px"/> french
          <br/>
          
           <p id="ve"><b style="color: red">Captcha: </b></p>
            <input id="captcha" type ="text" name="captcha" maxlength="3"/>
          
           
          </br>
          
          <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>

    <div class="clearfix">
      <button type="button" class="cancelbtn">Cancel</button>
       <input type = "button" class="cancelbtn"value ="submit"onclick="pass()" >
    </div>
  </div>
          
          <script type="text/javascript">
var x,y,z;

function assign(){
x = Math.floor(Math.random() * 10)+10;
document.getElementById("ve").innerHTML = document.getElementById("ve").innerHTML+ x;

z = Math.floor(Math.random() * 4)+1;


if(z ==1){
    document.getElementById("ve").innerHTML =document.getElementById("ve").innerHTML+" + " ;
}
if(z==2)
{
    document.getElementById("ve").innerHTML =document.getElementById("ve").innerHTML+" - " ;
}
if(z==3)
{
    document.getElementById("ve").innerHTML =document.getElementById("ve").innerHTML+" * " ;
}
if(z==4)
{
    document.getElementById("ve").innerHTML =document.getElementById("ve").innerHTML+" / " ;
}


y = Math.floor(Math.random() * 10)+1;
document.getElementById("ve").innerHTML =document.getElementById("ve").innerHTML+y ;
}

function pass(){
    var pas="/externalserver/xtr_client_sservlet?a="+x+"&b="+y+"&c="+z;
    document.getElementById("abc").action=pas;
    document.getElementById("abc").submit();
    
}



</script>
          
        
        </form>
    
    
   
    <%-- end web service invocation --%><hr/>
    </body>
</html>
