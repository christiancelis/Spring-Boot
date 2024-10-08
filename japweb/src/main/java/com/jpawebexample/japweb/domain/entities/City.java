package com.jpawebexample.japweb.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class City {
    @Id
    @Column(columnDefinition = "VARCHAR(50)",nullable = false)
    private String codeCity;

    @Column(columnDefinition = "VARCHAR(50)",nullable = false)
    private String nameCity;

    public City() {
    }

    @ManyToOne
    Region region;

    public String getCodeCity() {
        return codeCity;
    }

    public void setCodeCity(String codeCity) {
        this.codeCity = codeCity;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }
}
