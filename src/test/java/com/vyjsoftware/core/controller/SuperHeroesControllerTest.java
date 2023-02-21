package com.vyjsoftware.core.controller;

import com.vyjsoftware.core.model.SuperHeroeModel;
import com.vyjsoftware.core.repository.SuperHeroeRepository;
import com.vyjsoftware.core.service.SuperHeroeService;
import com.vyjsoftware.core.service.impl.SuperHeroeServiceImpl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class SuperHeroesControllerTest {

    private SuperHeroeService service;

    @Mock
    private SuperHeroeRepository repository;

    @BeforeEach
    public void setUp() throws Exception {
        service = new SuperHeroeServiceImpl(repository);
    }

    @Test
    public void getHeroName_should_return_hero_names_given_correct_hero_name() throws Exception{
        // arrange
        given(repository.findByName(anyString())).willReturn(new SuperHeroeModel(1L,"superman", "clark kent"));

        // act and assert
        SuperHeroeModel superHeroe = service.getSuperHeroName("superman");
        assertThat(superHeroe.getSuperHero()).isEqualTo("superman");
        assertThat(superHeroe.getRealName()).isEqualTo("clark kent");

    }

    
}
