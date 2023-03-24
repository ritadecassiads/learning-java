package exRevisao;

import java.util.Scanner;

public class Aplicacao {
	// o leitor será global
	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		int qtdAlunos = leQuantidade();
		
		Aluno vetAlunos[] = new Aluno[qtdAlunos];
		
		for(int i = 0; i < qtdAlunos; i++) {
			vetAlunos[i] = criaAluno();
		}
		for(int i = 0; i < qtdAlunos; i++) {
			vetAlunos[i].imprimeInfos();
		}
		
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
}
