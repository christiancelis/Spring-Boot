package com.jpawebexample.japweb.domain.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "detail_products")
public class DetailProduct {


    @EmbeddedId
    ProductInvoicePK id;

    private Integer quatity;
    private Double price;
    
    @ManyToOne
    @JoinColumn(name = "id_invoice", insertable = false, updatable = false)
    private Invoice invoice;
    
    @ManyToOne
    @JoinColumn(name = "id_product", insertable = false, updatable = false)
    private Product products;

    public ProductInvoicePK getId() {
        return id;
    }

    public void setId(ProductInvoicePK id) {
        this.id = id;
    }

    public Integer getQuatity() {
        return quatity;
    }

    public void setQuatity(Integer quatity) {
        this.quatity = quatity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Product getProducts() {
        return products;
    }

    public void setProducts(Product products) {
        this.products = products;
    }

    
}
