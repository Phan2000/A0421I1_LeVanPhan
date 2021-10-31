<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: phan_
  Date: 10/31/2021
  Time: 3:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<style>
    table {
        border-collapse: collapse;
        width: 70%;
        border: 1px solid #ddd;
        margin: 0 auto;

    }

    th, td {
        padding: 8px;
        text-align: center;
        border-bottom: 1px solid #ddd;
    }

    img {
        width: 100px;
        height: 100px;
    }
</style>
<body>
<h1>
    HOME
</h1>
<h2>
    Display Customer List
</h2>
<table>
    <tr>
        <th>Name</th>
        <th>Date</th>
        <th>Address</th>
        <th>Images</th>
    </tr>
    <c:forEach items="${list}" var="customer">
        <tr>
            <td>${customer.name}</td>
            <td>${customer.birthday}</td>
            <td>${customer.address}</td>
            <td>${customer.images}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
