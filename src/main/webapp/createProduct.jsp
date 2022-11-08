<%--
  Created by IntelliJ IDEA.
  User: Tran Thi Thu Hang
  Date: 03/11/2022
  Time: 4:37 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table style=" background-color:blue" align="center">
    <tr >

        <br>
        <h1 STYLE="color:black;top: 300px; left: 350px"  align="center" >DOLCE&GABBANA</h1>
    </tr>
    <br>
</table>
<div align="center">
    <form action="/createProduct">
        <h1>Create Product</h1>
        <table>
            <tr>
                <td>Nhập id</td>
                <td><input name="productID" placeholder="nhập productID"></td>
                <h6 style="color: red">${thongbaoproductID}</h6>
            </tr>

            <tr>
                <td>Nhập name</td>
                <td><input name="name" placeholder="nhập name"></td>
            </tr>
            <tr>
                <td>Nhập loai</td>
                <td><input name="type" placeholder="nhập type"></td>
            </tr>
            <tr>
                <td>Nhập img</td>
                <td><input name="img" placeholder="nhập img"></td>
            </tr>
            <tr>
                <td>Nhập total</td>
                <td><input name="total" placeholder="nhập total"></td>
            </tr>
        </table>
        <br>
        <button type="submit">Submit</button>
    </form>
</div>

</body>
</html>
