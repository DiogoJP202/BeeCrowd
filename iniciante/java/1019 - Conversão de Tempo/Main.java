import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);
        int segundos = ler.nextInt();
        ler.close();
        int minutos = segundos / 60;
        segundos = segundos % 60;
        int horas = minutos / 60;
        minutos = minutos % 60;

        System.out.println(String.format("%d:%d:%d", horas, minutos, segundos));
    }    
}