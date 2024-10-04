import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner read = new Scanner(System.in);
        int n1 = read.nextInt();
        int n2 = read.nextInt();
        int PROD = n1 * n2;

        read.close();
        System.out.println("PROD = " + PROD);
    }
}
