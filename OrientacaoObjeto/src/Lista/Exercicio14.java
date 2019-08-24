
package Lista;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe primeiro numero: ");
        int numero = entrada.nextInt();
        System.out.print("Informe segundo numero: ");
        int numero2 = entrada.nextInt();
        mdc(numero, numero2);
        entrada.close();
    }
    public static void mdc(int numero, int numero2){
            int maior=0, mdc=1;
           if (numero>numero2){
               maior=numero;
           }
           else if (numero2>numero){
               maior=numero2;
           }
            for(int i=2; i<=maior;++i){
              /* Enquanto o resto da divisão for igual a zero
                 a variável mdc irá ser multiplicada por i*/
                while ((numero % i==0)&&(numero2 % i==0)){
                    numero=numero/i;
                    numero2=numero2/i;
                    mdc=mdc*i;
                }
            }
          
          // Exibindo o MDC
          System.out.printf("%d\n",mdc);
    }
}
