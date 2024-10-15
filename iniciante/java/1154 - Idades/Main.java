import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int valor = 0;
        int contador = 0;
        boolean continuar = true;

        while (continuar){
            int entrada = ler.nextInt();
            if (entrada < 0)
                continuar = false;
            else {
                valor += entrada;
                contador ++;
            }
        }

        ler.close();
        double media = valor / contador;
        System.out.println(String.format("%.2f", media));
    }
}