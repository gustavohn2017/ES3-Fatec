package br.com.fatec;


public class ContaEstacionamento {
	private CalculoValor calculo;
	public Veiculo veiculo;
	double preco;
	
	
	public void valorConta(long periodo) {		
		periodo *= 3600000;
		
		// calcula o valor da conta baseado  no período do passeio
		
		if (veiculo instanceof Passeio) {
			if(periodo > (15*24*3600000)) {
				calculo = new ValorMensal();
				veiculo.taxa *= 100;
				preco = calculo.valorConta(periodo, veiculo);
			}
			
			else if(periodo > (12*3600000)) {
				calculo = new ValorDiaria();
				if (veiculo.qtdPessoas > 15)
					veiculo.taxa *= 25;
				else
					veiculo.taxa *= 20;
				preco = calculo.valorConta(periodo, veiculo);
			}
			
			else if (periodo <= (12*3600000)) {
				calculo = new ValorHora();
				veiculo.taxa *= 2;
				preco = calculo.valorConta(periodo, veiculo);
			} 
		}
		
		// calcula o valor da conta baseado na carga
		else {
			if(periodo > (15*24*3600000)) {
				calculo = new ValorMensal();
				veiculo.taxa *= 200;
				preco = calculo.valorConta(periodo, veiculo);
			}
					
			else if(periodo > (12*3600000)) {
				calculo = new ValorDiaria();
				veiculo.taxa *= 35;
				preco = calculo.valorConta(periodo, veiculo);
			}
				
			else if (periodo <= (12*3600000)) {
				
				calculo = new ValorHora();
				veiculo.taxa *= 4;
				preco = calculo.valorConta(periodo, veiculo);
			}
			
		}
		
		System.out.println("Preço: R$ "+preco);		
	}
	
	public void setCalculo(CalculoValor calculo) {
		this.calculo = calculo;
	}
	
}
