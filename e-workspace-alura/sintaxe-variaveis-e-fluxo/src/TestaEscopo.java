
public class TestaEscopo {
	public static void main(String[] args) {
		int idade = 20;
		int quantidadePessoas = 3;
		boolean acompanhado; // variavel local nao tem valor padrão - precisa ser inicializada pra ter/começar com algum valor
		
		// boolean acompanhado = quantidadePessoas >= 2;
		if(quantidadePessoas >= 2) {
			acompanhado = true; // vale so dentro desse bloco de chaves(escopo), por isso declarar antes
		} else {
			acompanhado = false;
			// o escopo da variavel nasce a partir do momento que abri as chaves e acaba no fechamento das chaves
		}

		System.out.println(acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo!");

		} else {
			System.out.println("Você não pode entrar");

		}

	}
}
