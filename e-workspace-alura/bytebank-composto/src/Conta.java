// defini um primeiro tipo(classe) e suas caracteristicas(atributos) 
// Uma classe é uma especificação de um tipo, definindo atributos e comportamentos.
public class Conta {
	// atributo private = nenhuma outra classe pode ler, modificar ou acessar o atributo saldo, a não pelos métodos dessa classe
	// encapsulamento = declaração de um atributo privado
	// quem é dono dos dados da conta é a propria Conta
	private double saldo;
	int agencia;
	int numero;
	Cliente titular; // tipo Cliente
	// referencia do titular ao tipo Cliente
	// associação = atribuir referencia pro titular
	
	public void deposita(double valor) {
		this.saldo += valor; // referencia pra esse(o que chamou o metodo) objeto
		// this = faz refencia ao objeto instanciado que chama esse método
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			
			return true;
		}
		
		return false;
	}
	// maneira de transferir dinheiro pra outra conta, existe um sujeito(this)
	
	// getters = maneira de acessar o saldo já que ele é private
	public double getSaldo() {
		return this.saldo;
	}
	
}