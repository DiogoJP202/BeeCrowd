import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        String entrada = ler.nextLine();
        ler.close();
        String[] valores = entrada.split(" ");

        int horaInicial = Integer.parseInt(valores[0]);
        int minutoInicial = Integer.parseInt(valores[1]);
        int horaFinal = Integer.parseInt(valores[2]);
        int minutoFinal = Integer.parseInt(valores[0]);

        int inicio = horaInicial * 60 + minutoInicial;
        int fim = horaFinal * 60 + minutoFinal;
        int duracao = 0;

        if(fim <= inicio)
            duracao = (24 * 60 - inicio) + fim;
        else
            duracao = fim - inicio;

        int duracaoH = duracao / 60;
        int duracaoM = duracao % 60;

        System.out.println(String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", duracaoH, duracaoM));
    }   
}