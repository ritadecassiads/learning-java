
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1234, 45678);
		// conta.numero = 1337; = não compila pois o atributo numero nao é visivel por essa classe pq é privado
		conta.setNumero(1337); 
		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		// conta.titular = paulo; não compila pois titular agr é privado
		paulo.setNome("Paulo Silveira");
		conta.setTitular(paulo); // estou setando paulo como titular da conta através do método
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		// entro na conta -> pego o titular -> e seto a profissão(método que pertence a classe Cliente)
		
		// outra forma de setar profissão
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		// resultará no mesmo endereço de memória
		System.out.println(titularDaConta); 
		System.out.println(paulo);
		System.out.println(conta.getTitular()); 
		// fazem referência ao mesmo objeto do Cliente
		
		conta.getTitular().setCpf("000.111.222-12");
		System.out.println(conta.getTitular().getCpf());
	}
}
