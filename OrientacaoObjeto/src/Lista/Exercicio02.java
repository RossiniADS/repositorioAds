package Lista;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		double n = entrada.nextDouble();
		boolean retorno = isZero(n);
		if (retorno == true) {
			System.out.println("O numero é nulo!");
		} else {
			System.out.println("O numero não é nulo!");
		}
		entrada.close();
	}

	public static boolean isZero(double n) {
		return n == 0;
	}

}
