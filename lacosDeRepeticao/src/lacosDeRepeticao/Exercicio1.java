package lacosDeRepeticao;

// Desenvolver um programa para imprimir na tela os números ímpares de 1 a 100.
public class Exercicio1 {
	public static void main(String[] args) {
		int i;
		for(i = 0; i <= 100; i++) {
			if(i %2 != 0) {
				System.out.println(i);			
			}
		}
	}
}
