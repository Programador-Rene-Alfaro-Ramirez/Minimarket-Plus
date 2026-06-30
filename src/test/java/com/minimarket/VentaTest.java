package com.minimarket;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class VentaTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @WithMockUser(roles = "CAJERO")
    void testGenerarVenta_ComoCajero_DebeFuncionar() throws Exception {
        mockMvc.perform(post("/api/ventas"))
               .andExpect(status().isCreated());
    }
}