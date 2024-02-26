package com.example.design.patterns.Conta;

public class FabricaBancoBrasil implements FabricaBancoConta{

	@Override
    public Conta criarConta() {
        return new ContaCorrente(); 
    }
}
