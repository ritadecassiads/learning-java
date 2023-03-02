package primeiraAula;

import java.util.Scanner;

public class Primeira {
    public static void main(String[] args) {
        System.out.println("Olá mundo!");
        
        Integer idade;
        String nome;
      
        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite sua idade: ");
        idade = ler.nextInt();
        
        ler.nextLine();

        System.out.printf("Digite seu nome: ");
        nome = ler.nextLine();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        if(idade < 12){
            System.out.println("Criança");
        } else if (idade >= 12 && idade < 18) {
            System.out.println("Adolescente");
        } else if(idade > 18){
            System.out.println("Adulto");
        }
        
    }
}
