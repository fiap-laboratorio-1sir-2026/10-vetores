import java.util.Random;

public class Exemplo02 {
    static void main() {
        Random random = new Random();
        int x;
        double y;

        x = random.nextInt();
        y = random.nextDouble(20);

        System.out.println(y);
    }
}
