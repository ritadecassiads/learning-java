package listaUm;

import java.util.Scanner;

// Faça um programa que leia dois números inteiros e mostre qual deles é o maior
public class Exercicio4 {
	public static void main(String[] args) {
		int n1, n2, aux;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		n1 = ler.nextInt();
		
		aux = n1;
		
		System.out.println("Digite outro número: ");
		n2 = ler.nextInt();
		
		if(n1 > n2) {
			System.out.println(n1 + " é o maior");
		} else if(n2 > n1) {
			System.out.println(n2 + " é o maior");
		}
		
	}
}
