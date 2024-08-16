package com.jpawebexample.japweb.domain.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table(name = "persons")
public class Person {
    
    @Id
    @Column(name = "id_person", columnDefinition = "VARCHAR(20)", nullable=false)
    private String idPerson;
    
    @Column(name = "firs_name", columnDefinition = "VARCHAR(50)", nullable=true)
    private String firsName;

    @Column(name = "last_name", columnDefinition = "VARCHAR(50)", nullable=false)
    private String LastName;

   @ManyToOne
    City city;

    @ManyToOne
    TypePerson type_persons;

    public Person() {
    }

    public String getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(String idPerson) {
        this.idPerson = idPerson;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    
}
