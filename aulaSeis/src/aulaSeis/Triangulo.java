package aulaSeis;

public class Triangulo {
	double lado1, lado2, lado3, area, perimetro;
	
	public Triangulo() {
		System.out.println("Construtor Triangulo vazio\n");
	}
	
	public Triangulo(double lado1, double lado2, double lado3) {
		System.out.println("Construtor Retangulo completo!\n");
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
