package Lista02;

import java.util.Scanner;

import entidadesLista02.Ano;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o ano: ");
		int ano = entrada.nextInt();
		Ano obj = new Ano(ano);
		System.out.println(obj.ehbissexto());
		entrada.close();
	}

}
