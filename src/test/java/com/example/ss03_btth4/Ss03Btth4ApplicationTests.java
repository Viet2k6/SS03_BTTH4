package com.example.ss03_btth4;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class Ss03Btth4ApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testGetSinhVienJson() throws Exception {
        mockMvc.perform(get("/sinhvien")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[0].maSV").value("SV001"));
    }

    @Test
    void testGetSinhVienXml() throws Exception {
        mockMvc.perform(get("/sinhvien")
                .accept(MediaType.APPLICATION_XML))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_XML))
                .andExpect(xpath("/List/item[1]/maSV").exists());
    }

    @Test
    void testGetSinhVienDefault() throws Exception {
        mockMvc.perform(get("/sinhvien"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }
}
