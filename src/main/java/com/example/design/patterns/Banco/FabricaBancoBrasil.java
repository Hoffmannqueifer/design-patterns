package com.example.design.patterns.Banco;

public class FabricaBancoBrasil extends FabricaBanco{

	@Override
	public Banco criarBanco() {
        return new BancoBrasil();
    }
}
