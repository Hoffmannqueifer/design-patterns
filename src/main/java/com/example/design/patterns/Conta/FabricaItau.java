package com.example.design.patterns.Conta;

public class FabricaItau implements FabricaBancoConta{

	@Override
    public Conta criarConta() {
        return new ContaPoupanca(); 
    }
}
