import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        String entrada = ler.nextLine();
        ler.close();
        String[] valores = entrada.split(" ");

        int horaInicial = Integer.parseInt(valores[0]);
        int horaFinal = Integer.parseInt(valores[1]);
        int duracao = 0;

        if(horaFinal == horaInicial){
            duracao = 24;
        } else {
            if(horaInicial > horaFinal){
                while(horaInicial > horaFinal){
                    if(horaInicial == 24){
                        duracao += horaFinal;
                        break;
                    } 
                    horaInicial ++;
                    duracao ++;
                }
            } else {
                while(horaInicial < horaFinal){
                    if(horaInicial == 24){
                        duracao += horaFinal;
                        break;
                    } 
                    horaInicial ++;
                    duracao ++;
                }
            }
        }

        System.out.println(String.format("O JOGO DUROU %d HORA(S)", duracao));
    }   
}