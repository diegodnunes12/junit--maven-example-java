package com.junit.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {
    @Test
    void validarAlgoSomenteNoUsuarioPessoa() {
        Assumptions.assumeTrue("Diego Nunes".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }
}
