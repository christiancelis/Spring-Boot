package com.ejemploSpring.spring.models;

public class ContactoDTO {
    private Integer id;
    private String nombre;
    private String Apellido;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public ContactoDTO() {
    }
    
    public ContactoDTO(Integer id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        Apellido = apellido;
    }

    

    

    
}
