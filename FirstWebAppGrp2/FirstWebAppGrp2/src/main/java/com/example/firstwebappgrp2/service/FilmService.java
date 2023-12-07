package com.example.firstwebappgrp2.service;

import com.example.firstwebappgrp2.entity.Film;

import java.util.ArrayList;
import java.util.List;

public class FilmService {
    private static ArrayList<Film> listFilm = new ArrayList<>();

    public void ajouterFilm(Film film){

        listFilm.add(film);
    }


    public List<Film> touslesfilms(){

        return listFilm;
    }
}
