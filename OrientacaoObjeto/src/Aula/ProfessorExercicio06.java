package Aula;

import java.util.Scanner;
import entidadesAula.ProfessorCasa;

public class ProfessorExercicio06 {

	public static void main(String[] args) {

		Scanner   leia    = new Scanner ( System.in );
        Scanner   leiaStr = new Scanner ( System.in );
        ProfessorCasa casa;
         
        int opcao = 0;
        int opCor = 0;
         
        System.out.print("Deseja informar a quantidade de portas [s/n]: ");
         
        if ( leiaStr.nextLine().equalsIgnoreCase ( "s" ) ) {
            System.out.print("Entre com a quantidade de portas: ");
            casa = new ProfessorCasa ( leia.nextInt() );
        } else {
            casa = new ProfessorCasa ();
        }
         
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
            opcao = leia.nextInt();
             
            switch ( opcao ) {
                case 1:
                    System.out.println("\n\tAbrir porta\n");
                    System.out.print("Entre com o numero da porta: ");
                    if ( !casa.abrirPorta ( leia.nextInt() ) ) {
                        System.out.println("\n\tErro! Porta invalida ou porta ja aberta...\n");
                    } else {
                        System.out.println("\n\tPorta aberta...\n");
                    }
                    break;
                case 2:
                    System.out.println("\n\tFechar porta\n");
                    System.out.print("Entre com o numero da porta: ");
                    if ( !casa.fecharPorta ( leia.nextInt() ) ) {
                        System.out.println("\n\tErro! Porta invalida ou porta ja fechada...\n");
                    } else {
                        System.out.println("\n\tPorta fechada...\n");
                    }
                    break;
                case 3:
                    System.out.println("\n\tPintar a casa\n");
                    System.out.print("Entre com a cor da casa: ");
                    if ( !casa.pintar ( leiaStr.nextLine() ) ) {
                        System.out.println("\n\tErro! Cor invalida ou a casa ja esta com essa cor...\n");
                    } else {
                        System.out.println("\n\tCasa pintada...\n");
                    }
                    break;
                case 4:
                    System.out.println("\n\tPintar a casa\n");
                    String[] opcoesDeCores = casa.getCores();
                    for ( int i = 0 ; i < opcoesDeCores.length ; i++ ) {
                        System.out.println((i+1) + ") " + opcoesDeCores[i]);
                    }
                    System.out.print(">>> Opcao: ");
                    if ( !casa.pintar ( leia.nextInt() ) ) {
                        System.out.println("\n\tErro! Cor invalida ou a casa ja esta com essa cor...\n");
                    } else {
                        System.out.println("\n\tCasa pintada...\n");
                    }
                    break;
                case 5:
                    System.out.println("\n\tQtde portas abertas\n");
                    for ( int i = 1 ; i <= casa.getQtdePortas() ; i++ ) {
                        System.out.printf("\t\tPorta %2d: %s\n", (i), (casa.isPorta(i)?"aberta":"fechada") );
                    }
                    System.out.println("\tTotal portas abertas: " + casa.quantasPortasEstaoAbertas() );
                    break;
                case 6:
                    System.out.println("\n\tFim do programa...\n");
                    break;
                default:
                    System.out.println("\n\tErro! Opcao invalida...\n");
            }
             
        } while ( opcao != 6 );
    }
}
