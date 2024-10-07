import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner read = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        int funcionarioID = read.nextInt();
        int horasT = read.nextInt();
        double valorH = read.nextDouble();
        read.close();
        double salario = horasT * valorH;

        System.out.println("NUMBER = " + funcionarioID);
        System.out.println("SALARY = U$ " + df.format(salario));
    }
}