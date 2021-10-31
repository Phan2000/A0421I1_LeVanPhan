<%--
  Created by IntelliJ IDEA.
  User: phan_
  Date: 10/29/2021
  Time: 8:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <style>
    .converter {
      margin: auto;
      padding: 9px;
      width: 333px;
      height: auto;
      border: solid 3px black;
      border-radius: 15px;
      background-color: whitesmoke;
    }

    .converter h1 {
      font-family: 'DejaVu Sans', Arial, Helvetica, sans-serif;
      text-align: center;
    }

    .converter input {
      border-radius: 9px;
      padding:3px;
      margin:3px;
    }

    .converter button {
      border-radius: 9px;
      background-color: black;
      color: white;
    }


  </style>
  <body>
    <div class="converter">
      <form method="post" action="${pageContext.request.contextPath}/convert">
        <h1>
          Currency Converter
        </h1>
        <div>
          <label>
            <input type="text" name="rate" placeholder="RATE"/>
          </label>
        </div>
        <div>
          <label>
            <input type="text" name="usd" placeholder="USD"/>
          </label>
        </div>
        <div>
          <input type = "submit" id = "submit" value = "Converter"/>
        </div>
      </form>
    </div>
  </body>
</html>
