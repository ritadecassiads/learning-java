package aulaSete;

import java.util.Scanner;

public class Aplicacao {
	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Carro c1 = criaCarro();
		//Carro c2 = new Carro(4, "branco", "uno", 400.00);
		//Carro c2 = criaCarro();
		//Carro c3 = criaCarro();
		///Carro c4 = criaCarro();
		
		// c1.imprimeInfos();
		//c2.imprimeInfos();
		
		//criaCarro().imprimeInfos();
		
		// 1. Perguntar ao usuario o número n de objetos a serem criados
		// 2. Declarar o vetor do tipo Carro de n posições
		System.out.println("Quantos carros serão criados?");
		int n = ler.nextInt();
		// Carro vetCarros[] = new Carro[n]; // vetor do tipo carro com n posicoes - espaço criado 
		
		// 3. preencher o vetor
		Carro[] vetCarros = criaVetor(n);
		
		// 4. imprimir informações de todos os objetos
		imprimeVetor(vetCarros);
	}	
	
	public static Carro criaCarro() { // static = metodo de classe, não precisa de um objeto pra instanciar ele
		System.out.println("Digite as informações do carro a ser criado: ");
        int nPortas = ler.nextInt();
        String cor = ler.next();
        String modelo = ler.next();
        double peso = ler.nextDouble();
		
		return new Carro(nPortas, cor, modelo, peso);
	}
	
	public static Carro[] criaVetor(int n) {
		// declaração do vetor do tipo carro
		Carro vet[] = new Carro[n]; // vetor vazio do tamanho n
		
		// preenchimento do vetor com objetos do tipo carro
		for(int i=0; i<n; i++) {
			vet[i] = criaCarro();
		}
		return vet;
	}
	
	public static void imprimeVetor(Carro[] vet) { // recebe um vetor de carros
		for(int i=0; i<vet.length; i++) {
			vet[i].imprimeInfos();
		}
	}
}
