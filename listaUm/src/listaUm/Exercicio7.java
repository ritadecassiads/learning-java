package listaUm;

import java.util.Scanner;
/* Crie um programa que leia a altura e o peso de uma pessoa e calcule o seu IMC (Índice de
Massa Corporal) */
public class Exercicio7 {
	public static void main(String[] args) {
		double alt, peso, imc;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		alt = ler.nextDouble();
		
		System.out.println("Digite seu peso: ");
		peso = ler.nextDouble();
		
		imc = peso / (alt * alt);
		System.out.printf("IMC = %.2f", imc);
	}
}
