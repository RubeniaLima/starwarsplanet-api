package com.rubenialima.starwarsplanet_api.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = PlanetService.class)
public class PlanetServiceTest {
    @Autowired
    PlanetService planetService;

    @Test
    public void createPlanet_WithValidData_ReturnsPlanet(){

    }
}
