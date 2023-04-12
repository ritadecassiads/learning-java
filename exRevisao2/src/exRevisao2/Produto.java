package exRevisao2;

public class Produto {
	String nome;
	double preco;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public double aplicaDesconto(double porcentagem) {
		this.preco -= porcentagem;
		System.out.println("Preco com desconto: " + preco);
		return preco;
	}
	
	public void imprimeInfos(){
		System.out.println("Nome: " + nome + "\nPreco: " + preco);
	}
}
