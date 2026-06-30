package com.minimarket; // Asegúrate que este sea el paquete correcto

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
class InventarioTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @WithMockUser(roles = "ADMIN")
    void testRegistroMovimientoInventario_ComoAdmin_DebeFuncionar() throws Exception {
        mockMvc.perform(post("/api/inventario/movimiento")
               .param("cantidad", "10")
               .param("tipo", "ENTRADA"))
               .andExpect(status().isOk());
    }
}