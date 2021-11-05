<%--
  Created by IntelliJ IDEA.
  User: phan_
  Date: 11/1/2021
  Time: 7:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>calculator</title>
    <style>
      h1 {
        font-family: 'DejaVu Sans', Arial, Helvetica, sans-serif;
        text-align: center;
      }

      legend  {
        font-family: 'DejaVu Sans', Arial, Helvetica, sans-serif;
      }
    </style>
  </head>
  <body>
    <h1>
      SIMPLE CALCULATOR
    </h1>
    <form action="/calculator", method="post">
      <fieldset>
        <legend>Calculator</legend>
        <table>
          <tr>
            <td>First operand: </td>
            <td><input name="first-operand" type="text"/></td>
          </tr>
          <tr>
            <td>Operator: </td>
            <td>
              <select name="operator">
                <option value="+">Addition</option>
                <option value="-">Subtraction</option>
                <option value="*">Multiplication</option>
                <option value="/">Division</option>
              </select>
            </td>
          </tr>
          <tr>
            <td>Second operand: </td>
            <td><input name="second-operand" type="text"/></td>
          </tr>
          <tr>
            <td></td>
            <td><input type="submit" value="calculate"/></td>
          </tr>
        </table>
      </fieldset>
    </form>
  </body>
</html>
