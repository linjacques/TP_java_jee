package com.example.firstwebappgrp2.entity;

public class Film {
    private long id;

    private String realisateur;

    private String annee;

    private String titre;


    public void setId(long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setannee(String annee) {
        this.annee = annee;
    }

    public String getannee() {
        return annee;
    }


    public void setrealisateur(String realisateur) {
        this.realisateur = realisateur;
    }
    public String getrealisateur() {

        return realisateur;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String gettitre() {

        return titre;
    }

    public Film (long id, String annee, String realisateur, String titre) {
        this.id = id;
        this.annee = annee;
        this.realisateur = realisateur;
        this.titre = titre;

    }
}
