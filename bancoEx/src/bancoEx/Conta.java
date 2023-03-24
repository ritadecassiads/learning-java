package bancoEx;

import java.util.Scanner;

// classe = molde do objeto
public class Conta {
	int numeroConta;
	String senha;
	double saldo;
	Scanner ler = new Scanner(System.in);

	// inicializa os atributos da classe | primeiro metodo que é inicializado no
	// momento da instanciação(criação) do objeto

	public Conta(int numeroConta, String senha) {
		this.saldo = 0.0;
		this.numeroConta = numeroConta;
		this.senha = senha;

		System.out.println("Conta criada!\n");
	}

	public Conta(int numeroConta, String senha, double saldo) {
		this.saldo = saldo;
		this.numeroConta = numeroConta;
		this.senha = senha;
	}

	public double sacar(double saldo) {
		if (validaSenha()) {
			if (this.saldo < saldo) {
				System.out.println("Não foi possivel realizar o saque, saldo insuficiente!");
			} else {
				this.saldo -= saldo;
				System.out.printf("Saque de %.2f realizado com sucesso!", saldo, "\n");
				return saldo;
			}
		}
		return saldo;
	}

	public double depositar(double saldo) {
		this.saldo += saldo;
		System.out.printf("Valor depositado: %.2f R$", saldo);
		return this.saldo;
	}

	public void verificarSaldo() {
		if (validaSenha()) {
			System.out.printf("Seu saldo eh de %.2f R$", this.saldo);
		} else {
			System.out.println("Nao foi possivel consultar o saldo!");
		}

	}

	public boolean validaSenha() {
		String senhaAux = null, sair = null;

		// revisar 
		while (!senha.equals(senhaAux)) {
			do {
				System.out.println("\n\nDigite sua senha: ");
				senhaAux = ler.nextLine();
				if (senha.equals(senhaAux)) {
					System.out.println("Senha validada com sucesso!\n");
					sair = "nao";
				} else {
					System.out.println("Senha incorreta. Tente novamente para prosseguir com a operacao!");
					System.out.println("Ou digite 'sair' para cancelar ");
					sair = ler.next();
				}
			} while(sair == null);
		}
		return true;
	}

	public void imprimeInfos() {
		System.out.println("\n\nNumero da conta: " + numeroConta);
		System.out.println("Senha: " + senha);
		System.out.println("Saldo: " + saldo);
	}
}
