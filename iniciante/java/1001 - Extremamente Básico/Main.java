import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner read = new Scanner(System.in);
        int A = read.nextInt();
        int B = read.nextInt();
        int X = A + B;

        read.close();
        System.out.println("X = " + X);
    }
}
