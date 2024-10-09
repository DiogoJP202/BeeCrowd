import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.0000");

        String entrada = ler.nextLine();
        String[] valores1 = entrada.split(" ");
        double x1 = Double.parseDouble(valores1[0]);
        double y1 = Double.parseDouble(valores1[1]);
        
        entrada = ler.nextLine();
        ler.close();
        String[] valores2 = entrada.split(" ");
        double x2 = Double.parseDouble(valores2[0]);
        double y2 = Double.parseDouble(valores2[1]);
        
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println(df.format(distancia));
    }
}