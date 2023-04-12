package arraylist;

public class Aluno {
	private String nome;
	private double nota1, nota2, nota3;
	
	public Aluno(String nome, float nota1, float nota2, float nota3) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getNota1() {
		return nota1;
	}



	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}



	public double getNota2() {
		return nota2;
	}



	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}



	public double getNota3() {
		return nota3;
	}



	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + ", nota1: " + nota1 + ", nota2: " + nota2 + ", nota3: " + nota3;
	}
	
	public double calculaMedia() {
		return (nota1 + nota2 + nota3) / 3;
	}
	
}
