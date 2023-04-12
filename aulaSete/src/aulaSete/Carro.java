package aulaSete;

public class Carro {
	int nPortas;
	String cor, modelo;
	double peso;
	
	public Carro() {
		
	}
	
	public Carro(int nPortas, String cor, String modelo, double peso) {
		this.nPortas = nPortas;
		this.cor = cor;
		this.modelo = modelo;
		this.peso = peso;
	}
	
	public void imprimeInfos() {
		System.out.println("Número de portas: " + nPortas + "\nCor: " + cor + "\nModelo: " + modelo + "\nPeso: " + peso + "\n");
	}
}
