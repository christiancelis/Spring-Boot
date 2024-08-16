package com.sakilacampus.sakilajpa.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pelicula")
public class Pelicula { 
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_pelicula;
    
    @Column(columnDefinition = "VARCHAR(255)", nullable = true)
    private String titulo;



}
