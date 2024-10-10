import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);
        int distancia = ler.nextInt();
        ler.close();
        System.out.println(distancia * 2 + " minutos");
    }
}