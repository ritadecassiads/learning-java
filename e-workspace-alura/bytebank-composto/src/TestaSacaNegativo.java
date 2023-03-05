
public class TestaSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(101));
		
		// maneira de pagar o saldo = so pelo metodo pq ele está como private
		System.out.println(conta.getSaldo());
	}
	
	
}
