package com.ejemploSpring.spring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemploSpring.spring.models.ContactoDTO;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api")
public class ContactoController {

    @CrossOrigin(origins = "htt:")
    @GetMapping("/contacto/{idcontact}")
    public ContactoDTO  getContact(@PathVariable Integer idcontact) {
        System.out.println(idcontact);

        ArrayList <ContactoDTO> listaContactos = new ArrayList<>();
        ContactoDTO contacto1  = new ContactoDTO(1,"pedro","pablo");
        ContactoDTO contacto2  = new ContactoDTO(2,"pancracio","pinguino");
        ContactoDTO contacto3  = new ContactoDTO(3,"anastacio","elefante");
        listaContactos.add(contacto1);
        listaContactos.add(contacto2);
        listaContactos.add(contacto3);

        Optional<ContactoDTO> info = listaContactos.stream().filter(e-> e.getId() == idcontact).findFirst();
        return info.get(); 
    }

    
}
