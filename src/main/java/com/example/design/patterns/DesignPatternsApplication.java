package com.example.design.patterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.design.patterns.Banco.Banco;
import com.example.design.patterns.Banco.FabricaBanco;
import com.example.design.patterns.Banco.FabricaItau;
import com.example.design.patterns.Conta.Conta;
import com.example.design.patterns.Conta.ContaBuilder;
import com.example.design.patterns.Conta.ContaExemploPrototype;
import com.example.design.patterns.Conta.ContaPrototype;
import com.example.design.patterns.Conta.ContaSingleton;
import com.example.design.patterns.Conta.FabricaBancoConta;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
		
		// Factory Method
		
		FabricaBanco fabricaBanco = new FabricaItau();
        
        
        Banco banco = fabricaBanco.criarBanco();
        
       
        System.out.println("Exemplo Factory Method");
        System.out.println("Banco criado: " + banco.getNome());
        
        //Abstract Factory
        
        FabricaBancoConta fabricaBancoBrasil = new com.example.design.patterns.Conta.FabricaBancoBrasil();
       
        Conta contaBancoBrasil = fabricaBancoBrasil.criarConta();
        
        System.out.println("###########################");
        System.out.println("Exemplo Abstract Factory");
        System.out.println("Conta criada no Banco do Brasil: " + contaBancoBrasil.getTipo());
        
        
        ContaBuilder conta = new ContaBuilder.Builder()
                .tipo("Conta Poupança")
                .saldo(1000.0)
                .build();

		System.out.println("###########################");
		System.out.println("Exemplo Builder ");
		System.out.println("Tipo de conta: " + conta.getTipo());
		System.out.println("Saldo da conta: " + conta.getSaldo());
		
		//Prototype
        
        ContaPrototype contaPrototype = new ContaExemploPrototype();
        contaPrototype = ContaExemploPrototype.createConta("Conta Corrente", 2000.0);
        
        ContaPrototype novaConta = contaPrototype.clone();
        
        ContaExemploPrototype novaContaBancaria = (ContaExemploPrototype) novaConta;
        System.out.println("###########################");
        System.out.println("Exemplo Prototype ");
        System.out.println("Tipo de conta: " + novaContaBancaria.getTipo());
        System.out.println("Saldo da conta: " + novaContaBancaria.getSaldo());
        
        
        //Singleton
        
        ContaSingleton contaSingleton = ContaSingleton.getInstance();
        
        
        System.out.println("###########################");
        System.out.println("Exemplo Singleton ");
        contaSingleton.setTipo("Conta Corrente e Conta Poupança");
        contaSingleton.setSaldo(3000.0);
        
        
        System.out.println("Tipo de conta: " + contaSingleton.getTipo());
        System.out.println("Saldo da conta: " + contaSingleton.getSaldo());
        
        
        ContaSingleton mesmaConta = ContaSingleton.getInstance();
        System.out.println("Mesma instância? " + (contaSingleton == mesmaConta)); 
	}

}
