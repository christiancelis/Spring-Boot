package com.ejemploSpring.spring.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemploSpring.spring.models.paramsDTO;
@RestController
@RequestMapping("/api")
public class RequestParamsController {

    @Value("${app.name}")
    private String name;
    @Value("${app.message}")
    private String message;
    @Value("${app.version}")
    private String version;
    @Value("${app.listwords}")
    private String[] listwords;
    @Value("${app.listaroles}")
    private List<String> lstroles;
    @Value("#{'${app.listaroles}'.split(',')}")
    private List<String> customlstroles;
    @Value("#{'${app.listaroles}'.toUpperCase().split(',')}")
    private List<String> customlstrolesMayuscula;

    @GetMapping("/saludo/{mensaje}")
    public paramsDTO saludo(@PathVariable String mensaje) {
        paramsDTO param = new paramsDTO();
        param.setMessage(mensaje);
    return param;
    }
    
    @GetMapping("/valores")
    public Map<String,Object> valores(){
        Map<String,Object> json = new HashMap<>();
        json.put("name", name);
        json.put("version",version);
        json.put("listwords",listwords);
        json.put("lstroles", lstroles);
        json.put("clstroles", customlstroles);
        json.put("clstrolesMayus", customlstrolesMayuscula);
        json.put("message",message);
        return json;
    }

}
