/* objeto/instância do tipo conta

Um objeto é uma instância de uma classe onde podemos definir valores para seus atributos.

Para criar uma instância precisamos usar a palavra chave new
*
*/
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); // nova instância da classe conta + precisa do tipo tb
		// referencia da Conta guardado no primeiraConta
		primeiraConta.saldo = 200; // referencia para o objeto saldo		
		primeiraConta.saldo += 100;
		
//		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		// usar sempre a referencia ao objeto(Conta) + o atributo
		System.out.println("Primeira conta: R$ " + primeiraConta.saldo);		
		System.out.println("Segunda conta: R$ " + segundaConta.saldo);
		
		if(primeiraConta != segundaConta) { 
			System.out.println("Contas diferentes!"); // duas instancias/referencias foram criadas = primeiraConta tem um endereço de memoria e segundaConta outro
		}
	}
}
