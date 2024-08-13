package com.jpaappj3.jpa_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpaappj3.jpa_app.entities.Person;
import java.util.List;


public interface PersonRepository extends JpaRepository<Person,Long> {
    List<Person> findByProgrammingLanguage(String programmingLanguage);
}
