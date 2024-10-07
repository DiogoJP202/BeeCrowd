import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner read = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        String entrada = read.nextLine();
        String[] valores1 = entrada.split(" ");
        int codigo1 = Integer.parseInt(valores1[0]);
        int numPecas1 = Integer.parseInt(valores1[1]);
        double valorPeca1 = Double.parseDouble(valores1[2]);

        entrada = read.nextLine();
        read.close();
        String[] valores2 = entrada.split(" ");
        int codigo2 = Integer.parseInt(valores2[0]);
        int numPecas2 = Integer.parseInt(valores2[1]);
        double valorPeca2 = Double.parseDouble(valores2[2]);

        double divida = numPecas1 * valorPeca1 + numPecas2 * valorPeca2;
        System.out.println("VALOR A PAGAR: R$ " + df.format(divida));
    }    
}
