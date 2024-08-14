package com.jpawebexample.japweb.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Region {
    @Id
    @Column(columnDefinition = "VARCHAR(50)",nullable = false)
    private String codeRegion;

    @Column(columnDefinition = "VARCHAR(50)",nullable = false)
    private String nameRegion;

    @ManyToOne
    @JoinColumn(name = "codecountry_id")
    private Country countries;

    public Region() {
    }

    public String getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(String codeRegion) {
        this.codeRegion = codeRegion;
    }

    public String getNameRegion() {
        return nameRegion;
    }

    public void setNameRegion(String nameRegion) {
        this.nameRegion = nameRegion;
    }

}
