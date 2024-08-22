package com.sakilacampus.sakilajpa.Implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakilacampus.sakilajpa.domain.entities.Ciudad;
import com.sakilacampus.sakilajpa.domain.repositories.CiudadRepository;
import com.sakilacampus.sakilajpa.domain.service.ServicioCiudad;

@Service
public class CiudadImpl implements ServicioCiudad{

    @Autowired
    CiudadRepository ciudadRepository;

    @Override
    public List<Ciudad> findAll() {
        return ciudadRepository.findAll();
    }

    
   

}
