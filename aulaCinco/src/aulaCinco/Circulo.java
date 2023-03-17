package aulaCinco;

public class Circulo {
	double raio, area, perimetro;
	
	public Circulo(double raio) {
		this.area = Math.PI * raio * raio;
		this.perimetro = Math.PI * 2 * raio;
	}
	
	public void calculaArea() {
		this.area = Math.PI * raio * raio;
	}
	
	public void calculaPerimetro() {
		this.perimetro = Math.PI * 2 * raio;
	}
	
    public void imprimeInfos(Circulo this){
        System.out.printf("Perímetro: %.2f\n", this.perimetro);
        System.out.printf("Area: %.2f\n", this.area);
     }
}
