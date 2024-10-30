import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int positivos = 0;
        for (int i = 0; i < 6; i++) {
            double numero = sc.nextDouble();

            if (numero > 0)
                positivos ++;
        }
        sc.close();

        System.out.printf("%d valores positivos%n", positivos);
    }
}