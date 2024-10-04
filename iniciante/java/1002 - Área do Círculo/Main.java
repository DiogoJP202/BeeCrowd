import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0000");

        double raio = read.nextDouble();
        double PI = 3.14159;
        double area = PI * Math.pow(raio, 2);

        read.close();
        System.out.println("A=" + df.format(area));
    }
}
