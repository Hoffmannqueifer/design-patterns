package com.example.design.patterns.Conta;

public class ContaSingleton {

	private static ContaSingleton instance;
    private String tipo;
    private double saldo;
    
    
    private ContaSingleton() {
    }
    
    
    public static ContaSingleton getInstance() {
        if (instance == null) {
            instance = new ContaSingleton();
        }
        return instance;
    }
    
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
