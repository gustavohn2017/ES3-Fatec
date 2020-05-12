package br.com.fatec;

public class Sistema {
	public void valorDeCobranca(Produto p, CalculadorPreco calcPreco) {
		System.out.println("Produto: " + p.getNome() + "\nDescricao do produto: " + p.getDescricao() + "\nValor: R$ " + 
	calcPreco.calcularDescontos());
	}
}