package listaUm;

import java.util.Scanner;

// Crie um programa que leia um número inteiro e verifique se ele é par ou ímpar
public class Exercicio1 {
	
	public static void main(String[] args) {
		int numero;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		numero = ler.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Número par");
		} else {
			System.out.println("Número ímpar");
		}
	}
}
