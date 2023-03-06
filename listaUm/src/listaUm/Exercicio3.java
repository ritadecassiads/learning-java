package listaUm;

import java.util.Scanner;

// Escreva um programa que leia um número inteiro e verifique se ele é positivo, negativo ou zero
public class Exercicio3 {
	public static void main(String[] args) {
		int numero;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = ler.nextInt();
		
		if(numero > 0) {
			System.out.println("Número positivo");
		} else if(numero < 0) {
			System.out.println("Número negativo");
		} else if(numero == 0){
			System.out.println("Número = 0");
		}
		
	}
}
