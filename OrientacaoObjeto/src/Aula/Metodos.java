package Aula;

import java.util.Scanner;

public class Metodos {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// Scanner entrada = new Scanner(System.in);
		int opcao = 0;
		do {

			menu();
			System.out.print(">>>> opcao: ");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				parImpar();
				break;
			case 2:
				System.out.println("Entre com um numero: ");
				// int n = entrada.nextInt();
				// primo(n);
				primo(entrada.nextInt());
				break;
			case 3:
				quadrado();
				break;
			case 4:
				raiz();
				break;
			case 5:
				System.out.println("\tFim do Programa");
				break;
			default:
				opcao = 1;
				System.out.println("\tOpcao invalida");
			}
		} while ((opcao >= 1) && (opcao <= 4));
	}

	// metodo
	public static void menu() {
		System.out.println("========MENU==========");
		System.out.println("1) Par ou Impar");
		System.out.println("2) Primo");
		System.out.println("3) Quadrado");
		System.out.println("4) Raiz");
		System.out.println("5) Sair");
	}

	public static void parImpar() {
		// Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com um numero: ");
		int parImpar = entrada.nextInt();
		if (parImpar % 2 == 0) {
			System.out.println("Numero é par");
		} else {
			System.out.println("Numero é impar");
		}
	}

	public static void primo(int primo) {
		// var -> primo = 10;
		// metodo -> primo(10);
		int contador = 0;
		for (int i = 1; i <= primo; i++) {
			if (primo % i == 0) {
				contador++;
			}
		}
		if (contador == 2) {
			System.out.println(">>> Numero: Primo");
		} else {
			System.out.println(">>> Numero: Não é Primo");
		}

	}

	public static void quadrado() {
		System.out.println("Entre com um numero: ");
		int quadrado = entrada.nextInt();
		System.out.println("O quadrado do numero é: " + quadrado * quadrado);
	}

	public static void raiz() {
		System.out.println("Entre com um numero: ");
		int raiz = entrada.nextInt();
		System.out.println("Raiz quadrada é: " + Math.sqrt(raiz));
	}
}
