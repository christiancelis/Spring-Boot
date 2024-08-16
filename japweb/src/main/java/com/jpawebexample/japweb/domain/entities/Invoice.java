package com.jpawebexample.japweb.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="invoices")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(columnDefinition = "VARCHAR(50)",nullable = true)
    private String description;

    @Column(nullable = true)
    private Long total;
    
    @ManyToOne
    private Person persons;


    public Invoice() {
    }
    
    public Long getId() {
    return id;
    }
    public void setId(Long id) {
    this.id = id;
    }
    public String getDescription() {
    return description;
    }
    public void setDescription(String description) {
    this.description = description;
    }
    public Long getTotal() {
    return total;
    }
    public void setTotal(Long total) {
    this.total = total;
    }

}
