package br.com.fatec;

import java.util.List;

/*
 * para se ter o valor médio da arroba do boi vivo deve-se pegar o peso bruto do animal e dividir por 30.
 *  No caso da carcaça (50% do peso bruto do animal), deve ser dividido por 15. Ambos os cálculos devem dar o mesmo resultado.
 *  
 *  https://olivre.com.br/arroba-do-boi-como-e-calculada#:~:text=Ou%20seja%2C%20para%20se%20ter,devem%20dar%20o%20mesmo%20resultado.
 */

public class Arroba implements Calculador{
	
	@Override
	public double CalculaPreco(List<Animais> animais) {
		double pesoFinal = 0.00;
		for(Animais a: animais) {
			pesoFinal += (((a.getPesoB()*a.getPesoB()/2)/15)*6.70);
		}
		return pesoFinal;
	}
	
	public double CalculaPrecoS(List<Animais> animais) {
		double pesoFinal = 0.00;
		for(Animais a: animais) {
			pesoFinal += (((a.getPesoS()*a.getPesoS()/2)/15)*5.20);
		}
		return pesoFinal;
	}
	
	
}
