package Lista02;

import java.util.Scanner;

import entidadesLista02.Calculadora;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Primeiro numero: ");
		int numero1 = entrada.nextInt();
		System.out.print("Segundo numero: ");
		int numero2 = entrada.nextInt();
		Calculadora obj = new Calculadora(numero1, numero2);

		System.out.println("Soma = " + obj.somar());
		System.out.println("Subtra��o = " + obj.subtrair());
		System.out.println("Multiplica��o = " + obj.multiplicar());
		System.out.println("Divis�o = " + obj.dividir());
		entrada.close();
	}

}
