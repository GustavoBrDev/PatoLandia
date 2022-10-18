package com.ifsc.tds;

public class TestePato {

	public static void main(String[] args) {
		PatoReal patoReal = new PatoReal();
		PatoVermelho patoVermelho = new PatoVermelho();
		Pato donald = new Pato();
		PatoDeBorracha banho = new PatoDeBorracha();
		PatoDeMadeira decoracao = new PatoDeMadeira();
		
		patoReal.Quack();
		patoReal.nadar();
		patoReal.display();
		patoReal.Voar();
		
		System.out.println("\n");
		
		patoVermelho.Quack();
		patoVermelho.nadar();
		patoVermelho.display();
		patoVermelho.Voar();
		
		System.out.println("\n");
		
		donald.nadar();
		donald.display();
		
		System.out.println("\n");
		
		banho.nadar();
		banho.display();
		
		System.out.println("\n");
		
		decoracao.nadar();
		decoracao.display();
	}

}