package aulaCinco;

public class Triangulo {
	double lado1, lado2, lado3, area, perimetro;
	String cor;
	
	public Triangulo() {
		System.out.println("Construtor Triangulo vazio\n");
	}
	
	public Triangulo(double lado1, double lado2, double lado3) {
		System.out.println("Construtor Triangulo completo!\n");
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		calculaArea();
		calculaPerimetro();
		imprimeInfos();
	}
	
	public Triangulo(double lado1, double lado2, double lado3, String cor) {
		System.out.println("\nConstrutor Triangulo completo com cor " + cor.toLowerCase() + "!");
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.cor = cor;
		calculaArea();
		calculaPerimetro();
		imprimeInfos();
	}
	
	public void calculaPerimetro() {
		perimetro = lado1 + lado2 + lado3;	
	}
	
	public void calculaArea() {
		calculaPerimetro();
		double semiPerimetro = perimetro /2;
		
		// tira a raiz do que está dentro do parentese
		area = Math.sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));
	}
	
    public void imprimeInfos() {
    	// acessando o atributo que estará com o resultado do calculaArea()
    	System.out.printf("Area do triangulo: %.2f\n", area);
    	System.out.printf("Perimetro do triangulo: %.2f\n\n", perimetro);
    }
}
