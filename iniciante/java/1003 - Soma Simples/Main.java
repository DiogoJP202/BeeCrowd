import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner read = new Scanner(System.in);
        int A = read.nextInt();
        int B = read.nextInt();
        int SOMA = A + B;

        read.close();
        System.out.println("SOMA = " + SOMA);
    }
}
