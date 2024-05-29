package com.junit.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CadastrarPessoa {
    private ApiCorreios correios;

    public CadastrarPessoa(final ApiCorreios correios) {
        this.correios = correios;
    }

    public Pessoa cadastrarPessoa(String nome, String documento, LocalDateTime nascimento, String cep) {
        Pessoa pessoa = new Pessoa(nome, nascimento);
        DadosLocalizacao dados = correios.buscaDadosComBaseCep(cep);

        return pessoa;
    }
}
