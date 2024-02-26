package com.example.design.patterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.design.patterns.Banco.Banco;
import com.example.design.patterns.Banco.FabricaBanco;
import com.example.design.patterns.Banco.FabricaItau;
import com.example.design.patterns.Conta.Conta;
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
	}

}
