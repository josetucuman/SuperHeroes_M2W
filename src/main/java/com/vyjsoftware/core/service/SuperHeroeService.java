package com.vyjsoftware.core.service;

import com.vyjsoftware.core.model.SuperHeroeModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SuperHeroeService {


    List<SuperHeroeModel> getAllSuperHero();

    SuperHeroeModel getSuperHeroName(String heroName);
}
