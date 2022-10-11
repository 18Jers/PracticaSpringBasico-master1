package com.prueba.spring.appSemana7.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prueba.spring.appSemana7.service.IGatoService;

@Controller
@RequestMapping("/app")
public class HomeController {

    // @Value("Mi titulo")
    @Value("${web.title}")
    private String miTituloDePagina;

    @Autowired
    private IGatoService listaDeGatos;

    
    @GetMapping("/inicio")
    public String inicio() {
        return "index";
    }

    @GetMapping("/indexandoConSpring")
    public String normal(Model modelo) {


        modelo.addAttribute("titulo", miTituloDePagina);

        //traer los atributos y enviarselos a la vista

        modelo.addAttribute("miListaDeGatitos", listaDeGatos.obtenerListadoDeGatos());



        return "home";
    };

}
