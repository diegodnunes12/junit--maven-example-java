package com.junit.example;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {
    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa pessoa1 = new Pessoa("Pessoa 1", LocalDateTime.of(2000, 5, 15, 15, 0, 0));
        Assertions.assertEquals(24, pessoa1.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorIdade() {
        Pessoa pessoa1 = new Pessoa("Pessoa 1", LocalDateTime.of(2000, 5, 15, 15, 0, 0));
        Assertions.assertTrue(pessoa1.ehMaiorIdade());

        Pessoa pessoa2 = new Pessoa("Pessoa 2", LocalDateTime.of(2024, 5, 15, 15, 0, 0));
        Assertions.assertFalse(pessoa2.ehMaiorIdade());
    }
}