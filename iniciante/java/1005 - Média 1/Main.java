import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00000");

        double A = ler.nextDouble();
        double B = ler.nextDouble();
        ler.close();
        double media = (A * 3.5 + B * 7.5) / 11;

        System.out.println("MEDIA = " + df.format(media));
    }
}