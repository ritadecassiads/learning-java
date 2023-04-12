package exRevisao2;

import java.util.Scanner;

public class Aplicacao {
	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		// ex 1
		//Pessoa p1 = criaPessoa();
		//Pessoa p2 = criaPessoa();
		//Pessoa p3 = criaPessoa();
		
		// ex 2
//		Produto p1 = criaProduto();
//		Produto p2 = criaProduto();
//		Produto p3 = criaProduto();
		
//		p1.imprimeInfos();
//		
//		System.out.println("Digite o valor do desconto: ");
//		p1.aplicaDesconto(ler.nextDouble());
		
		// ex 3
		Fatura f1 = new Fatura("123", "algum produto", 5, 10.0);
		
		double totalFatura = f1.calculaTotalFatura();
		System.out.println("Total da fatura: " + totalFatura);	
	}
	
	// ex 1
//	public static Pessoa criaPessoa() {
//		System.out.println("Digite seu nome, sua profissao e sua idade: ");
//		Pessoa p = new Pessoa(ler.next(), ler.next(), ler.nextInt());
//		
//		return p;
//	}
	
//	ex 2
//	public static Produto criaProduto() {
//		System.out.println("Digite o nome e o preco do produto: ");
//		Produto p = new Produto(ler.next(), ler.nextDouble());
//		return p;
//	}
}
