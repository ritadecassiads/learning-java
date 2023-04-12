package exRevisao2;

public class Fatura {
	String numero, descricao;
	int qtdComprada;
	double preco;
	
	public Fatura(String numero, String descricao, int qtdComprada, double preco) {
		this.numero = numero;
		this.descricao = descricao;
		this.qtdComprada = qtdComprada;
		this.preco = preco;
	}
	
	public double calculaTotalFatura() {		
		double total;
		if(preco < 0) {
			preco = 0.0;
		}
		total = qtdComprada * preco;
		
		return total;
	}
}
