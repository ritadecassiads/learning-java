// metodos = tudo que a classe faz/comportamentos
public class TestaMetodos {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		
		conta.deposita(50); // chama o metodo deposita que está definido dentro da Classe Conta
		// o this dentro do metodo quer dizer que a referencia será feita a essa instancia aqui / qualquer instancia que chamar o metodo
		System.out.println(conta.saldo);
		
		boolean sacou = conta.saca(25);
		
		if(sacou == true) {
			System.out.println("Conseguiu sacar! Saldo = " + conta.saldo);
						
		} else {
			System.out.println("Não conseguiu sacar! Saldo = " + conta.saldo);
		}
		
		Conta contaRita = new Conta();
		contaRita.deposita(1000);
		
		contaRita.transfere(300, conta);
		// sempre tera uma referência pra um objeto ao chamar um método
		
		System.out.println(contaRita.saldo);
		System.out.println(conta.saldo);
	}
}
