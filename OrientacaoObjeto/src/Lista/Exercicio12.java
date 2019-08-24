package Lista;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe a primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.print("Informe a segunda nota: ");
		double nota2 = entrada.nextDouble();
		System.out.print("Informe a terceira nota: ");
		double nota3 = entrada.nextDouble();
		media(nota1,nota2,nota3);
		entrada.close();
	}

	public static void media(double nota1, double nota2, double nota3) {
		double maior = Math.max(nota1, nota2);
		double maior2 = Math.max(maior, nota3);
		System.out.println("maior nota == " + maior2);
		double menor = Math.min(nota1, nota2);
		double menor2 = Math.min(menor, nota3);
		System.out.println("Menor nota == " + menor2);
		System.out.println("Media com 3 provas: " + (nota1 + nota2 + nota3) / 3);
		System.out.println("Média com 2 notas mais altas: " + (maior + maior2) / 2);
		System.out.println("Média com 2 notas, a mais alta e a mais baixa: "+(maior2 + menor2)/2);
	}

}
