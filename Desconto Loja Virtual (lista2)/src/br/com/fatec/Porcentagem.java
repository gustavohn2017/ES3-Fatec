

package br.com.fatec;

public class Porcentagem implements Desconto {
	private int descPerc;

	public double precoFinal(double valor, double descPerc) {
		return valor - valor * (descPerc / 100);
	}

	public Porcentagem(int descPerc) {
		this.descPerc = descPerc;
	}

	public int getDesconto() {
		return descPerc;
	}

}