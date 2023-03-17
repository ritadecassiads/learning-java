package lacosDeRepeticao;

import java.util.Scanner;

/* Ler um número inteiro e imprimir o caractere # seguido de espaço a quantidade de vezes
informada pelo número lido.
Exemplo de entrada: 8
Exemplo de saída: # # # # # # # #  */
public class Exercicio8 {
	public static void main(String[] args) {
		int n;

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro positivo: ");
		n = ler.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
