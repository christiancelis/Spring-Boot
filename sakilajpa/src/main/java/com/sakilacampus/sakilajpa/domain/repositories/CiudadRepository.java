package com.sakilacampus.sakilajpa.domain.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sakilacampus.sakilajpa.domain.entities.Ciudad;


public interface CiudadRepository extends JpaRepository <Ciudad,Short> {
   List<Ciudad> findAll();
}
