package com.example.design.patterns.Conta;

public class ContaBuilder {

	private String tipo;
    private double saldo;
    
    private ContaBuilder(Builder builder) {
        this.tipo = builder.tipo;
        this.saldo = builder.saldo;
        
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public static class Builder {
        private String tipo;
        private double saldo;
        
        
        public Builder tipo(String tipo) {
            this.tipo = tipo;
            return this;
        }
        
        public Builder saldo(double saldo) {
            this.saldo = saldo;
            return this;
        }
        
        
        public ContaBuilder build() {
            return new ContaBuilder(this);
        }
    }
}
