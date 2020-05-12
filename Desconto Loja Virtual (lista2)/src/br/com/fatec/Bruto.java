package br.com.fatec;



//Esta classe tem por finalidade aplicar o desconto sobre o valor bruto
public class Bruto implements Desconto {
	private double valBruto;
	


	public double precoFinal(double valor, double valBruto) {
		return valor - valBruto;
	}
	
	public double getvalBruto() {
		return valBruto;
	}
	
	public Bruto(double valBruto) {
		this.valBruto = valBruto;
	}
}
