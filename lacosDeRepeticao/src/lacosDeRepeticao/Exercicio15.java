package lacosDeRepeticao;

import java.util.Scanner;

/* Desenvolver um programa que lê do teclado um número inteiro. Em seguida o programa deve
ler um comando do usuário, "soma", "subtrai", "multiplica", "divide" ou "sair". Caso a opção
digitada seja "sair", o programa deve encerrar. Caso a opção seja uma das outras, deve ler um outro
número em seguida e realizar a operação digitada e imprimir na tela o resultado, lendo novamente
as opções e assim sucessivamente.
(Dica: para comparar Strings, utiliza-se o método .equals e não o operador ==.
Exemplo de comparação da variável nome com a String "texto" : nome.equals("texto")
Exemplo de entrada:
5
soma
4
Resultado: 9
subtrai
3
Resultado: 6
sair
programa encerrado
Exemplo de entrada:
6
divide
4
Resultado: 1,5
multiplica
2
Resultado: 3
subtrai
3
Resultado: 0
sair
programa encerrado
Exemplo de entrada:
3
sair
Exemplo de saída:
programa encerrado
*/
public class Exercicio15 {
	public static void main(String[] args) {
		int n, m;
		double res = 0;
		String operacao;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite um número: ");
		n = ler.nextInt();
		
		ler.nextLine();
		
		System.out.println("Digite:\n + somar\n - subtrair\n * multiplicar\n / dividir\n\nOu digite 0 para sair");
		operacao = ler.nextLine();

		while (!operacao.equals("0")) {
			System.out.println("Digite outro número: ");
			m = ler.nextInt();

			switch (operacao) {
			case "+":
				res = n + m;
				break;
			case "-":
				res = n - m;
				break;
			case "*":
				res = n * m;
				break;
			case "/":
				res = n / m;
				break;
			case "0":
				System.out.println("Saiu!!");
				return;				
			default:
				System.out.println("Opção inválida!");
			}	
			System.out.println(n + operacao + m + "=" + res);
		}
		
		
	}
}
