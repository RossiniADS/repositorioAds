package Lista;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe primeiro valor: ");
		double valorA = entrada.nextDouble();
		System.out.print("Informe segundo valor: ");
		double valorB = entrada.nextDouble();
		maior(valorA,valorB);
		entrada.close();
	}

	public static void maior(double valorA, double valorB) {
		if (valorA > valorB) {
			System.out.println("Primeiro Valor Maior");
		} else {
			System.out.println("Segundo valor maior!!");
		}
	}

}
