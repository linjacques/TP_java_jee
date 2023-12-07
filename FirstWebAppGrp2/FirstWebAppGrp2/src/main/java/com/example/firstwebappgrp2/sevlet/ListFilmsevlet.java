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
import java.util.List;

@WebServlet(name = "listefilm" , value = "/liste-film")
public class ListFilmsevlet extends HttpServlet {

    private FilmService filmService = ConnectToList.filmService;


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Film> listeFilm = filmService.touslesfilms();
        req.setAttribute("listFilm", listeFilm);

        req.getRequestDispatcher("/WEB-INF/jsp/listFilm.jsp").forward(req, resp);
    }
}
