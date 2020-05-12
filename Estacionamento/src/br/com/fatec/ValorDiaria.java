package br.com.fatec;

public class ValorDiaria implements CalculoValor{
	private final double dia = 86400000;
	
	public double valorConta(long tempo, Veiculo veiculo) {
		return veiculo.taxa * Math.ceil(tempo / dia);
	}
}
