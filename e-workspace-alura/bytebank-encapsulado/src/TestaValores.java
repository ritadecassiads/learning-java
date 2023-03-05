
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		// conta sendo instanciada com parametros que defini no Construtor da classe Conta
		
		// objeto pode nascer em um estado inconsistente 
		// conta está inconsiste em relação a regra de negocio
		//conta.setAgencia(50);
		Conta conta2 = new Conta(1337, 24226);

		Conta conta3 = new Conta(1337, 35467);
		
		System.out.println(Conta.getTotal());
		// ao chamar a classe Conta o método precisa ser static lá dentro
	}
}
