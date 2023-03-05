// defini um primeiro tipo(classe) e suas caracteristicas(atributos) 
// Uma classe é uma especificação de um tipo, definindo atributos e comportamentos.
public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
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
	
}