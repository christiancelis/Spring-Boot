package com.ejemploSpring.spring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemploSpring.spring.models.ContactoDTO;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class ContactoController {


    @CrossOrigin(origins = "*")
    @GetMapping("/contacto/{idcontact}")
    public ContactoDTO  getContact(@PathVariable Integer idcontact) {
        ArrayList <ContactoDTO> lstcontacts = Controller.getInstance().listaContactos;
        Optional<ContactoDTO> info = lstcontacts.stream().filter(e-> e.getId() == idcontact).findFirst();
        if(info.isPresent()){
            return info.get();
        }else{
            return null;
        }
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/contacto/add")
    public ContactoDTO putContact(@RequestBody ContactoDTO contact) {
        ArrayList <ContactoDTO> lstcontacts = Controller.getInstance().listaContactos;
        Optional<ContactoDTO> info = lstcontacts.stream().filter(e-> e.getId() == contact.getId()).findFirst();
        if(info.isPresent()){
            return null;
        }
        else{
            lstcontacts.add(contact);
            return contact;
        }
    }
    
}
