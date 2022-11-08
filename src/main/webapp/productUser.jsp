<%--
  Created by IntelliJ IDEA.
  User: Tran Thi Thu Hang
  Date: 03/11/2022
  Time: 4:00 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container mt-3">
    <h2>CHÀO MỪNG QUÝ KHÁCH</h2>

<%--    <a type="button" class="btn btn-success" href="/createProduct.jsp">Create</a>--%>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>productID</th>
            <th>name</th>
            <th>type</th>
            <th>img</th>
            <th>total</th>
            <th>buy</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach items="${sanphams}" var="sp">
            <tr>
                <td>${sp.productID}</td>
                <td>${sp.username}</td>
                <td>${sp.type}</td>
                <td><img src="${sp.img}" height="200" width="250"></td>
                <td>${sp.total}</td>
                <td><a type="button" class="btn btn-warning" href="/hoaDonChiTiet?productID=${sp.productID}" >buy</a></td>

            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>>

</body>
</html>
