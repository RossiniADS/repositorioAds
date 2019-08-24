package Lista02;

import java.util.Scanner;

import entidadesLista02.Pessoa;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Entre com o nome: ");
		String nome = entrada.nextLine();
		System.out.print("Informe idade: ");
		int idade = entrada.nextInt();
		System.out.print("Informe altura: ");
		double altura = entrada.nextDouble();

		// Classe Objeto = new MetodoConstrutor();
		Pessoa obj = new Pessoa(nome, idade, altura);

		System.out.print("Faz aniversario? (true/false) ");
		obj.fazAniversario(entrada.nextBoolean());

		/*
		 * pessoa.setNome(entrada.nextLine());
		 * 
		 * */

		System.out.println("=======Dados=======");
		System.out.println("Nome: " + obj.getNome());
		System.out.println("Idade: " + obj.getIdade());
		System.out.println("Altura: " + obj.getAltura());
		entrada.close();
	}

}
