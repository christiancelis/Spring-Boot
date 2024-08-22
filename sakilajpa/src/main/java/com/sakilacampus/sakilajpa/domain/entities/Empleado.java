package com.sakilacampus.sakilajpa.domain.entities;

import java.time.LocalDateTime;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_empleado;

    @Column(columnDefinition = "VARCHAR(45)", nullable=false)
    private String nombre; 

    @Column(columnDefinition = "VARCHAR(45)", nullable=false)
    private String apellido;

    private byte imagen;

    @Column(columnDefinition = "VARCHAR(50)", nullable=false)
    private String email;

    @Column(nullable = false)
    private int activo;

    @Column(columnDefinition = "VARCHAR(16)", nullable=false)
    private String username;

    @Column(columnDefinition = "VARCHAR(40)", nullable = false)
    private String password;

    @Column(columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDateTime ultima_actualizacion;

    @ManyToOne
    Direccion direccion_emp;
    
    public Empleado() {
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public byte getImagen() {
        return imagen;
    }

    public void setImagen(byte imagen) {
        this.imagen = imagen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getUltima_actualizacion() {
        return ultima_actualizacion;
    }

    public void setUltima_actualizacion(LocalDateTime ultima_actualizacion) {
        this.ultima_actualizacion = ultima_actualizacion;
    }


    
 }
