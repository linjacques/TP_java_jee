<%--
  Created by IntelliJ IDEA.
  User: jacqu
  Date: 07/12/2023
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<jsp:include page="../../head.jsp"></jsp:include>

<head>

    <%@include file="menu.jsp"%>


    <div class="container">
        <h1>Ajout de film</h1>


        <form method="post" action="${pageContext.request.contextPath}/ajouterfilm">
            <div class="mb-3">
                <label class="form-label">Titre:</label>
                <input class="form-control" type="text" name="titre" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Auteur:</label>
                <input class="form-control" type="text" name="realisateur" required>
            </div>
            <div class="mb-3">
                <label class="form-label">Annee:</label>
                <input class="form-control" type="text" name="annee" required>
            </div>

            <input class="btn btn-primary" type="submit" value="Ajouter">
        </form>
    </div>



</head>
<body>

</body>
</html>
