package com.example.firstwebappgrp2.sevlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "firstServlet", value ="/first-servlet")
public class FirstServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String monMessage = "Hello, c'est ";

        req.setAttribute("msg", monMessage);

        req.getRequestDispatcher("/WEB-INF/jsp/first_jsp.jsp").forward(req, resp);


    }
}
