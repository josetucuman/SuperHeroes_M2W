package com.vyjsoftware.core.service.impl;

import com.vyjsoftware.core.model.SuperHeroeModel;
import com.vyjsoftware.core.repository.SuperHeroeRepository;
import com.vyjsoftware.core.service.SuperHeroeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SuperHeroeServiceImpl implements SuperHeroeService {

    private SuperHeroeRepository repository;

    public SuperHeroeServiceImpl(SuperHeroeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<SuperHeroeModel> getAllSuperHero() {
        return null;
    }

    @Override
    public SuperHeroeModel getSuperHeroName(String heroName) {
        SuperHeroeModel model = new SuperHeroeModel(1L, "superman", "clark kent");
        return model;
    }
}
