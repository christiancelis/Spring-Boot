package com.crudsec.app_security_app.infrastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import com.crudsec.app_security_app.application.services.IUserService;
import com.crudsec.app_security_app.domain.entity.Roles;
import com.crudsec.app_security_app.domain.entity.User;



public class UserAdapter implements IUserService{

    @Autowired
    private RepositoryUser repositoryUser;

    @Autowired
    private RepositoryRole repositoryRole;

    @Autowired 
    private PasswordEncoder passwordEncoder;



    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
      return (List<User>) repositoryUser.findAll();
    }

    @Override
    @Transactional
    public User save(User user) {
        Optional <Roles> optionalRoleUser = repositoryRole.findByName("ROLE_USER");
        List<Roles> roles = new ArrayList<>();
        optionalRoleUser.ifPresent(roles::add);
        
        if(user.isAdmin()){
            Optional<Roles> optionalRoleAdmin = repositoryRole.findByName("ROLE_ADMIN");
            optionalRoleAdmin.ifPresent(roles::add);
        }


        user.setRoles(roles);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return repositoryUser.save(user);
        

    }

}
