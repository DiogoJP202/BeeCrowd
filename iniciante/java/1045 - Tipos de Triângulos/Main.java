import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        String entrada = ler.nextLine();
        ler.close();
        String[] valores = entrada.split(" ");
        double[] valoresDouble = new double[3];
        for(int c = 0; c <= 2; c++){
            valoresDouble[c] = Double.parseDouble(valores[c]);
        }
        Arrays.sort(valoresDouble);

        double A = valoresDouble[2];
        double B = valoresDouble[1];
        double C = valoresDouble[0];

        if(A >= B + C)
            System.out.println("NAO FORMA TRIANGULO");
        else{
            if(pow2(A) == pow2(B) + pow2(C))
                System.out.println("TRIANGULO RETANGULO");
            if(pow2(A) > pow2(B) + pow2(C))
                System.out.println("TRIANGULO OBTUSANGULO");
            if(pow2(A) < pow2(B) + pow2(C))
                System.out.println("TRIANGULO ACUTANGULO");
            if(A == B && A == C)
                System.out.println("TRIANGULO EQUILATERO");
            else if(A == B || B == C || A == C)
                System.out.println("TRIANGULO ISOSCELES");
        }
    }    

    private static double pow2(double x){return Math.pow(x, 2);}
}