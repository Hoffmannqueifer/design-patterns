package com.example.design.patterns.Conta;

public class ContaExemploPrototype implements ContaPrototype{

	private String tipo;
    private double saldo;
    
    public ContaExemploPrototype() {
    }
    
    
    private ContaExemploPrototype(ContaPrototype prototype) {
        if (prototype instanceof ContaExemploPrototype) {
        	ContaExemploPrototype conta = (ContaExemploPrototype) prototype;
            this.tipo = conta.tipo;
            this.saldo = conta.saldo;
            
        }
    }
    
    public static ContaExemploPrototype createConta(String tipo, double saldo) {
    	ContaExemploPrototype conta = new ContaExemploPrototype();
        conta.setTipo(tipo);
        conta.setSaldo(saldo);
        return conta;
    }
    
    
    public String getTipo() {
        return tipo;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    
    @Override
    public ContaPrototype clone() {
        return new ContaExemploPrototype(this);
    }
    
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
