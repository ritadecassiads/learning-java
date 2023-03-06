package listaUm;

import java.util.Scanner;

/* Escreva um programa que leia um número inteiro e verifique se ele é múltiplo de 3 e de 5 ao
mesmo tempo. (Utilizar operadores lógicos) */
public class Exercicio10 {
	public static void main(String[] args) {
		int numero;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero = ler.nextInt();
		
		if(numero %3 == 0 && numero %5 == 0) {
			System.out.println("Número mútiplo de 3 e de 5!!");
		} else {
			System.out.println("Número digitado NÃO é múltiplo de 3 e 5");
		}
	}
}
