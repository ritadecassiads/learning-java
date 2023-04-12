package exRevisao2;

public class Pessoa {
	String nome, profissao;
	int idade;
	
	public Pessoa(String nome, String profissao, int idade) {
		this.nome = nome;
		this.profissao = profissao;
		this.idade = idade;
	}
	
	public void apresentar() {
		System.out.println("Ola, meu nome é " + nome + ", tenho "+ idade + " anos e atuo como " + profissao);
	}
}
