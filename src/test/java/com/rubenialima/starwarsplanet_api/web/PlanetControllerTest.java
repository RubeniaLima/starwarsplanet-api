package com.rubenialima.starwarsplanet_api.web;

import static com.rubenialima.starwarsplanet_api.common.PlanetConstants.PLANET;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import java.net.URI;

@WebMvcTest(PlanetController.class)
public class PlanetControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void createdPlanet_WithValidData_ReturnsCreated() throws Exception {
        mockMvc.perform(post("/planets").content(objectMapper.writeValueAsString(PLANET)))
                .andExpect(status().isCreated());
    }
}
