package Lista;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe um numero ");
        String numero = entrada.nextLine();
        inverso(numero);
        entrada.close();
    }

    public static void inverso(String numero) {
        String aux = "";
        for (int i = numero.length() - 1; i >= 0; i--) {
            aux += numero.charAt(i);
        }
        System.out.println(aux);

    }
}
