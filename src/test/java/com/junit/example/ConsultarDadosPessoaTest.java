package com.junit.example;

import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsultarDadosPessoaTest {

    @BeforeAll
    static void configuraConexao() {
        System.out.println("iniciou sessao");
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste() {
        BancoDeDados.inserirDados(new Pessoa("Pessoa 1", LocalDateTime.of(2000, 5, 15, 15, 0, 0)));
    }

    @Test
    void validaDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validaDadosDeRetorno2() {
        Assertions.assertTrue(true);
    }

    @AfterEach
    void removeDadosParaTeste() {
        BancoDeDados.removerDados(new Pessoa("Pessoa 1", LocalDateTime.of(2000, 5, 15, 15, 0, 0)));
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
        System.out.println("encerrou sessao");
    }
}
