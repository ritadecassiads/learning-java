package aulaSeis;

import java.util.Scanner;

public class AplicacaoRefatorada {
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	// usuario vai entrar com os valores e eu vou enviar nos construtores 
	// construtor que recebe raio e cor - perguntar se o usuario quer colorir 
		
	System.out.println("Valor do raio para o Circulo: ");
	double raio = ler.nextDouble();
	
	Circulo circulo1 = new Circulo(raio);	
	
	
	System.out.println("Valor lado1 Retangulo: ");
	double lado1 = ler.nextDouble();
	
	System.out.println("Valor lado2 Retangulo: ");
	double lado2 = ler.nextDouble();
	Retangulo retangulo1 = new Retangulo(lado1, lado2);
	
	
	
	
	}
}
