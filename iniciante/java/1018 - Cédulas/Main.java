import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        ler.close();
        
        System.out.println(n);
        int n100 = n / 100;
        n = n % 100;
        System.out.println(n100 + " nota(s) de R$ 100,00");
        int n50 = n / 50;
        n = n % 50;
        System.out.println(n50 + " nota(s) de R$ 50,00");
        int n20 = n / 20;
        n = n % 20;
        System.out.println(n20 + " nota(s) de R$ 20,00");
        int n10 = n / 10;
        n = n % 10;
        System.out.println(n10 + " nota(s) de R$ 10,00");
        int n5 = n / 5;
        n = n % 5;
        System.out.println(n5 + " nota(s) de R$ 5,00");
        int n2 = n / 2;
        n = n % 2;
        System.out.println(n2 + " nota(s) de R$ 2,00");
        int n1 = n / 1;
        System.out.println(n1 + " nota(s) de R$ 1,00");
    }    
}