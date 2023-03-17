package aulaCinco;

public class Retangulo {
	double lado1, lado2, area, perimetro;
	
	public void calculaArea(double lado1, double lado2) {
		area = lado1 * lado2;
	}
	
	public void calculaPerimetro(double lado1, double lado2) {
		perimetro = 2 *(lado1 + lado2);
	}
	
    public void imprimeInfos(Retangulo this){
        System.out.printf("Perímetro: %.2f\n", this.perimetro);
        System.out.printf("Area: %.2f\n", this.area);
     }
}
