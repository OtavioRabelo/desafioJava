package com.example.demo.digitounico;

import org.assertj.core.error.AssertionErrorFactory;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

class DigitoUnicoTest {

    @Test
    void obterDigitoUnicoDeVariosDigitos() {
        int digitoUnico = DigitoUnico.obterDigitoUnico("9875", 4);
        assertEquals(8, digitoUnico);
    }

    @Test
    void obterDigitoUnicoDeUmDigito() {
        int digitoUnico = DigitoUnico.obterDigitoUnico("1", 0);
        assertEquals(1, digitoUnico);
    }
}