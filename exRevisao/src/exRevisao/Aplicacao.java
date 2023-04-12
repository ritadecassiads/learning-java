package exRevisao;

import java.util.Scanner;

public class Aplicacao {
	// o leitor será global
	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		int qtd = leQuantidade();
		
		Aluno vetAlunos[] = criaVetorAlunos(qtd);
		imprimeVetorAlunos(vetAlunos);
	}
	
	// static = metodo de classe
	public static Aluno criaAluno() {
		System.out.println("Digite o nome, turma e idade do aluno: ");
		Aluno a = new Aluno(ler.next(), ler.next(), ler.nextInt());
		return a;
	}
	
	public static int leQuantidade() {
		System.out.println("Quantos alunos quer criar? ");
		int qtd = ler.nextInt();
		
		return qtd;
	}
	
	public static Aluno[] criaVetorAlunos(int qtd) {
		Aluno vet[] = new Aluno[qtd];
		for(int i = 0; i < qtd; i++) {
			vet[i] = criaAluno();
		}
		return vet;
	}
	
	public static void imprimeVetorAlunos(Aluno vet[]) {
		for(int i = 0; i < vet.length; i++) {
			vet[i].imprimeInfos();
		}
	}
}