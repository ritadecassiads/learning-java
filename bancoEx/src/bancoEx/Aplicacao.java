package bancoEx;

import java.util.Scanner;

public class Aplicacao {
	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		Conta contaDaRita = criaConta();
		contaDaRita.depositar(100);
		contaDaRita.sacar(20.0);
		//contaDaRita.verificarSaldo();
		contaDaRita.imprimeInfos();
	}
	
	public static Conta criaConta() {
		System.out.println("Digite o numero da conta e senha: ");
		Conta novaConta = new Conta(ler.nextInt(), ler.next());
		return novaConta;
	}
}
