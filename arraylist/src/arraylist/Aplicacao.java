package arraylist;

import java.util.ArrayList;

public class Aplicacao {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Rita", "rita123@gmail.com", 24);
		Pessoa p2 = new Pessoa("Luis", "luis@gmail.com", 23);
		Pessoa p3 = new Pessoa("Lele", "lele@gmail.com", 26);
		
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		
		for(Pessoa pessoa : pessoas) {
			System.out.println(pessoa.toString());
			// System.out.printf(pessoa.getNome() + " " + pessoa.getEmail() + " " + pessoa.getIdade() + " ");
		}
		
		// outra forma de imprimir
//		for(int i = 0; i < pessoas.size(); i++) {
//			System.out.println(pessoas.get(i).getNome());
//			System.out.println(pessoas.get(i).getEmail());
//			System.out.println(pessoas.get(i).getIdade());
//		}
	}
}
