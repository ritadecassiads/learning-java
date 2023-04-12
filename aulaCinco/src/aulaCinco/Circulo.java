package aulaCinco;

public class Circulo {
    double raio, area, perimetro;
    String cor;
    
    //metodo construtor = obrigatoriamente será o primeiro metodo inicializado da classe
    public Circulo(double raio) {
    	System.out.println("\nConstrutor Circulo completo!");
    	this.raio = raio; // esse objeto que está sendo invocado
    	calculaArea();
    	calculaPerimetro(); 
    	imprimeInfos();
    }
    
    public Circulo() {
    	System.out.println("Construtor Circulo vazio\n");
    }
    
    public Circulo(double raio, String cor) {
    	System.out.println("\nConstrutor Circulo com cor " + cor.toLowerCase() + "!");
    	this.raio = raio;
    	this.cor = cor;
    	calculaArea();
    	calculaPerimetro(); 
    	imprimeInfos();
    }

    public void calculaArea(){
        area = raio * raio * Math.PI;
    }

    public void calculaPerimetro(){
        perimetro = raio * 2 * Math.PI;
    }
    
    public void imprimeInfos() {
    	System.out.printf("Area do circulo: %.2f\n", area);
    	System.out.printf("Perimetro do circulo: %.2f\n\n", perimetro);
    }
}
