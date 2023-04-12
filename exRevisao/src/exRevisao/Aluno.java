package exRevisao;

public class Aluno {
	String nome, turma;
	int idade;
	
	public Aluno(String nome, String turma, int idade){
		this.nome = nome;
		this.turma = turma;
		this.idade = idade;
	}
	
	public void imprimeInfos() {
		System.out.println("Nome: " + nome + "\nTurma: " + turma + "\nIdade: " + idade);
	}
	
}
