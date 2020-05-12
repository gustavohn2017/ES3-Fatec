package br.com.fatec;

public class Veiculo {
	double taxa;
	int qtdPessoas;
	String tipoVeiculo;
	int categoria;
	
	// Separa o tipo do veículo de passeio pela quantidade de lugares
	
	public String verificaVeiculo(int pessoas) {
		if(pessoas <= 2) 
			return "Moto";
		
		else if(pessoas > 2 && pessoas <= 5 ) 
			return "Carro";
		
		else if(pessoas > 5 && pessoas <= 15) 
			return "Van / Microbus";
		
		else 
			return "Onibus";
	}
	
	// Calcula o valor da taxa com base no veículo
	
	public int calcTaxa(int pessoas) {
		int taxa;
		
		if(pessoas <= 5) 
			taxa = 1;
		
		else if(pessoas > 5 && pessoas <= 15) 
			taxa = 3;

		else 
			taxa = 5;
		
		return taxa;
	}
	
	//Calcula o valor da taxa combase no peso da carga 
	
	public double taxaCaminhao(int eixos, double valorCarga) {
		double taxa;
		if (valorCarga == 0) valorCarga = 1;
		
		taxa = (valorCarga*10/100)+(0.7*eixos);
		
		return taxa;
	}
	
}
