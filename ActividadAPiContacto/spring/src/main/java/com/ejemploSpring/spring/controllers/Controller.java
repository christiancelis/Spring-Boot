package com.ejemploSpring.spring.controllers;
import java.util.ArrayList;

import com.ejemploSpring.spring.models.ContactoDTO;

public class Controller {

     ArrayList <ContactoDTO> listaContactos = new ArrayList<>();

    private static Controller controlador;

    private Controller() {
        valinit();
    }

    private void valinit(){
        ContactoDTO contacto1  = new ContactoDTO(1,"pedro","pablo");
        ContactoDTO contacto2  = new ContactoDTO(2,"pancracio","pinguino");
        ContactoDTO contacto3  = new ContactoDTO(3,"anastacio","elefante");
        listaContactos.add(contacto1);
        listaContactos.add(contacto2);
        listaContactos.add(contacto3);
    } 


    public synchronized static Controller getInstance() {
        if (controlador == null) {
            controlador = new Controller();
        }
        return controlador;
    }


}
