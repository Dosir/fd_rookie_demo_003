<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="java.io.PrintWriter" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>测试</title>
</head>

<body>
    <table>
        <thead>
        <tr>
            <th>key</th>
            <th>总次数</th>
            <th>查询次数</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${userList}" var="user">
            <tr>
                <td>${user.ukey}</td>
                <td>${user.totalnum}</td>
                <td>${user.querynum}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</body>
</html>