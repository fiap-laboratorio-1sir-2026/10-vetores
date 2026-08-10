import java.util.Scanner;

public class Exercicio01 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        // entrada de dados
        for (int i = 0; i < x.length; i++) {
            System.out.print("Digite um numero: ");
            x[i] = sc.nextInt();
        }

        // localiza o maior e o menor número armazenado
        for (int i = 0; i < x.length; i++) {
            if (x[i] > maior) {
                maior = x[i];
            }
            if (x[i] < menor) {
                menor = x[i];
            }
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
