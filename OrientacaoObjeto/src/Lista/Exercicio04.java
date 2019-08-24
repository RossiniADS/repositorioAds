package Lista;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Valor A: ");
		double a = entrada.nextDouble();
		System.out.println("Valor B: ");
		double b = entrada.nextDouble();
		System.out.println("Valor C: ");
		double c = entrada.nextDouble();
		raizA(a,b,c);
		entrada.close();
	}

	public static void raizA(double a, double b, double c) {
		double resultado = (-b + Math.sqrt(b * b - 4 * a * c))/2*a;
		double resultado2 = (-b - Math.sqrt(b * b - 4 * a * c))/2*a;
		System.out.println("Primeira raiz: " + resultado);
		System.out.println("Segunda raiz: " + resultado2);
	}
}