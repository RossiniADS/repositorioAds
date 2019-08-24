package Lista;

public class Exercicio13 {

	public static void main(String[] args) {
		primo();
	}

	public static void primo() {
		int intervalo = 10;

		for (int i = 2; i < intervalo; i++) {
			System.out.println(" i>> "+i);
			boolean ehPrimo = true;
			for (int j = 2; j <= i; j++) {
				System.out.println("ANTES j> "+j+" i> "+i);
				if (((i % j) == 0) && (j != i)) {
					System.out.println("FALSE j> "+j+" i> "+i);
					ehPrimo = false;
					break;
				}
			}
			if (ehPrimo) {
				System.out.println(i + " é Primo!");
			}
		}
	}

}
