package com.example.firstwebappgrp2.service;

import com.example.firstwebappgrp2.dao.LivreDAO;
import com.example.firstwebappgrp2.entity.Livre;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;



public class LivreService {

    /*@Inject
    private LivreDAO livreDAO;


    public void ajouterLivre(Livre livre){
        livreDAO.ajouterLivre(livre);
    }

    public List<Livre> tousLesLivres(){
        return livreDAO.tousLesLivres();
    }

    public Livre recupererLivreParId(Long id){
        return livreDAO.recupererLivreParId(id);
    }*/

    private ArrayList<Livre> listLivre = new ArrayList<>();

    public void ajouterLivre(Livre livre){
        listLivre.add(livre);
    }


    public List<Livre> tousLesLivres(){
        return listLivre;
    }
}
