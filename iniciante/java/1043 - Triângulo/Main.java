import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        
        String entradas = ler.nextLine();
        ler.close();
        String[] valores = entradas.split(" ");
        
        double A = Double.parseDouble(valores[0]);
        double B = Double.parseDouble(valores[1]);
        double C = Double.parseDouble(valores[2]);
        
        if(A + B > C && A + C > B && B + C > A) {
            System.out.println(String.format("Perimetro = %.1f", (A + B + C)));
        } else {
            System.out.println(String.format("Area = %.1f", ((A + B) * C) / 2));
        }
    }    
}
