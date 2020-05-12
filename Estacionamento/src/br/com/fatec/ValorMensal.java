package br.com.fatec;

public class ValorMensal implements CalculoValor{
	private final double mes = 2592E6;
	
	public double valorConta(long tempo, Veiculo veiculo) {
		return veiculo.taxa * Math.ceil(tempo/mes);
	}

}
