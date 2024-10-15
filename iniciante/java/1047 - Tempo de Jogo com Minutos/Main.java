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
        int duracaoHora = calcularDuracaoDeTempo(horaInicial, horaFinal, 24);
        int minutoInicial = Integer.parseInt(valores[1]);
        int minutoFinal = Integer.parseInt(valores[0]);
        int duracaoMinuto = calcularDuracaoDeTempo(minutoInicial, minutoFinal, 60);
    
        System.out.println(String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", duracaoHora, duracaoMinuto));
    }   
    
    private static int calcularDuracaoDeTempo(int tempoInicial, int tempoFinal, int tempoBreak){
        int duracao = 0;
        
        if(tempoFinal == tempoInicial){
            duracao = tempoBreak;
        } else {
            if(tempoInicial > tempoFinal){
                while(tempoInicial > tempoFinal){
                    if(tempoInicial == tempoBreak){
                        duracao += tempoFinal;
                        break;
                    } 
                    tempoInicial ++;
                    duracao ++;
                }
            } else {
                while(tempoInicial < tempoFinal){
                    if(tempoInicial == tempoBreak){
                        duracao += tempoFinal;
                        break;
                    } 
                    tempoInicial ++;
                    duracao ++;
                }
            }
        }
        return duracao;
    }
}