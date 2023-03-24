package exRevisao;

import java.util.Scanner;

public class Aplicacao {
	// o leitor será global
	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		int qtdAlunos = leQuantidade();
		
		Aluno vetAlunos[] = criaVetorAlunos(qtdAlunos);
		imprimeVetorAlunos(vetAlunos);
		
	}
	
	// static = metodo de classe
	public static Aluno criaAluno() {
		String nome, turma;
		int idade;
		
		System.out.println("Digite as informações do aluno: ");
		nome = ler.next();
		turma = ler.next();
		idade = ler.nextInt();
		
		Aluno a = new Aluno(nome, turma, idade);
		
		return a;
	}
	
	public static int leQuantidade() {		
		System.out.println("Quantos alunos serao criados? ");
		int qtde = ler.nextInt();
		
		return qtde;
	}
	
	public static Aluno[] criaVetorAlunos(int n) {
		Aluno vet[] = new Aluno[n];
		
		for(int i = 0; i < n; i++) {
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
