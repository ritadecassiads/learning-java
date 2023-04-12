package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class AplicacaoA {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Aluno a1 = new Aluno("Rita", 8, 9, 7);
		Aluno a2 = new Aluno("Lele", 10, 9, 8);
		Aluno a3 = new Aluno("Luis", 7, 9, 9);
		
		                          // tanto faz o Aluno na instanciacao
		ArrayList<Aluno> alunos = new ArrayList<>();
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		
		System.out.println("Digite um numero entre 0 e 10: ");
		int n = ler.nextInt();
		
		for(Aluno aluno : alunos) {
			double media = aluno.calculaMedia();
			if(media >= n) {
				System.out.println("Média = " + media + "\n" + aluno.toString());
			}
		}
	}
}
