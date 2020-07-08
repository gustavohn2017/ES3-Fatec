package br.com.fatec;

import java.util.*;
import java.text.DecimalFormat;

public class Main {
	static double  peso;
	public static void main(String[] args) {
		List<Animais> animais = new ArrayList<Animais>();

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in); 
		int i;
		int somaB = 0;
		int somaS = 0;
		double vacB = 0;
		double vacS = 0;
		int countMB=0;
		int countFB=0;
		int contaboi = 0;
		int contaporco = 0;
		int countMS=0;
		int countFS=0;		
		int cat;
		 
		
		while (true) {
			System.out.println("[1] Cadastro de Animais\n[2] Calcular preço\n[3] Relatório \n[4] Sair");
			i = input.nextInt();
		
				if (i == 1) {
					peso = 0;
					
					Animais animal = Animais.getInstancia();
					System.out.println("Categoria:  [1]Bovino / /  [2]Suino: ");
					cat = input.nextInt();
				
					switch (cat) {
					case 1:
						animal.setCategoria(cat);
					System.out.println("Digite a quantidade de machos bovinos");
					double qtdMB;
					qtdMB = input.nextInt();
					
					// Esse bloco de código armazena os pesos da quantidade de bovinos machos dentro de um vetor
					//countM é a variável auxiliar para fazer a contagem dentro 
					
					animal.setQtdMB(qtdMB);
					for (int v1=0; v1<qtdMB; v1++){
						System.out.println("Peso dos bovinos (machos): ");
						peso = input.nextDouble();
						somaB +=  animal.setQtdMB(peso);
						
						System.out.println("Animal vacinado? [1] - Sim [2] - Não");
						int option = input.nextInt();
						if(option == 1)vacB++;
						
						countMB++;
						contaboi+=v1;
						
						
						animal.setPesoB(somaB); 
					}
					
					//para fêmeas bovinas:
		
					System.out.println("Digite a quantidade de fêmeas bovinas");
						double qtdFB;
						qtdFB = input.nextInt();
						animal.setQtdFB(qtdFB);
					for (int i1=0; i1<qtdFB; i1++){
						System.out.println("Peso dos bovinos (femeas): ");
						peso = input.nextDouble();
						somaB +=  animal.setQtdFB(peso);
						
						System.out.println("Animal vacinado? [1] - Sim [2] - Não");
						int option = input.nextInt();
						if(option == 1)vacB++;
						countFB++;
						contaboi +=i1;
						
						
						animal.setPesoB(somaB); 
					}
					

					animais.add(animal);
					break;					
			
					// Case 2 Para SUÍNOS
					
					case 2:
						
						animal.setCategoria(cat);
						System.out.println("Digite a quantidade de machos suínos");
						double qtdMS;
						qtdMS = input.nextInt();
						// Esse bloco de código armazena os pesos da quantidade de suínos machos dentro de um vetor
						//countM é a variável auxiliar para fazer a contagem dentro 
						animal.setQtdMS(qtdMS);
						for (int v2=0; v2<qtdMS; v2++){
							System.out.println("Peso dos suínos (machos): ");
							peso = input.nextDouble();
							somaS +=  animal.setQtdMS(peso);
							
							System.out.println("Animal vacinado? [1] - Sim [2] - Não");
							int option = input.nextInt();
							if(option == 1)vacS++;
							
							countMS++;
							contaporco+=v2;
						animal.setPesoS(somaS); 
					}
					
					//para fêmeas suínas:
		
					System.out.println("Digite a quantidade de fêmeas suínas");
						double qtdFS;
						qtdFS = input.nextInt();
						animal.setQtdFS(qtdFS);
					for (int i2=0; i2<qtdFS; i2++){
						System.out.println("Peso dos bovinos (femeas): ");
						peso = input.nextDouble();
						somaS +=  animal.setQtdFS(peso);
						
						System.out.println("Animal vacinado? [1] - Sim [2] - Não");
						int option = input.nextInt();
						if(option == 1)vacS++;
						
						countFS++;
						contaboi +=i2;						
						animal.setPesoS(somaS); 
					}					

					animais.add(animal);
					break;
					}
				}
				
					else if (i == 2) {
						if (animais.size() == 0)
							System.out.println("Nenhum animal cadastrado.");

						else {
							System.out.println("Entre com o valor para o relatório desejado: \n");
							System.out.println("[1] - Calcular preço dos Bovinos \n[2] - Relatório de Suínos\n");
							cat = input.nextInt();
						switch(cat) {
						case 1:
							
							System.out.println("1-Kg\n2-Arroba");
							int tipoPeso = input.nextInt();
							if (tipoPeso == 1) {
								Quilo kg = new Quilo();
								System.out.println("R$"+kg.CalculaPreco(animais));
								}
					
						else {
						Arroba a = new Arroba();
						System.out.println("R$"+a.CalculaPreco(animais));
						
							}
					
							break; 
							
						case 2:
							
							System.out.println("1-Kg\n2-Arroba");
							int tipoPesoS = input.nextInt();
							if (tipoPesoS == 1) {
								Quilo kg = new Quilo();
								System.out.println("R$"+kg.CalculaPrecoS(animais));
								}
					
						else {
						Arroba a = new Arroba();
						System.out.println("R$"+a.CalculaPrecoS(animais));
						
							}
					
							break;
						
						
							}
						
						
						

					}
			}

			else if (i == 3) {

				if (animais.size() == 0)
					System.out.println("Nenhum animal cadastrado.");

				else {
					System.out.println("Entre com o valor para o relatório desejado: \n");
					System.out.println("[1] - Relatório de Bovinos\n[2] - Relatório de Suínos\n");
					cat = input.nextInt();
					
					switch(cat) {
					case 1:
						for (Animais a : animais) {
							System.out.println("Relatório para Bovinos:");
							System.out.println("Categoria: " + a.getCategoria());
							System.out.println("Qtd de machos (Bovinos): "+ countMB);
							System.out.println("Qtd de femeas (Bovinas): "+ countFB);
							System.out.println("Quantidade total (Bovinos)"+ contaboi);
							System.out.println("Peso total do Rebanho (Bovino): " + somaB + " Kg\n");
							double mediaB = somaB/contaboi;
							System.out.println("Peso médio do Rebanho (Bovino) : " + mediaB + " Kg\n");
							double arrobaB = somaB/15;
							System.out.println("Peso do Rebanho (Bovino) em Arrobas: " + arrobaB + " @");
							double totalB = contaboi;
							double percentB = (vacB/totalB);
							DecimalFormat forma = new DecimalFormat("#,##0.00%");
							System.out.println("Percentual de bovinos vacinados: "+ forma.format(percentB));
							double restanteB = contaboi-vacB;
							System.out.println("Ainda faltan vacinar " + restanteB + " Bovinos \n");
							}
						
						break;
						
					case 2:
						
						for (Animais a : animais) {
							System.out.println("Relatório para Suínos:");
							System.out.println("Categoria: " + a.getCategoria());
							System.out.println("Qtd de machos (Suínos): "+ countMS);
							System.out.println("Qtd de femeas (Suínos): "+ countFS);
							System.out.println("Quantidade total (Suínos)"+ contaporco);
							System.out.println("Peso total do Rebanho (Suínos): " + somaS + " Kg");
							double mediaS = somaS/contaporco;
							System.out.println("Peso médio do Rebanho (Suínos) : " + mediaS + " Kg");
							double arrobaS = somaS/15;
							System.out.println("Peso do Rebanho (Suínos) em Arroba "+ arrobaS +" @");
							double totalS= contaporco;
							double percentS = (vacS/totalS);
							DecimalFormat forma = new DecimalFormat("#,##0.00%");
							System.out.println("Percentual de Suínos vacinados : "+  forma.format(percentS));
							double restanteS = contaporco-vacS;
							System.out.println("Ainda faltan vacinar " + restanteS + " Suínos \n");
							}
						
						break;
					
					}
					
					
					
			
				}
			
			
			 
				}
				
				}
				}
	
}
	


	

		

