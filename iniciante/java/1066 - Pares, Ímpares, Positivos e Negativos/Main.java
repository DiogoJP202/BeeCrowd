import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);
        int par = 0, impar = 0, pos = 0, neg = 0;

        for (int i = 0; i < 5; i ++) {
            int number = ler.nextInt();

            if (number > 0) pos ++;
            else if (number < 0) neg ++;
    
            if (number % 2 == 0) par++;
            else impar++;                             
        }
        
        ler.close();

        System.out.printf("%d valor(es) par(es)%n", par);
        System.out.printf("%d valor(es) impar(es)%n", impar);
        System.out.printf("%d valor(es) positivo(s)%n", pos);
        System.out.printf("%d valor(es) negativo(s)%n", neg);
    }
}