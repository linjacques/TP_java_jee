package com.example.firstwebappgrp2.sevlet;

import com.example.firstwebappgrp2.connect.ConnectToList;
import com.example.firstwebappgrp2.entity.Livre;
import com.example.firstwebappgrp2.service.LivreService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.inject.Inject;
import java.io.IOException;

@WebServlet(name = "AjoutLivre", value = "/ajouter")
public class AjouterSevlet extends HttpServlet {

    //@Inject
    private LivreService livreService = ConnectToList.livreService;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/WEB-INF/jsp/ajouterLivre.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String titre = req.getParameter("titre");
        String auteur = req.getParameter("auteur");
        String annee = req.getParameter("annee");
        String genre = req.getParameter("genre");

        Long id= (long) livreService.tousLesLivres().size();

        Livre livre = new Livre(id, auteur, genre, annee, titre);

        livreService.ajouterLivre(livre);
        resp.sendRedirect(req.getContextPath()+"/liste-livre");
    }
}
