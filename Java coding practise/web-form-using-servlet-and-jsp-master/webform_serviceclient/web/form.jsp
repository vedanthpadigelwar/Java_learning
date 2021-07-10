<%-- 
    Document   : form
    Created on : Jun 23, 2018, 12:04:01 PM
    Author     : 7559
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action='/webform_serviceclient/servletform'>
          UserName: <input type ="text" name="username"  
                           required 
               placeholder="4 to 8 characters long" /><br/>
          </br>
          Password:<input type ="password" name="password" required placeholder="5 to 12 characters long"/></br>
           </br>
          Name: <input type ="text" name="name" required placeholder="alphabes only"/><br/>
          </br>
          address: <input type ="text" name="address" required  placeholder="optional"/><br/>
          </br>
          country1: 
           <select value="country1">
               <option selected disabled>select your country</option>
            <option value="india">india</option>
            <option value="saab">australia</option>
            <option value="mercedes">usa</option>
            <option value="audi">uk</option>
            </select>
          <br/>
          </br>
          zipcode: <input type ="number" name="zipcode" required  placeholder="must be numeric"/><br/>
          </br>
          email id: <input type ="text" name="email id" required placeholder="must be a valid email id"/><br/>
          </br>
          gender: <input type ="radio" name="gender" value = "male"/>male
                  <input type ="radio" name="gender" value = "female"/>female
                  <input type ="radio" name="gender" value = "others"/>others
          <br/>
          language: <input type ="checkbox" name="language" value="english" /> english
                    <input type ="checkbox" name="language" value="french"/> french
          <br/>
          
            about:<textarea rows="4" cols="50">
              optional
             </textarea>
          </br>
          </br>
          
          <input type = "submit" value ="submit">
        
        </form>
    
    </body>
</html>
