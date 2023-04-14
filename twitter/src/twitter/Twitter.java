package twitter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Twitter {
	static Scanner ler = new Scanner(System.in);
	static ArrayList<Usuario> usuarios;
	static Usuario usuario;

	public static void main(String[] args) {
		String opcao;
		System.out.println("----------------X--------------");
		System.out.println("O que gostaria de fazer?\n" + "1 - cadastrar usuário\r\n" + "2 - listar usuários\r\n"
				+ "3 - logar usuário\r\n" + "4 - deslogar usuário\r\n" + "5 - tweetar\r\n"
				+ "6 - mostrar últimos N tweets do feed\r\n" + "7 - remover tweet de um usuário\r\n"
				+ "8 - alterar senha de um usuário\r\n" + "9 - remover um usuário\r\n"
				+ "10 - imprimir estatísticas\r\n" + "0 - finalizar programa\r\n"
				+ "----------------X--------------\r\n");
		do {
			System.out.println("Digite o numero da acao desejada: ");
			opcao = ler.nextLine();

			switch (Integer.parseInt(opcao)) {
			case 1:
				usuario = cadastrar();
				usuarios = new ArrayList<>();
				usuarios.add(usuario);

				break;

			case 2:
				listarUsuarios();
				break;

			case 3:
				logarUsuario();
				break;

			case 0:
				opcao = "0";
				break;
			}

		} while (Integer.parseInt(opcao) != 0);
	}

	public static Usuario cadastrar() {
		System.out.println("\nDigite suas informacoes de cadastro:\n Nome: ");
		String nome = ler.nextLine();

		while (nome.length() < 2 || nome.length() > 30) {
			System.out.println("Numero de caracteres incompativel, digite nome de 2 a 30 caracteres");
			nome = ler.nextLine();
		}
		;

		System.out.println("\nUsuario: ");
		String login = ler.nextLine();

		while (login.length() < 2 || login.length() > 20) {
			System.out.println("Numero de caracteres incompativel, digite username de 2 a 20 caracteres");
			login = ler.nextLine();
		}
		;

		System.out.println("\nEmail: ");
		String email = ler.nextLine();

		while (email.length() < 6 || email.length() > 30) {
			System.out.println("Numero de caracteres incompativel, digite email de 6 a 30 caracteres");
			email = ler.nextLine();
		}
		;

		System.out.println("\nSenha: ");
		String senha = ler.nextLine();

		while (senha.length() < 6 || senha.length() > 15) {
			System.out.println("Numero de caracteres incompativel, digite senha de 6 a 15 caracteres");
			senha = ler.nextLine();
		}
		;

		Usuario usuario = new Usuario(nome, login, email, senha);

		System.out.println("Usuario cadastrado com sucesso!");
		return usuario;
	}

	public static void listarUsuarios() {
		for (Usuario u : usuarios) {
			System.out.println(u.toString());
		}

	}

	public static void logarUsuario() {
		// consertar aqui
		String sair = "nao";
		do {
			for (Usuario u : usuarios) {
				System.out.println("Login: ");
				String login = ler.nextLine();

				System.out.println("Senha: ");
				String senha = ler.nextLine();

				// valida se o usuario existe
				while (!login.equals(u.getLogin())) {
					System.out.println("Usuario inexistente, digite novamente: ");
					login = ler.nextLine();
				}

				// logar
				if (login.equals(u.getLogin()) && senha.equals(u.getSenha())) {
					u.setLogado(true);
					System.out.println("Usuario logado!");
					
					break;
				} else {
					System.out.println("Login ou senha incorretos, gostaria de tentar novamente?\n Digite sim ou nao");
					sair = ler.nextLine();
					if(sair.equals("nao")) {
						break;
					}
				}
			}
		} while (sair.equals("sim"));
	}

}
