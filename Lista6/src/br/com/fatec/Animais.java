package br.com.fatec;

public class Animais {
	private double pesoB;
	private double pesoS;
	private int categoria;
	private double QtdMB;
	private double QtdFB;
	private double QtdMS;
	private double QtdFS;
	private int vacS;
	private int vacB;
	
	
	
	// Método para criar um novo objeto
	public static Animais getInstancia() {
		return new Animais();
	}

	
	// Constructor Privado
	private Animais() {
	}
	
	
	
	// Getters and Setters
	public double getPesoB() {
		return pesoB;
	}

	public int setPesoB(double pesoB) {
		this.pesoB = pesoB;
		return categoria;
	}
	public double getPesoS() {
		return pesoS;
	}

	public int setPesoS(double pesoS) {
		this.pesoS = pesoS;
		return categoria;
	}

	public int getCategoria() {
		return categoria;
	}

	public int setCategoria(int cat) {
		return this.categoria = cat;
	}
	
	
	public double getQtdMB() {
		return QtdMB;
	}
	
	public double setQtdMB(double peso) {
		return this.QtdMB = peso;
	}
	
	public double getQtdFB() {
		return QtdFB;
	}
	public double setQtdFB(double peso) {
		return this.QtdFB = peso;
	}


	public double getQtdMS() {
		return this.QtdMS;
	}
	
	public double setQtdMS(double peso) {
		return this.QtdMS =  peso;
	}
	
	public double getQtdFS() {
		return  QtdFS;
	}
	public double setQtdFS(double peso) {
		return this.QtdFS = peso;
	}


	public int getVacS() {
		return vacS;
	}


	public void setVacS(int vacS) {
		this.vacS = vacS;
	}


	public int getVacB() {
		return vacB;
	}


	public void setVacB(int vacB) {
		this.vacB = vacB;
	}









	
	
	
}
