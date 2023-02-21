package com.vyjsoftware.core.repository;

import com.vyjsoftware.core.model.SuperHeroeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuperHeroeRepository extends JpaRepository<SuperHeroeModel, Long> {

    SuperHeroeModel findByName(String anyString);
}
