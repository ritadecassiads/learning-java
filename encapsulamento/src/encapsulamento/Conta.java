package encapsulamento;
/* -> encapsulamento:
 * 	- proteger uma alteracao perigosa no codigo 
 * 	- restringir alteracao aos atrbiutos so dentro da classe
 * 	- ocultar a logica pra outras classes
 * 
 * -> public, private e protected
 * */

/* Criar uma classe Conta com 
 * - saldo
 * - limite
 * - senha
 * - numConta
 * 
 * A classe aplicação Aplicacao deve poder:
 * 	- sacar -> deve validar a senha
 * 	- depositar 
 * 	- alterar senha -> deve validar senha
 * 	- ver saldo -> deve validar a senha
 * */
public class Conta {
	private double saldo, limite;
	private String senha;
	private int numConta;
	
	public Conta(double saldo, double limite, String senha, int numConta) {
		this.saldo = saldo;
		this.limite = limite;
		this.senha = senha;
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;	
	}

	public double getLimite() {
		return limite;
	}
	
	public void sacar(double valor, String senha) {
		if(validaSenha(senha) == false) {
			return;
		} else {
			if((this.saldo + this.limite)< saldo) {
				System.out.println("Saldo insuficiente!");
			} else {
				this.saldo -= valor;
				System.out.println("Saque realizado com sucesso!");	
			}		
		}
	}
	
	public void depositar(double valor, String senha){
		if(validaSenha(senha)) {
			this.saldo += valor;
		}	
	}
	
	public void alteraSenha(String senha, String novaSenha) {
		if(validaSenha(senha)) {
			this.senha = novaSenha;
			System.out.println("\nSenha atualizada com sucesso!");
		} else {
		}
	}
	
	public void verSaldo(String senha){
		if(validaSenha(senha) == false) {
			return;
		} else {
			System.out.println("Saldo atual: " + saldo);
		}
	}
	
	private boolean validaSenha(String senha){
		if(this.senha.equals(senha)) {
			System.out.println("Senha validade");
			return true;
		} else {
			System.out.println("Senha inválida");
			return false;
		}
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", limite=" + limite + ", senha=" + senha + ", numConta=" + numConta + "]";
	}	
}
