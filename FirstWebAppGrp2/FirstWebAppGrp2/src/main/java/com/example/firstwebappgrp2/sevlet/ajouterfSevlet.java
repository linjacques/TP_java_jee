package com.example.firstwebappgrp2.sevlet;
import com.example.firstwebappgrp2.connect.ConnectToList;
import com.example.firstwebappgrp2.entity.Film;
import com.example.firstwebappgrp2.service.FilmService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "AjoutF", value = "/ajouterfilm")

public class ajouterfSevlet extends  HttpServlet{
    private FilmService filmService = ConnectToList.filmService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/WEB-INF/jsp/ajouterFilm.jsp").forward(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String titre = req.getParameter("titre");
        String realisateur = req.getParameter("realisateur");
        String annee = req.getParameter("annee");

        Long id= (long) filmService.touslesfilms().size();

        Film film = new Film(id, realisateur, annee, titre);

        filmService.ajouterFilm(film);
        resp.sendRedirect(req.getContextPath()+"/liste-film");
    }
}
