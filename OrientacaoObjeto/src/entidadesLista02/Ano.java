package entidadesLista02;

public class Ano {
	private int ano;

	public Ano(int ano) {
		this.ano = ano;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean ehbissexto() {
		if (ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0) {
			return true;
		} else {
			return false;
		}
	}
}
