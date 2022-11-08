<%--
  Created by IntelliJ IDEA.
  User: Tran Thi Thu Hang
  Date: 03/11/2022
  Time: 4:42 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Title</title>
</head>
<body>
<div align="center">
    <form action="/editProduct" method="post">
        <h1>EDIT PRODUCT</h1>
        <table>
            <tr>
                <td>Nhập id</td>
                <td><input name="productID" placeholder="nhập productID"></td>
                <%--                <td><input name="id" value="${sp.id}" readonly></td>--%>
            </tr>
            <tr>
                <td>Nhập name</td>
                <td><input name="username" placeholder="nhập username"></td>
                <%--                <td><input name="name" value="${sp.name}"></td>--%>
            </tr>
            <tr>
                <td>Nhập type</td>
                <td><input name="type" placeholder="nhập type"></td>
                <%--                <td><input name="type" value="${sp.type}"></td>--%>
            </tr>
            <tr>
                <td>Nhập img</td>
                <td><input name="img" placeholder="nhập img"></td>
                <%--                <td><input name="img" value="${sp.img}"></td>--%>
            </tr>
            <tr>
                <td>Nhập total</td>
                <td><input name="total" placeholder="nhập total"></td>
                <%--                <td><input name="price" value="${sp.price}"></td>--%>
            </tr>
        </table>
        <button type="submit">Submit</button>
    </form>
</div>

</body>
</html>
