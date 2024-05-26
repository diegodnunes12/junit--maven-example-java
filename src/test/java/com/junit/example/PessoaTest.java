package com.junit.example;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {
    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa pessoa1 = new Pessoa("Pessoa 1", LocalDateTime.of(2000, 5, 15, 15, 0, 0));
        assertEquals(24, pessoa1.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorIdade() {
        Pessoa pessoa1 = new Pessoa("Pessoa 1", LocalDateTime.of(2000, 5, 15, 15, 0, 0));
        assertTrue(pessoa1.ehMaiorIdade());

        Pessoa pessoa2 = new Pessoa("Pessoa 2", LocalDateTime.of(2024, 5, 15, 15, 0, 0));
        assertFalse(pessoa2.ehMaiorIdade());
    }

    @Test
    void validarLancamentos() {
        int[] primeiro = {10, 20, 30, 40, 50};
        int[] segundo = {10, 20, 30, 40, 50};
        int[] terceiro = {-1, 5, 3, 8, 50};

        assertArrayEquals(primeiro, segundo);
        assertNotEquals(primeiro, terceiro);
    }

    @Test
    void validarSeObjetoEstaNulo() {
        Pessoa pessoa = null;
        assertNull(pessoa);

        pessoa = new Pessoa("Pessoa 1", LocalDateTime.of(2000, 5, 15, 15, 0, 0));
        assertNotNull(pessoa);
    }
}