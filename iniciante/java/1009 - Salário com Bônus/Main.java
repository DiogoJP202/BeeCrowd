import java.util.Scanner;
import java.io.IOException;
import java.text.DecimalFormat;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner read = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        String nomeVendedor = read.next();
        double salario = read.nextDouble();
        double totalVendas = read.nextDouble();
        read.close();
        double comissao = totalVendas * 0.15;
        salario += comissao;  
        System.out.println("TOTAL = R$ " + df.format(salario));      
    }
}