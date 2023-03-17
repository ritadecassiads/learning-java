package lacosDeRepeticao;

import java.util.Scanner;

/* Construir um programa que leia vários valores positivos do teclado e apresente a média
aritmética entre os números, o maior e o menor número. O final da leitura acontecerá quando for
lido um valor negativo */
public class Exercicio4 {
	public static void main(String[] args) {
		int n, i = 0, soma = 0, maior = 0, menor = 0;
		double media = 0;

		Scanner ler = new Scanner(System.in);

		do {
			System.out.println("Digite um número: ");
			n = ler.nextInt();
			
			if(n < 0) {
				break;
			}
			
			soma = n + soma;
			
			if(i == 0) {
				maior = menor = n;
			} else {
				if(n > maior) {
					maior = n;
				} else if(n < menor){
					menor = n;
				}
			}
			
			i++;		
		} while (n >= 0);
		
		media = (double) soma / i;	// forço a soma pra virar double, divisão de double resulta em double	
			
		System.out.println("\nMaior = " + maior + "\nMenor = " + menor + "Media = %.2f" + media);	
	}
}
