package listaUm;

import java.util.Scanner;

// Faça um programa que leia três números e mostre o maior e o menor deles
public class Exercicio8 {
	public static void main(String[] args) {
		int n1, n2, n3, maior = 0, menor = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor de n1: ");
		n1 = ler.nextInt();
		
		System.out.println("Digite o valor de n2: ");
		n2 = ler.nextInt();
		
		System.out.println("Digite o valor de n3: ");
		n3 = ler.nextInt();
		
		if(n1 > n2) {
			if(n1 > n3) {
				System.out.println("O MAIOR numero digitado foi n1 = " + n1);
			}			
		} else {
			if(n1 < n3) {
				System.out.println("O MENOR numero digitado foi n1 = " + n1);
			}
			
		}
		if(n2 > n1) {
			if(n2 > n3) {
				System.out.println("O MAIOR numero digitado foi n2 = " + n2);
			}			
		} else {
			if(n2 < n3) {
				System.out.println("O MENOR numero digitado foi n2 = " + n2);
			}
		}
		if(n3 > n1) {
			if(n3 > n2) {
				System.out.println("O MAIOR numero digitado foi n3 = " + n3);
			}			
		} else {
			if(n3 < n2) {
				System.out.println("O MENOR numero digitado foi n3 = " + n3);
			}
			
		}
		
	}
}
