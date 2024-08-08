package com.ejemploSpring.spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemploSpring.spring.models.paramsDTO;
@RestController
@RequestMapping("/api")
public class RequestParamsController {

    @GetMapping("/saludo/{mensaje}")
    public paramsDTO saludo(@PathVariable String mensaje) {
        paramsDTO param = new paramsDTO();
        param.setMessage(mensaje);
    return param;
    }

    


}
