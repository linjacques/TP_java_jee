package com.example.firstwebappgrp2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

//@Entity
public class Livre {
    //@Id
    //@GeneratedValue
    private Long id;
    private String auteur;
    private String genre;
    private String annee;
    private String titre;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Livre(Long id, String auteur, String genre, String annee, String titre) {
        this.id = id;
        this.auteur = auteur;
        this.genre = genre;
        this.annee = annee;
        this.titre = titre;
    }
}
