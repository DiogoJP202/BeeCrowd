import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.000");

        String entrada = ler.nextLine();
        ler.close();
        String[] valores = entrada.split(" ");
        
        double A = Double.parseDouble(valores[0]);
        double B = Double.parseDouble(valores[1]);
        double C = Double.parseDouble(valores[2]);

        double triangulo = (A * C) / 2;
        System.out.println("TRIANGULO: " + df.format(triangulo));

        double circulo = Math.pow(C, 2) * 3.14159;
        System.out.println("CIRCULO: " + df.format(circulo));

        double trapezio = ((A + B) * C) / 2;
        System.out.println("TRAPEZIO: " + df.format(trapezio));

        double quadrado = Math.pow(B, 2);
        System.out.println("QUADRADO: " + df.format(quadrado));

        double retangulo = A * B;
        System.out.println("RETANGULO: " + df.format(retangulo));
    }
}
