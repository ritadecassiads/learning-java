package lacosDeRepeticao;


/* Desenvolver um programa que apresente todos os valores numéricos inteiros divisíveis por 4
entre 1 e 100 */
public class Exercicio3 {
	public static void main(String[] args) {
		int i;
		for(i = 1; i <= 100; i++) {
			if(i %4 == 0) {
				System.out.println(i);
			}
		}
	}
}
