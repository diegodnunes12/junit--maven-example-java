package com.junit.example;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {
    
    @Mock
    private ApiCorreios apiCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosCadastro() {
        DadosLocalizacao d = new DadosLocalizacao();
        d.setRua("Rua 1");

        Mockito.when(apiCorreios.buscaDadosComBaseCep("12345678")).thenReturn(d);
        Pessoa p = cadastrarPessoa.cadastrarPessoa("Pessoa", "123", LocalDateTime.now(), "12345678");

        Assertions.assertEquals("Pessoa", p.getNome());
    }
}
