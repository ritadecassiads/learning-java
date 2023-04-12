package exBanco;

import java.util.Scanner;

public class Aplicacao {
	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		Conta contaDaRita = criaConta();
		contaDaRita.depositar(100);
		contaDaRita.sacar(20.0);
		contaDaRita.verificarSaldo();
		contaDaRita.imprimeInfos();
		
		System.out.println("Digite o numero de contas a serem criadas: ");
		
		Conta vetConta[] = criaVetorContas(ler.nextInt());
		imprimeVetorContas(vetConta);
	}
	
	public static Conta criaConta() {
		System.out.println("Digite o numero da conta e senha: ");
		Conta novaConta = new Conta(ler.nextInt(), ler.next());
		return novaConta;
	}
	
	public static Conta[] criaVetorContas(int n){
		Conta vetConta[] = new Conta[n];
		for(int i = 0; i < n; i++) {
			vetConta[i] = criaConta();
		}
		return vetConta;
	}
	
	public static void imprimeVetorContas(Conta vet[]) {
		for(int i = 0; i < vet.length; i++) {
			vet[i].imprimeInfos();
		}
	}
}
