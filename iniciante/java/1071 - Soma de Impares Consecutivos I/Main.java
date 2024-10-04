import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int X = ler.nextInt();
        int Y = ler.nextInt();
        int Z = 0;

        while (X != Y) {
            if (X > Y) {
                int temp = X;
                X = Y;
                Y = temp;
            }
            X += 1;
            if (X % 2 != 0 && X != Y)
                Z += X;
        }

        ler.close();
        System.out.println(Z);
    }
}