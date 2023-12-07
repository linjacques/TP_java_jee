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
import java.util.List;

@WebServlet(name = "listeLivre" , value = "/liste-livre")
public class ListLivresServlet extends HttpServlet {

    //@Inject
    private LivreService livreService = ConnectToList.livreService;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Livre> listeLivres = livreService.tousLesLivres();
        req.setAttribute("listesLivre", listeLivres);

        req.getRequestDispatcher("/WEB-INF/jsp/listeLivres.jsp").forward(req, resp);
    }
}
