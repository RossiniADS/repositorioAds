package Lista02;

import java.util.Scanner;
import entidadesLista02.Casa;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Casa casa = new Casa();

		System.out.println("Porta 1: " + casa.isPorta1());
		System.out.println("Porta 2: " + casa.isPorta2());
		System.out.println("Porta 3: " + casa.isPorta3());
		System.out.println("Cor....: " + casa.getCor());
		
		
	/*	int opcao = 0;
		do {
			System.out.println("======================");
			System.out.println("       M E N U");
			System.out.println("======================");
			System.out.println("1) Abrir porta");
			System.out.println("2) Fechar porta");
			System.out.println("3) Pintar a casa");
			System.out.println("4) Pintar a casa (com menu de cores)");
			System.out.println("5) Qtde portas abertas");
			System.out.println("6) Sair");
			System.out.println("---");
			System.out.print(">>> Opcao: ");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("\n\tAbrir porta\n");
				System.out.print("Entre com o numero da porta: ");

			}
		} while (opcao != 6);*/
		entrada.close();
	}
}
