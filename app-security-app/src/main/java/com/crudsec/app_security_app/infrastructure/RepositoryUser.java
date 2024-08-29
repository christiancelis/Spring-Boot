package com.crudsec.app_security_app.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudsec.app_security_app.domain.entity.User;

public interface RepositoryUser extends JpaRepository<User,Long> {

}
