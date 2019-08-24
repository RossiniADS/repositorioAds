package Aula;

import java.util.Scanner;

public class PrimeiroPrograma {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int n1;
		int n2 = 0;

		escreve("Entre com um numero: ");
		n1 = entrada();
		escreve("Entre com outro numero ");
		n2 = entrada();

		System.out.println("A soma é: " + soma(n1, n2));

	}

	public static void escreve(String texto) {
		System.out.print(texto);
	}

	public static int entrada() {
		int n = 0;
		n = entrada.nextInt();
		if (n > 0) {
			return n;
		} else {
			return 0;
		}
	}

	public static int soma(int n1, int n2) {
		return n1 + n2;
	}
}
