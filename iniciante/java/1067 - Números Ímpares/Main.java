import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);
        int X = ler.nextInt();
        int contador = 1;
        while(contador <= X){
            System.out.println(contador);
            contador += 2;
        }
        ler.close();
    }
}
