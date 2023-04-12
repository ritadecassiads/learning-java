package aulaCinco;

import java.util.Scanner;

public class AplicacaoRefatorada {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		// usuario vai entrar com os valores e eu vou enviar nos construtores
		// construtor que recebe raio e cor - perguntar se o usuario quer colorir
		/*
		 * Adicionar para cada classe o atributo cor do tipo String. Antes de criar cada
		 * objeto, perguntar ao usuário se ele deseja colorir o objeto a ser criado.
		 * Caso deseje, então deve inserir a cor e criar o objeto com a cor. Caso
		 * contrário, o objeto deve ser criado sem cor.
		 */

		System.out.println("Deseja colorir o circulo? \n S para sim e N para nao");
		String decisao = ler.next();

		if (decisao.toLowerCase().equals("s")) {
			System.out.println("Digite o valor do raio para o Circulo e qual cor gostaria: ");
			Circulo circuloComCor = new Circulo(ler.nextDouble(), ler.next());
		} else {
			System.out.println("Digite o valor do raio para o Circulo: ");
			Circulo circulo1 = new Circulo(ler.nextDouble());
		}
	
		decisao = null;
		
		System.out.println("Deseja colorir o retangulo? \n S para sim e N para nao");
		decisao = ler.next();

		if (decisao.toLowerCase().equals("s")) {
			System.out.println("Digite o valor do lado1 e lado2 e qual cor gostaria: "); 

			Retangulo retanguloComCor = new Retangulo(ler.nextDouble(), ler.nextDouble(), ler.next());
		} else {
			System.out.println("Digite o valor do lado1 e lado2: ");
			Retangulo retangulo1 = new Retangulo(ler.nextDouble(), ler.nextDouble());
		}

		decisao = null;
		System.out.println("Valor lado1 Triangulo: ");
		double lado1T = ler.nextDouble();

		System.out.println("Valor lado2 Triangulo: ");
		double lado2T = ler.nextDouble();

		System.out.println("Valor lado1 Triangulo: ");
		double lado3T = ler.nextDouble();
		ler.nextLine();
		System.out.println("Deseja colorir o objeto? \n S para sim e N para nao");
		decisao = ler.nextLine();

		if (decisao.toLowerCase().equals("s")) {
			System.out.println("Qual cor gostaria?");
			String cor = ler.nextLine();

			Triangulo triangulo1 = new Triangulo(lado1T, lado2T, lado3T, cor);
		} else {
			Triangulo triangulo1 = new Triangulo(lado1T, lado2T, lado3T);
		}
	}
}
