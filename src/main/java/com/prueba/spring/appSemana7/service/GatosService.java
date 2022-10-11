package com.prueba.spring.appSemana7.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.prueba.spring.appSemana7.model.Gato;

@Service
public class GatosService implements IGatoService {

    Gato felino1 = new Gato();
    Gato felino2 = new Gato();
    Gato felino3 = new Gato();

    private List<Gato> listaGato;

    @Override
    public List<Gato> obtenerListadoDeGatos() {

        felino1.setNombre("Maximo");
        felino1.setColor("Marron");

        felino2.setNombre("Argos");
        felino2.setColor("Plomo");

        felino3.setNombre("Niki");
        felino3.setColor("Rosa");

        listaGato = Arrays.asList(felino1, felino2, felino3);

        return listaGato;
    };
    
}
