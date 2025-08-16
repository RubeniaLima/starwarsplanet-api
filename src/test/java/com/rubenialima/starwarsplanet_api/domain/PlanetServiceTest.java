package com.rubenialima.starwarsplanet_api.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.assertj.core.api.Assertions.assertThat;

import static com.rubenialima.starwarsplanet_api.common.PlanetConstants.PLANET;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = PlanetService.class)
public class PlanetServiceTest {
    @Autowired
    PlanetService planetService;
    @MockitoBean
    private PlanetRepository planetRepository;

    @Test
    public void createPlanet_WithValidData_ReturnsPlanet(){
        when(planetRepository.save(PLANET)).thenReturn(PLANET);
        Planet sut = planetService.create(PLANET);
        assertThat(sut).isEqualTo(PLANET);
    }
}
