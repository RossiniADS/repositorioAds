package Lista02;

import java.util.Scanner;
import entidadesLista02.Primo;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um numero: ");
		int numero = entrada.nextInt();
		Primo obj = new Primo(numero);
		System.out.println(obj.ehPrimo());
		entrada.close();
	}
}