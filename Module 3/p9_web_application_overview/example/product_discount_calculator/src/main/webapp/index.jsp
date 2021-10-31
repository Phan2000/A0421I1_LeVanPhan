<%--
  Created by IntelliJ IDEA.
  User: phan_
  Date: 10/31/2021
  Time: 1:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Currency Converter</title>
</head>
<body>
<h2>Product Discount Calculator</h2>
<form action="${pageContext.request.contextPath}\discount" method="post">
  <label>Product Description: </label><br/>
  <label>
    <input type="text" name="rate" placeholder="Product Description"/>
  </label><br/>
  <label>List Price: </label><br/>
  <label>
    <input type="text" name="price" placeholder="USD" />
  </label><br/>
  <label>Discount Percent: </label><br/>
  <label>
    <input type="text" name="percent" placeholder="%" />
  </label><br/>
  <input type = "submit" id = "submit" value = "Discount"/>
</form>
</body>
</html>
