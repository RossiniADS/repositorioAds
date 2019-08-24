package Lista;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		double n = entrada.nextDouble();
		boolean retorno = positivo(n);
		if (retorno == true) {
			System.out.println("O numero é positivo!");
		} else {
			System.out.println("O numero é negativo!");
		}
		entrada.close();
	}

	public static boolean positivo(double n) {
		return n >= 0;
	}
}