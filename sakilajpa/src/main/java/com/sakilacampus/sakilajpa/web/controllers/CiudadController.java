package com.sakilacampus.sakilajpa.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sakilacampus.sakilajpa.domain.entities.Ciudad;
import com.sakilacampus.sakilajpa.domain.service.ServicioCiudad;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/ciudades")
public class CiudadController {

    @Autowired
    private ServicioCiudad servicioCiudad;

    @GetMapping("/all")
    public List<Ciudad> mostrarCiudades() {
        return servicioCiudad.findAll();
    }


}
