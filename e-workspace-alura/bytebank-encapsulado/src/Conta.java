// defini um primeiro tipo(classe) e suas caracteristicas(atributos) 
// Uma classe é uma especificação de um tipo, definindo atributos e comportamentos.
public class Conta {
	// atributo private = nenhuma outra classe pode ler, modificar ou acessar o atributo saldo, a não pelos métodos dessa classe
	// encapsulamento = declaração de um atributo privado
	// quem é dono dos dados da conta é a propria Conta
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular; // tipo Cliente
	// referencia do titular ao tipo Cliente
	// associação = atribuir referencia pro titular
	// ao instanciar um objeto os seus atributos vem por default 0 e null(para atributos do tipo referencia = Cliente titular)
	private static int total; // inicializa como 0 por padrao
	
	// construtor = forma de restringir dados = quem estiver usando esssa classe será obrigado a passar determinadas informações
	// a classe ja vem com esse trecho por padrão, "por de baixo dos panos", sempre passa uma única vez por um construtor ao instanciar um objeto 
	public Conta(int agencia, int numero) {
		Conta.total++; // atributo da classe Conta como um todo, e como uma informação de cada objeto
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Estou criando uma conta!");
		//System.out.println("O Total de contas é: " + total);
	}
	
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
	// não precisou de setSaldo pois os métodos anteriores ja alteram o this.saldo
	
	public int getNumero() {
		return this.numero;
	}
	
	// setters = normalmente são void pois alteram o atributo e não devolvem nada
	public void setNumero(int numero) { // preciso de um parâmetro que será recebido na chamada do método = informação que vai alterar o número
		if(numero <= 0) {
			System.out.println("Erro ao processar. Tente novamente!");
		}
		this.numero = numero;
		// o número desse objeto que invocou esse médoto agr será o "numero" recebido como parametro(variavel temporaria)
	}
	
	public int getAgencia() {
		return this.agencia; // esse atributo
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Valor incorreto, tente novamente!");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	// método estático = não precisa de uma referência pra Conta na hora de chamar
	public static int getTotal() {
		return total;
	}
}