package br.com.fatec;
import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		Veiculo v = new Veiculo();
		long periodo;
		Scanner input = new java.util.Scanner(System.in);
		ContaEstacionamento ce = new ContaEstacionamento();
		
		//entrada do tipo do ve�culo
		
		System.out.println("Tipo do Ve�culo: \n" + "1 - Ve�culo de passeio\n" + "2 - Ve�culo de carga");
		
		v.categoria = input.nextInt();
		
		
		// entrada do tempo de perman�ncia do ve�culo para c�lculo em horas
		
		System.out.println("Quanto tempo o ve�culo ficar� (em horas)?");
		periodo = input.nextLong();
				
		//categoria 1  -- ve�culos de passeio
		if (v.categoria == 1) {
			int pessoas;
			System.out.println("Quantidade de pessoas: ");
			pessoas = input.nextInt();
			
			v = new Passeio(pessoas);
			v.taxa = v.calcTaxa(pessoas);
			System.out.println("Ve�culo: " + v.verificaVeiculo(pessoas));
			System.out.println("Taxa Aplicada: " + v.taxa);
		}
		
		// Categoria 2 -- ve�culos de transporte
		
		else if (v.categoria == 2) {
			int eixos;
			double valorCarga;
			System.out.println("quantidade de eixos: ");
			eixos = input.nextInt();
			
			System.out.println("Valor da carga. R$: ");
			valorCarga = input.nextFloat();
			
			v = new Carga(eixos, valorCarga);
			v.taxa = v.taxaCaminhao(eixos, valorCarga);
			
			System.out.println("Ve�culo com " +eixos+ " eixos");
			System.out.println("Taxa Aplicada: " + v.taxa);
			
		}
		input.close();		
		ce.veiculo = v;
		ce.valorConta(periodo);
		
	}
}
