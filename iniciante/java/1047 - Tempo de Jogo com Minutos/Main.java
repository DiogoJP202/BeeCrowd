import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        String entrada = ler.nextLine();
        ler.close();
        String[] valores = entrada.split(" ");

        int horaInicial = Integer.parseInt(valores[0]);
        int horaFinal = Integer.parseInt(valores[2]);
        int minutoInicial = Integer.parseInt(valores[1]);
        int minutoFinal = Integer.parseInt(valores[0]);

        // System.out.println(String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", duracaoHora, duracaoMinuto));
    }   
}