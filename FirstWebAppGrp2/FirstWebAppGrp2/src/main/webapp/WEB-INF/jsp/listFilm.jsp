<%--
  Created by IntelliJ IDEA.
  User: jacqu
  Date: 07/12/2023
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="../../head.jsp"></jsp:include>
<head>
    <%@include file="menu.jsp"%>

    <title>Title</title>

    <h1> hello </h1>

    <ul>
        <%--@elvariable id="listFilm" type="java.util.List"--%>
        <c:forEach items="${listFilm}" var="film" varStatus="loop">
            <li>
                    ${film.gettitre()} - ${film.getrealisateur()} - ${film.getannee()}}
            </li>
        </c:forEach>
    </ul>
    </div>
</head>
<body>

</body>
</html>
