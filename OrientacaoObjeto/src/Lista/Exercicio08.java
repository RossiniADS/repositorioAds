package Lista;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe primeiro valor: ");
		double valorA = entrada.nextDouble();
		System.out.print("Informe segundo valor: ");
		double valorB = entrada.nextDouble();
		System.out.print("Informe terceiro valor: ");
		double valorC = entrada.nextDouble();

		double maior = Math.min(valorA, valorB);

		System.out.println("Menor: "+Math.min(maior, valorC));
		entrada.close();
	}

}
