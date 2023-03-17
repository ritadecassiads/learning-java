package lacosDeRepeticao;

import java.util.Scanner;

/* Ler um número inteiro do teclado e imprimir o caractere # no número de linhas e no número de
colunas conforme o número lido. Após cada # é preciso imprimir um espaço.
Exemplo de entrada: 6
Exemplo de saída:
# # # # # #
# # # # # #
# # # # # #
# # # # # #
# # # # # #
# # # # # # 
*/
public class Exercicio10 {
	public static void main(String[] args) {
		int n;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um número inteiro: ");
		n = ler.nextInt();

		for (int c = 0; c < n; c++) {
			for (int l = 0; l < n; l++) {
				System.out.println("# ");
			}
		}

	}
}
