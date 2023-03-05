
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente paulo = new Cliente(); // referencia ao objeto Cliente
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "111.222.333-11";
		paulo.profissao = "Programador";
		
		Conta contaDoPaulo = new Conta(); // criou o objeto e guardou o endereço de memoria na referencia(variavel)
		contaDoPaulo.deposita(100);
		
		// composição dos objetos
		// associa o cliente Paulo a contaDoPaulo
		contaDoPaulo.titular = paulo; // outra forma de se referenciar ao objeto Cliente
		// duas referencias diferentes mas pro mesmo objeto
		System.out.println(contaDoPaulo.titular.nome);
		
		
		
	}
	
	
}
