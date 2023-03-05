
public class TestaCondicional {
	public static void main(String[] args) {
		int idade = 16;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Mais de 18 anos!");
			System.out.println("seja bem vindo!");
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("você pode entrar acompanhado");
			} else {
				System.out.println("Você não pode entrar");
			
			}
		}
	}
}
