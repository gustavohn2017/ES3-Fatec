package br.com.fatec;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int option;
		java.util.Scanner reader = new Scanner(System.in);

		Produto p1 = new Produto("Monitor Full HD 24' ", 1000);
		
		System.out.println(" Modo de desconto:\n 1 - Porcentagem\n 2 - Valor bruto ");
		option = reader.nextInt();
		
		// calcula o valor do desconto em porcentagem
		
		if(option == 1) {
			Porcentagem valorDesconto = new Porcentagem(15);
		
			if(valorDesconto.getDesconto() <= 100) {
			System.out.println("Produto: " + p1.getNome() + "\n" + "Preco: R$" + p1.getValProd() + "\nDesconto: "
					+ valorDesconto.getDesconto() + "%\n" + "Total: R$"
					+ valorDesconto.precoFinal(p1.getValProd(), valorDesconto.getDesconto()));
			}
			
			// valor do desconto > valor do produto: 
			
			else
				System.out.println("Valor de desconto maior que o valor do produto.");
		}
		
		//calcula o desconto do produto em valor bruto
			
		
		else if(option == 2) {
			Bruto bruto = new Bruto(150);
			
			if(bruto.getvalBruto() <= p1.getValProd()) {
				System.out.println("Produto: " + p1.getNome()+ "\nPreco: R$" + p1.getValProd() +
						"\nDesconto: R$" + bruto.getvalBruto()+"\nTotal: R$"
						+ bruto.precoFinal(p1.getValProd(), bruto.getvalBruto()));
			}
			
			// valor do desconto > valor do produto: 
			
			else
				System.out.println("Valor de desconto maior que o valor do produto.");
		}
		reader.close();
		System.exit(0);
	}
}
