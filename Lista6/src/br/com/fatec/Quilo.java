package br.com.fatec;

import java.util.List;

public class Quilo implements Calculador{
	
	public double CalculaPreco(List<Animais> animais) {
		double pesoFinal = 0.00;
		for(Animais a: animais) {
			pesoFinal += (6.70*a.getPesoB());
		}
		return pesoFinal;
	}
	public double CalculaPrecoS(List<Animais> animais) {
		double pesoFinal = 0.00;
		for(Animais a: animais) {
			pesoFinal += (5.70*a.getPesoS());
		}
		return pesoFinal;
	}
}
