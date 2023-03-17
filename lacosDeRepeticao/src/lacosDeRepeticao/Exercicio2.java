package lacosDeRepeticao;

import java.util.Scanner;

// Desenvolver um programa para ler um número inteiro e imprimir na tela sua tabuada do 1 ao 10
public class Exercicio2 {
	public static void main(String[] args) {
		int n, i, total;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número pra ver sua tabuada: ");
		n = ler.nextInt();
		
		for(i = 0; i <= 10; i++) {
			total = i * n;
			System.out.println(i + " x " + n + " = " + total);
		}
	}
}
