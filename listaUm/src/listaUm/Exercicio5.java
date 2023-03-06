package listaUm;

import java.util.Scanner;

/* Escreva um programa que pergunte a temperatura em Celsius e a converta para Fahrenheit e
para Kelvin, imprimindo na tela os resultados. */
public class Exercicio5 {
	public static void main(String[] args) {
		double c, f, k;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		c = ler.nextDouble();
		
		f = (c * 1.8) + 32;
		System.out.println("Conversão da temperatura em Fahrenheit = " + f);
		
		k = c + 273;
		System.out.println("Conversão da temperatura em Kelvin = " + k);
	}
}
