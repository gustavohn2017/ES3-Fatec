package br.com.fatec;
import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		Veiculo v = new Veiculo();
		long periodo;
		Scanner input = new java.util.Scanner(System.in);
		ContaEstacionamento ce = new ContaEstacionamento();
		
		//entrada do tipo do veículo
		
		System.out.println("Tipo do Veículo: \n" + "1 - Veículo de passeio\n" + "2 - Veículo de carga");
		
		v.categoria = input.nextInt();
		
		
		// entrada do tempo de permanência do veículo para cálculo em horas
		
		System.out.println("Quanto tempo o veículo ficará (em horas)?");
		periodo = input.nextLong();
				
		//categoria 1  -- veículos de passeio
		if (v.categoria == 1) {
			int pessoas;
			System.out.println("Quantidade de pessoas: ");
			pessoas = input.nextInt();
			
			v = new Passeio(pessoas);
			v.taxa = v.calcTaxa(pessoas);
			System.out.println("Veículo: " + v.verificaVeiculo(pessoas));
			System.out.println("Taxa Aplicada: " + v.taxa);
		}
		
		// Categoria 2 -- veículos de transporte
		
		else if (v.categoria == 2) {
			int eixos;
			double valorCarga;
			System.out.println("quantidade de eixos: ");
			eixos = input.nextInt();
			
			System.out.println("Valor da carga. R$: ");
			valorCarga = input.nextFloat();
			
			v = new Carga(eixos, valorCarga);
			v.taxa = v.taxaCaminhao(eixos, valorCarga);
			
			System.out.println("Veículo com " +eixos+ " eixos");
			System.out.println("Taxa Aplicada: " + v.taxa);
			
		}
		input.close();		
		ce.veiculo = v;
		ce.valorConta(periodo);
		
	}
}
