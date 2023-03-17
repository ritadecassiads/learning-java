package aulaSeis;

public class Circulo {
    double raio, area, perimetro;
    
    //metodo construtor = obrigatoriamente será o primeiro metodo inicializado da classe
    public Circulo(double raio) {
    	System.out.println("Construtor Circulo completo!\n");
    	this.raio = raio;
    	calculaArea();
    	calculaPerimetro(); 
    	imprimeInfos();
    }
    
    public Circulo() {
    	System.out.println("Construtor Circulo vazio\n");
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
