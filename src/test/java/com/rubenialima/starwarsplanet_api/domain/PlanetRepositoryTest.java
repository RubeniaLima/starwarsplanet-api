package com.rubenialima.starwarsplanet_api.domain;

import org.junit.jupiter.api.Test;

import static com.rubenialima.starwarsplanet_api.common.PlanetConstants.PLANET;


public class PlanetRepositoryTest {

    PlanetRepository planetRepository;
    @Test
    public void createPlanet_WithValidData_ReturnsPlanet(){
        planetRepository.save(PLANET);
    }
}
