import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.000");

        int X = ler.nextInt();
        double Y = ler.nextDouble();
        ler.close();   
        double distanciaTotal = X / Y;
         
        System.out.println(df.format(distanciaTotal) + " km/l");
    }    
}