<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>Hello World!</h2>
<%--点击跳转--%>
<%--<a href="${pageContext.request.contextPath}/product/findAll.do">查询全部</a>--%>


<jsp:forward page="/pages/main.jsp"></jsp:forward>
</body>
</html>
