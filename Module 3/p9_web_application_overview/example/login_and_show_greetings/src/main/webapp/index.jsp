<%--
  Created by IntelliJ IDEA.
  User: phan_
  Date: 10/29/2021
  Time: 7:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
<%--    <link type="text/css" href="style.css">--%>
    <style>
      .login {
        background-color: #CCCCCC;
        border-radius:15px ;
        height:199px;
        width:333px;
        margin:1px;
        padding:9px;
        border:3px #CCC solid;
        font-family: 'DejaVu Sans', Arial, Helvetica, sans-serif;
      }
      .login input {
        border-radius: 9px;
        padding:3px;
        margin:3px;
      }

      .login button {
        background-color: #CCCCCC;
      }

    </style>
  </head>
  <body>
    <form method="get" action="${pageContext.request.contextPath}/login">
      <div class="login">
        <h2>Login</h2>
        <label>
          <input type="text" name="username" size="27"  placeholder="username" />
        </label>
        <label>
          <input type="password" name="password" size="27" placeholder="password" />
        </label>
        <input type="submit" value="Sign in"/>
      </div>
    </form>
  </body>
</html>
