package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AplicacaoL {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		Livro l1 = new Livro("Crepusculo", "Staphania Mayer", 2005);
		Livro l2 = new Livro("Além da ajuda", "Augosto Cury", 2000);
		Livro l3 = new Livro("O poder do agora", "Erik Karter", 2007);

		ArrayList<Livro> livros = new ArrayList<Livro>();

		livros.add(l1);
		livros.add(l2);
		livros.add(l3);

		System.out.println("Digite o nome do livro para comprar: ");
		String nome = ler.nextLine();

		Iterator<Livro> iter = livros.iterator();

		while (iter.hasNext()) {
			Livro item = iter.next();
			
			if (item.getTitulo().equals(nome)) {
				System.out.println("Removeu");
				iter.remove();
			}
		}
		
		System.out.println(livros.toString());
		

//		for(Livro livro : livros) {
//			if(nome.equals(livro.getTitulo())) {
//			System.out.println("passou");
//				livro.remove();
//			}
//		}

//		for(int i = 0; i < livros.size(); i++) {
//			if(nome.equals(livros.get(i).getTitulo())) {
//				livros.remove(nome);
//				System.out.println("Removeu " + livros.get(i));
//			}
//			
//			livros.get(i).toString();
//		}	
	}
}
