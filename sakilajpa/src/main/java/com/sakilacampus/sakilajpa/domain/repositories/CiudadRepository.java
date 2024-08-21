package com.sakilacampus.sakilajpa.domain.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sakilacampus.sakilajpa.domain.entities.Ciudad;


public interface CiudadRepository extends JpaRepository <Ciudad,Short> {
   Page<Ciudad> findAll(Pageable pagable);
}
