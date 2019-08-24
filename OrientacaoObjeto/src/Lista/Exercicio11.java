package Lista;

import java.util.Scanner;

public class Exercicio11 {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("deseja entrar com... (Celsius = 1/Farenheit = 2): ");
		int temperatura = entrada.nextInt();
		switch (temperatura) {
		case 1:
			celsius();
			break;
		case 2:
			faren();
			break;
		}
	}

	public static void celsius() {
		System.out.print("Informe tempetura: ");
		double c = entrada.nextDouble();
		double f = (9 * c / 5) + 32;
		System.out.println("farenheit == "+f);
	}
	public static void faren() {
		System.out.print("Informe tempetura: ");
		double f = entrada.nextDouble();
		double c= 5*(f-32)/9;
		System.out.println("celsius == "+c);
	}
}
