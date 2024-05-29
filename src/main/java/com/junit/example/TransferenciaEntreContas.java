package com.junit.example;

public class TransferenciaEntreContas {
    public void transfere(int contaOrigem, int contaDestino, int valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior do que 0");
        }
    }
}
