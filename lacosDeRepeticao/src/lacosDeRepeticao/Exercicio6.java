package lacosDeRepeticao;

import java.util.Scanner;

// Desenvolver um programa que lê um número inteiro e imprime na tela se é primo ou não
public class Exercicio6 {
	public static void main(String[] args) {
		int n;

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		n = ler.nextInt();
		
		for(int i = 2; i < n; i++) {
			if(n %i == 0) {
				System.out.println("Número não primo!");
				return; // para o método aqui
				// aqui quer dizer que ele é divisor, se nao entrar no if ele é primo
			}
		}
		
		System.out.println("É primo!");
		
	}

}
