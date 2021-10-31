<%--
  Created by IntelliJ IDEA.
  User: phan_
  Date: 10/31/2021
  Time: 1:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <meta charset="UTF-8">
  <style>
    table {
      border-collapse: collapse;
      width: 75%;
      border: 1px solid #ddd;
      margin: 0 auto;

    }
    th, td {
      padding: 9px;
      text-align: center;
      border-bottom: 1px solid #ddd;
    }

    img {
      width: 99px;
      height: 99px;
    }
  </style>
  <title>index</title>
</head>
<body>

<table>
  <tr>
    <th>Name</th>
    <th>Birth day</th>
    <th>Address</th>
    <th>Photo</th>
  </tr>
  <c:forEach var="item" items="${customerList}">
    <tr>
      <td>
          ${item.getName()}
      </td>
      <td>
          ${item.getBithDay()}
      </td>
      <td>
          ${item.getAddress()}
      </td>
      <td>
        <img src="${item.getImages()}" alt="cant load file">
      </td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
