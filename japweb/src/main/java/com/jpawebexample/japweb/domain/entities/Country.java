package com.jpawebexample.japweb.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="countries") //solo colocar si desea cambiar el nombre por defecto de la tabla
public class Country {

    @Id
    @Column(columnDefinition = "VARCHAR(50)",nullable = false)
    private String codeCountry;

    @Column(columnDefinition = "VARCHAR(50)",nullable = false)
    private String nameCountry;

    public Country() {
    }

    public String getCodeCountry() {
        return codeCountry;
    }

    public void setCodeCountry(String codeCountry) {
        this.codeCountry = codeCountry;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }    
}
