package com.minimarket.controller; // Ajusta según el paquete donde esté tu ProductoController o Service

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ProductoTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @WithMockUser(roles = "ADMIN") // Simulamos ser un ADMIN
    void testEdicionProductoComoAdmin_DebeFuncionar() throws Exception {
        mockMvc.perform(put("/api/productos/1")) // Ajusta tu URL
               .andExpect(status().isOk());
    }

    @Test
    @WithMockUser(roles = "CLIENTE") // Simulamos ser un CLIENTE
    void testEdicionProductoComoCliente_DebeFallar() throws Exception {
        mockMvc.perform(put("/api/productos/1"))
               .andExpect(status().isForbidden()); // Esperamos un 403 Forbidden
    }
}