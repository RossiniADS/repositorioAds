package Lista;

public class Exercicio15 {

    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i < 9000; i++) {
            soma = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    soma += j;
                }
            }
            if (soma == i) {
                System.out.print(i + ", ");
            }
        }
    }
}
