package com.prueba.spring.appSemana7.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prueba.spring.appSemana7.model.Gato;
import com.prueba.spring.appSemana7.model.Persona;

@Controller
@RequestMapping("/practice")
public class PracticaController {

    @Value("${web.title}")
    private String tituloPagina;


    // Tipos de datos

    private String datoString = "Este es un string";

    private int datoInt = 1248;

    private List<String> miLista = Arrays.asList("Nombre 1", "Nombre 2", "Nombre 5");


    // Tipo de datos 2

    private Persona personaCreada = new Persona();
    private Persona persona2 = new Persona();
    private Persona persona3 = new Persona();


    private List<Persona> listaPersonas;

    private Map<String, String> miMapaNombres;

    // private Map<String, String> miMapaNombres = new HashMap<String, String>();
    
    private Map<String, Gato> mapaGatos;

    private Gato migato1 = new Gato();
    private Gato migato2 = new Gato();
    private Gato migato3 = new Gato();



   
    @GetMapping("/datos")
    public String datos(Model objeto) {


        objeto.addAttribute("miTituloDePagina", tituloPagina);
        // Enviando String
        objeto.addAttribute("stringsito", datoString);
        // Enviando Numero
        objeto.addAttribute("miNumero", datoInt);
        // Enviando Lista
        objeto.addAttribute("listaDeNombres", miLista);

        return "tiposDatos";
    };


    @GetMapping("/datos2")
    public String datos2(Model objeto) {

        personaCreada.setNombre("Mariano");
        personaCreada.setApellido("Torrez");
        personaCreada.setEdad(25);

        persona2.setNombre("Romina");
        persona2.setApellido("Salas");
        persona2.setEdad(17);

        persona3.setNombre("Juan");
        persona3.setApellido("Salinas");
        persona3.setEdad(25);


        // Rellenando lista

        listaPersonas = Arrays.asList(personaCreada, persona2, persona3);



        // *MAPS* //

        miMapaNombres = new HashMap<String, String>();

        miMapaNombres.put("dato1" , "Roxana");
        miMapaNombres.put("dato2" , "Felix");
        miMapaNombres.put("dato3" , "Filemon");



        // *Rellenanado mapa gatos* //

        migato1.setNombre("Maximo");
        migato1.setColor("Marron");

        migato2.setNombre("Argos");
        migato2.setColor("Plomo");

        migato3.setNombre("Niki");
        migato3.setColor("Rosa");

        mapaGatos = new HashMap<String, Gato>();

        mapaGatos.put("gato1", migato1);
        mapaGatos.put("gato2", migato2);
        mapaGatos.put("gato3", migato3);



        objeto.addAttribute("miTituloDePagina", tituloPagina);
        // Enviando objeto persona 
        objeto.addAttribute("objetoPersona", personaCreada);
        // Enviando objeto lista persona 
        objeto.addAttribute("listaPersonas", listaPersonas);
        // Enviando Mapa
        objeto.addAttribute("miMapa", miMapaNombres);
        // Enviando el mapa de gatos
        objeto.addAttribute("mapaGatosObjetos", mapaGatos);


        return "tiposDatos2";
    };

}
