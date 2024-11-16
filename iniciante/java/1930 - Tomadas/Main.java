import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String[] valores = sc.nextLine().split(" ");
        sc.close();
        int totalTomadas = -3;
        
        for (int i = 0; i < valores.length; i++) {
            totalTomadas += Integer.parseInt(valores[i]);
        }
        
        System.out.println(totalTomadas);
    }
}