
public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta: "
				+ primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		// primeira e segunda conta fazem referencia pro mesmo objeto / pra mesma conta
		
		segundaConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		// altera no primeiraConta.saldo tb pois a segundaConta está apontando pro mesmo objeto do primeiraConta
		// estão apontando pro mesmo objeto conta / apenas uma instancia foi criada
		
		if(primeiraConta == segundaConta) { // compara a referencia e não o objeto(Conta)
			System.out.println("Contas fazendo referência pro mesmo objeto e com o mesmo endereço de memória!");
		}
		
		System.out.println(primeiraConta);
		
	}
}
