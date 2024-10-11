import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        String T = ler.nextLine();
        String entrada = ler.nextLine();
        ler.close();

        String[] respostas = entrada.split(" ");
        int respostasCorretas = 0;

        for(String resposta : respostas){
            if(resposta.equals(T))
                respostasCorretas ++;
        }

        System.out.println(respostasCorretas);
    }    
}