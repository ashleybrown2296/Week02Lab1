<%-- 
    Document   : ageCalculator
    Created on : Sep 18, 2017, 12:47:07 PM
    Author     : 679918
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Next Birthday</title>
    </head>
    <body>
        <h1>Age Next Birthday</h1>
       <form action = AgeCalculator method='get'>
           <div>Enter your current age: </div>
           <input type='number' min=1 pattern='^(0|[1-9][0-9]*)$' name='bday' value=${age}>
           <input type='submit' name= submit value='Age Next Birthday'>
       </form><br>
        ${answer}
        ${errorMessage}
    </body>
</html>
