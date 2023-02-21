package com.vyjsoftware.core.controller;

import com.vyjsoftware.core.model.SuperHeroeModel;
import com.vyjsoftware.core.service.SuperHeroeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.vyjsoftware.core.utils.UrlsVarias.*;

@RestController
@RequestMapping(SUPER_HEROE_URL_PRINCIPAL)
public class SuperHeroeController {

    @Autowired
    SuperHeroeService service;

    @GetMapping(SUPER_HEROE_URL+SUPER_HEROE_NOMBRE)
    public ResponseEntity<SuperHeroeModel> traerSuperHeroePorNombre(@PathVariable("nombre")String nombreHeroe){
        SuperHeroeModel superHeroeModel = new SuperHeroeModel(1L, "Superman", "Clark Kent");
        return ResponseEntity.ok(superHeroeModel);
    }
}
