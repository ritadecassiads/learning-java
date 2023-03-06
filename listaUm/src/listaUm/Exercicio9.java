package listaUm;

import java.util.Scanner;

/* Faça um programa que leia o preço de um produto e um desconto, e calcule o preço final com o
desconto aplicado */
public class Exercicio9 {
	public static void main(String[] args) {
		double prod, desc, precoFinal;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		prod = ler.nextDouble();
		
		System.out.println("Digite o valor do desconto");
		desc = ler.nextDouble();
		
		if(prod > desc) {
			precoFinal = prod - desc;
			System.out.println("Preço final: \n" + prod + " - " + desc + " = " + precoFinal);
		} else {
			System.out.println("Inválido! Valor do produto mais alto que desconto aplicado.");
		}
		
	}
}
