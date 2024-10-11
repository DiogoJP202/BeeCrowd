import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        String entrada = ler.nextLine();
        ler.close();
        String[] valores = entrada.split(" ");
        
        double A = Double.parseDouble(valores[0]);
        double B = Double.parseDouble(valores[1]);
        double C = Double.parseDouble(valores[2]);
        double Delta = Math.pow(B, 2) - 4 * A * C;

        if(Delta < 0 || A == 0)
            System.out.println("Impossivel calcular");
        else{
            // Calcula as raízes usando a fórmula de Bhaskara
            double R1 = (- B + Math.sqrt(Delta)) / (2 * A);
            double R2 = (- B - Math.sqrt(Delta)) / (2 * A);

            System.out.println(String.format("R1 = %.5f", R1));
            System.out.println(String.format("R2 = %.5f", R2));
        }
    }    
}
