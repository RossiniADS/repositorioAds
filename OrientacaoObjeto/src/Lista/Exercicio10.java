package Lista;

public class Exercicio10 {

	public static void main(String[] args) {
		int contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0, contador5 = 0, contador6 = 0;
		for (int i = 1; i <= 10000; i++) {
			int resultado = dado();
			if (resultado == 1) {
				contador1++;
			} else if (resultado == 2) {
				contador2++;
			} else if (resultado == 3) {
				contador3++;
			} else if (resultado == 4) {
				contador4++;
			} else if (resultado == 5) {
				contador5++;
			} else if (resultado == 6) {
				contador6++;
			}
		}
		System.out.println("1>>" + contador1);
		System.out.println("2>>" + contador2);
		System.out.println("3>>" + contador3);
		System.out.println("4>>" + contador4);
		System.out.println("5>>" + contador5);
		System.out.println("6>>" + contador6);
	}

	public static int dado() {
		return 1 + (int) (Math.random() * 6);
	}
}
