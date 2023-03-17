package aulaCinco;

/* Declarar é diferente de instanciar
 * Pessoa pessoa1
 * pessoa1 = new Pessoa() */

public class Aplicacao {

	public static void main(String[] args) {
		Circulo circ1 = new Circulo(raio: 3.2);
		Circulo circ2 = new Circulo(raio: 2.2);
		
		Retangulo ret1 = new Retangulo();
		Retangulo ret2 = new Retangulo();
		
		ret1.lado1 = 10.0;
		ret1.lado2 = 5.0;
		
		ret2.lado1 = 7.0;
		ret2.lado2 = 3.0;
		
		circ1.raio = 3.2;
		circ2.raio = 2.2;
		
		ret1.calculaArea(ret2.lado1, ret2.lado2);
		ret1.calculaPerimetro(ret1.lado1, ret1.lado2);
		
		ret2.calculaArea(ret2.lado1, ret2.lado2);
		ret2.calculaPerimetro(ret1.lado1, ret1.lado2);
		
		circ2.calculaArea();
		circ2.calculaPerimetro();
		
		circ1.calculaArea();
		circ1.calculaPerimetro();
		
		circ1.imprimeInfos();
		ret1.imprimeInfos();
		ret2.imprimeInfos();
	}
}
