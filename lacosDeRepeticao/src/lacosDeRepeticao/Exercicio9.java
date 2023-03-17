package lacosDeRepeticao;

import java.util.Scanner;

/* Ler um número inteiro e imprimir o caractere # no início de cada linha, sendo a quantidade de
linhas igual ao número lido.
Exemplo de entrada: 5
Exemplo de saída:
#
#
#
#
#
 */
public class Exercicio9 {
	public static void main(String[] args) {
		int n;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um número inteiro positivo: ");
		n = ler.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("#");
		}
	}
}
