package twitter;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	private String nome, login, email, senha;
	private boolean logado;
	private ArrayList<String> tweets;
	Scanner ler = new Scanner(System.in);


	public Usuario(String nome, String login, String email, String senha) {
		this.nome = nome;
		this.login = login;
		this.email = email;
		this.senha = senha;
		this.logado = false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario -> Nome:" + nome + ", login: " + login + ", email: " + email + ", senha: " + senha + "\n";
	}

	public ArrayList<String> getTweets() {
		return tweets;
	}

	public void setTweets(ArrayList<String> tweets) {
		this.tweets = tweets;
	}

	public boolean isLogado() {
		return logado;
	}

	public void setLogado(boolean logado) {
		this.logado = logado;
	}

//	public void validaCadastro() {
//		do {
//			System.out.println("Digite suas informações de cadastro\n Nome: ");
//			String nome = ler.nextLine();
//			if (nome.length() >= 2 && nome.length() <= 30) {
//				this.nome = nome;
//			} else {
//				System.out.println("Nome com no minimo 2 e no máximo 30 caracteres\n");
//			}	
//		} while(nome.length() < 2 && nome.length() > 30);

//		if (login.length() >= 2 && login.length() <= 20) {
//			this.login = login;
//		} else {
//			System.out.println("Login com no minimo 2 e no máximo 20 caracteres");
//			this.login = "";
//			return false;
//		}
//
//		if (email.length() >= 6 && email.length() <= 30) {
//			this.email = email;
//		} else {
//			System.out.println("Email com no minimo 6 e no máximo 30 caracteres");
//			return false;
//		}
//
//		if (senha.length() >= 6 && senha.length() <= 15) {
//			this.senha = senha;
//		} else {
//			System.out.println("Senha com no minimo 6 e no máximo 15 caracteres");
//			return false;
//		}
	//}

	// metodo validaLogin
	// metodo validaCampos

}
