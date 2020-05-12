package br.com.fatec;



public class ValorHora implements CalculoValor{
	private final double hora = 3600000;

	public double valorConta(long tempo, Veiculo veiculo) {
		
		//retorna o valor da taxa arredondando double "para cima"
		
		return veiculo.taxa * Math.ceil(tempo / hora);
	}

}
