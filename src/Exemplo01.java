import java.util.Scanner;

public class Exemplo01 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];

        // entrada de dados
        for (int i = 0; i < x.length; i++) {
            System.out.print("Digite um numero: ");
            x[i] = sc.nextInt();
        }

        // saída de dados
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
}
