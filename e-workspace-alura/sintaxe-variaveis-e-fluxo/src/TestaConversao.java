
public class TestaConversao {
	public static void main(String[] args) {
		double salario = 1270.50;
		int valor = (int) salario; // casting = faz a conversão do double a ser int
		
		System.out.println(valor);
		
		long numeroGrande = 2342341234123l; // 64bits de capacidade = guarda numero gigante + adicionar o l pro java entender que é long mesmo, senao ele tenta encaixar num int
		short valorPequeno = 2131; // menor que int
		byte miudinho = 127; // menor que short
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		
		double total = valor1 + valor2;
		System.out.println(total);
		
		float pontoFlutuante = 3.14f; // f no final pra indicar que é float, senao o java entende que é double
		
	}
}
