package Lista02;

import java.util.Scanner;

import entidadesLista02.Numero;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		int numero = entrada.nextInt();
		Numero obj = new Numero(numero);
		System.out.println(obj.inverter(numero));
		entrada.close();
	}

}
