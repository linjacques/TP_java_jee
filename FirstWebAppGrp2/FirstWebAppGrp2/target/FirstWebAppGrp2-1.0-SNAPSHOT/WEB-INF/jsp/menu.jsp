<%--
  Created by IntelliJ IDEA.
  User: faneva
  Date: 22/11/2023
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="<%=request.getContextPath()%>">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="liste-livre">Liste livres</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="ajouter">Ajouter</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="first-servlet">Rechercher</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="ajouterfilm">ajouter film</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="liste-film">liste film</a>
                </li>

            </ul>
        </div>
    </div>
</nav>
