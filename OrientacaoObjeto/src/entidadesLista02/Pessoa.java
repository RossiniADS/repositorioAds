package entidadesLista02;

public class Pessoa {
	private String nome;
	private int idade;
	private double altura;

	public Pessoa(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (!nome.isEmpty()) {
			this.nome = nome;
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade >= 0 && idade <= 200) {
			this.idade = idade;
		}
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura >= 0.0 && altura <= 3.0) {
			this.altura = altura;
		}
	}

	public void fazAniversario(boolean faz) {
		if (faz) {
			idade++;
		}
	}
}
