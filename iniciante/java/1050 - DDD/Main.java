import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int DDD = ler.nextInt();
        ler.close();
        System.out.println(verificarDDD(DDD));
    }    

    public static String verificarDDD(int DDD){
        String estado;
        if(DDD == 61)
            estado = "Brasilia";
        else if(DDD == 71)
            estado = "Salvador";
        else if(DDD == 11)
            estado = "Sao Paulo";
        else if(DDD == 21)
            estado = "Rio de Janeiro";
        else if(DDD == 32)
            estado = "Juiz de Fora";
        else if(DDD == 19)
            estado = "Campinas";
        else if(DDD == 27)
            estado = "Vitoria";
        else if(DDD == 31)
            estado = "Belo Horizonte";
        else
            estado = "DDD nao cadastrado";
        return estado;    
    } 
}
