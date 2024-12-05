import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int distanciaTotal = 0;

        // Previne bug de linha vazia.
        sc.nextLine(); 
        
        for(int i = 0; i < N; i ++) {
            String[] valores = sc.nextLine().split(" ");
            int T = Integer.parseInt(valores[0]);
            int V = Integer.parseInt(valores[1]);

            distanciaTotal += V * T;
        }
        
        sc.close();
        System.out.println(distanciaTotal);
    }
}