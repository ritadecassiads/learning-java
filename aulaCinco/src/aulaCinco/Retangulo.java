package aulaCinco;

public class Retangulo {
    double lado1, lado2, area, perimetro;
    String cor;
    
    public Retangulo() {
    	System.out.println("Construtor Retangulo vazio\n");
    }
    
    public Retangulo(double lado1, double lado2) {
    	System.out.println("\nConstrutor Retangulo completo!");
    	this.lado1 = lado1;
    	this.lado2 = lado2;
    	calculaArea();
    	calculaPerimetro();
    	imprimeInfos();
    }
    
    public Retangulo(double lado1, double lado2, String cor) {
    	System.out.println("\nConstrutor Retangulo completo com cor " + cor.toLowerCase() + "!");
    	this.lado1 = lado1;
    	this.lado2 = lado2;
    	this.cor = cor;
    	calculaArea();
    	calculaPerimetro();
    	imprimeInfos();
    }    
  
    public void calculaArea(){
        area = lado1 * lado2;
    }

    public void calculaPerimetro(){
        perimetro = 2 * (lado1 + lado2);
    }
    
    public void imprimeInfos() {
    	System.out.printf("Area do retangulo: %.2f\n", area);
    	System.out.printf("Perimetro do retangulo: %.2f\n\n", perimetro);
    }
}
