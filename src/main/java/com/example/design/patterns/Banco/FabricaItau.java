package com.example.design.patterns.Banco;

public class FabricaItau extends FabricaBanco{

	@Override
	public Banco criarBanco() {
        return new Itau();
    }
}
