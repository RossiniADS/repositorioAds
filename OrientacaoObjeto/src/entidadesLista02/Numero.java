package entidadesLista02;

public class Numero {
	private int numero;

	public Numero(int numero) {
		this.numero = numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public int inverter(int numero) {
		int i = 0;

		while (numero > 0) {
			i *= 10;
			i += (numero % 10);
			numero /= 10;
		}

		return i;

	}
}
