import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);
        int horas = ler.nextInt();
        int veloMedia = ler.nextInt();
        ler.close();
        double distancia = (horas  * veloMedia) / 12.;

        System.out.println(String.format("%.3f", distancia));
    }
}