import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.000");
        
        double R = ler.nextDouble();
        double pi  = 3.14159;
        ler.close();
        double volume = (4.0/3.0) * pi * Math.pow(R, 3);

        System.out.println("VOLUME = " + df.format(volume));
    }
}