import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner read = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");

        double A = read.nextDouble();
        double B = read.nextDouble();
        double C = read.nextDouble();
        double media = (A * 2 + B * 3 + C * 5) / 10;
        read.close();

        System.out.println("MEDIA = " + df.format(media));
    }    
}
