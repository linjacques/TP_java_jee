package com.example.firstwebappgrp2.dao;


import com.example.firstwebappgrp2.entity.Livre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class LivreDAO {
    /*@PersistenceContext
    private EntityManager entityManager;

    public void ajouterLivre(Livre livre){
        entityManager.persist(livre);
    }
    public List<Livre> tousLesLivres(){
        String sql = "SELECT l from Livre l";
        TypedQuery<Livre> query = entityManager.createQuery(sql, Livre.class);

        return query.getResultList();
    }

    public Livre recupererLivreParId(Long id){
        return entityManager.find(Livre.class, id);
    }*/

}
