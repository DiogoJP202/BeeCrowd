import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int qtd = sc.nextInt();
        int num = sc.nextInt();
        int cont = 1;
        
        for (int i = 1; i < qtd; i++) {
            int temp = num;
            num = sc.nextInt();
            if (temp != num) cont ++;
        }
        sc.close();
        System.out.println(cont);
    }
}