package com.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.junit.example.TransferenciaEntreContas;

public class ExceprionsTest {
    @Test
    void validaCenarioDeExcecaoTrasferencia() {
        TransferenciaEntreContas transferencia = new TransferenciaEntreContas();

        //Assertions.assertThrows(IllegalArgumentException.class, () -> transferencia.transfere(10, 20, -1));
        //Assertions.assertDoesNotThrow(() -> transferencia.transfere(10, 20, 20));
    }
}
