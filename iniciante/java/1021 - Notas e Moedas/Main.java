import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);
        double n = ler.nextDouble();
        ler.close();
        
        System.out.println("NOTAS:");
        double n100 = n / 100;
        n = n % 100;
        System.out.println((int)n100 + " nota(s) de R$ 100.00");
        double n50 = n / 50;
        n = n % 50;
        System.out.println((int)n50 + " nota(s) de R$ 50.00");
        double n20 = n / 20;
        n = n % 20;
        System.out.println((int)n20 + " nota(s) de R$ 20.00");
        double n10 = n / 10;
        n = n % 10;
        System.out.println((int)n10 + " nota(s) de R$ 10.00");
        double n5 = n / 5;
        n = n % 5;
        System.out.println((int)n5 + " nota(s) de R$ 5.00");
        double n2 = n / 2;
        n = n % 2;
        System.out.println((int)n2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        double n1 = n / 1;
        n = n % 1;
        System.out.println((int)n1 + " moeda(s) de R$ 1.00");
        double n050 = n / 0.5;
        n = n % 0.5;
        System.out.println((int)n050 + " moeda(s) de R$ 0.50");
        double n025 = n / .25;
        n = n % 0.25;
        System.out.println((int)n025 + " moeda(s) de R$ 0.25");
        double n010 = n / .10;
        n = n % 0.10;
        System.out.println((int)n010 + " moeda(s) de R$ 0.10");
        double n005 = n / .05;
        n = n % 0.05;
        System.out.println((int)n005 + " moeda(s) de R$ 0.05");
        double n001 = Math.round(n / .01);
        n = n % 0.01;
        System.out.println((int)n001 + " moeda(s) de R$ 0.01");
    }    
}