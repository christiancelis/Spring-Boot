package com.crudsec.app_security_app.infrastructure;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudsec.app_security_app.domain.entity.Roles;

public interface RepositoryRole extends JpaRepository<Roles,Long> {
    Optional<Roles> findByName(String name);
    
}
