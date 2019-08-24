package Lista;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Valor A: ");
		double a = entrada.nextDouble();
		System.out.println("Valor B: ");
		double b = entrada.nextDouble();
		System.out.println("Valor C: ");
		double c = entrada.nextDouble();
		double resultado = equacao(a,b,c);
		
		System.out.println("Delta é: "+resultado);
		entrada.close();
	}
	public static double equacao(double a,double b, double c) {
		return b*b-4*a*c;
	}

}
