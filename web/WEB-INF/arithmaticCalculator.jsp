<%-- 
    Document   : arithmaticCalculator
    Created on : 26-May-2023, 12:46:02 PM
    Author     : TyHalvorsen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head></head>
        <title>Week3Lab_Calculators_Arithmetic</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
    </head>
    <body>
        <div>
            <form method="post" action="math">
                <h1>Arithmetic Calculator</h1>
                <label for="firstNumber">Enter first number</label>
                <input type="number" name="firstNumber">
                <label for="secondNumber">Enter second number</label>
                <input type="number" name="secondNumber">
                <br>
                <input type="submit" name="plus" value="+">
                <input type="submit" name="minus" value="-">
                <input type="submit" name="multiply" value="*">
                <input type="submit" name="modulo" value="%">
            </form>
            <br>
            <p>${calc}</p>
            <br>
            <a href="./age" target="_blank">Age Calculator</a>
            
        </div>
    </body>
</html>