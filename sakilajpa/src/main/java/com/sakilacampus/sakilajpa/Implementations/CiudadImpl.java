package com.sakilacampus.sakilajpa.Implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sakilacampus.sakilajpa.domain.entities.Ciudad;
import com.sakilacampus.sakilajpa.domain.repositories.CiudadRepository;
import com.sakilacampus.sakilajpa.domain.service.ICiudad;

@Service
public class CiudadImpl implements ICiudad{

    @Autowired
    CiudadRepository ciudadRepository;

    @Override
    public Page<Ciudad> findAll(Pageable pagable) {
        return ciudadRepository.findAll(pagable);
    }
    
    @Override
    public Optional<Ciudad> findOneById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findOneById'");
    }

    @Override
    public Ciudad createOne(Ciudad ciudad) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createOne'");
    }

   

}
