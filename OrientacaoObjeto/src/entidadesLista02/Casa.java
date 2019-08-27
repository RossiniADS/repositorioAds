package entidadesLista02;

public class Casa {
	private boolean porta1, porta2, porta3;
	private String cor;

	public Casa() {
		porta1 = porta2 = porta3 = false;
		cor = "branca";
	}

	public boolean setPorta1(boolean porta1) {
		// <classe>.<atributo> = <parametro>;

		if (this.porta1 != porta1) {
			this.porta1 = porta1;
			return true;
		}
		return false;
	}

	public boolean setPorta2(boolean porta2) {
		if (this.porta2 != porta2) {
			this.porta2 = porta2;
			return true;
		}
		return false;
	}

	public boolean setPorta3(boolean porta3) {
		if (this.porta3 != porta3) {
			this.porta3 = porta3;
			return true;
		}
		return false;
	}

	public boolean setCor(String cor) {
		// branca azul roxa;
		if (!this.cor.equalsIgnoreCase(cor)) {
			if (cor.equalsIgnoreCase("branca") || cor.equalsIgnoreCase("azul") || cor.equalsIgnoreCase("roxo")) {
				this.cor = cor;
			}
			return true;
		}
		return false;
	}

	public boolean isPorta1() {
		return porta1;
	}

	public boolean isPorta2() {
		return porta2;
	}

	public boolean isPorta3() {
		return porta3;
	}

	public String getCor() {
		return cor;
	}

	/*
	 * public boolean abrirPorta() {
	 * 
	 * }
	 * 
	 * public boolean fecharPorta() {
	 * 
	 * }
	 * 
	 * public boolean pintar() {
	 * 
	 * }
	 * 
	 * public int quantasPortasEstaoAbertas() {
	 * 
	 * }
	 */
}
