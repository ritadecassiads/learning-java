package aulaSeis;

public class Retangulo {
    double lado1, lado2, area, perimetro;
    
    public Retangulo() {
    	System.out.println("Construtor Retangulo vazio\n");
    }
    
    public Retangulo(double lado1, double lado2) {
    	System.out.println("Construtor Retangulo completo!\n");
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
