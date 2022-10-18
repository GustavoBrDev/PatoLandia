package com.ifsc.tds;

public class PatoVermelho extends Pato implements Voador, Falador {

	@Override
	public void Quack() {
		System.out.println("Quack ! Quack ! Quack !");
	}

	@Override
	public void Voar() {
		System.out.println("Estou voando pelos céus ...");
	}
	
	public void nadar () {
		System.out.println("Nadando ...");
	}
	
	public void  display () {
		System.out.println("Oi, eu sou um pato-vermelho");
	}


}
