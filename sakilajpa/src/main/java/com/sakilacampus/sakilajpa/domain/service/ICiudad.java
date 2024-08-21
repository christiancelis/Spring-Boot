package com.sakilacampus.sakilajpa.domain.service;

import java.util.*;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.sakilacampus.sakilajpa.domain.entities.Ciudad;

public interface ICiudad {
    Page<Ciudad> findAll(Pageable pageable);
    Optional<Ciudad> findOneById(Long id);
    Ciudad createOne(Ciudad ciudad);
}


