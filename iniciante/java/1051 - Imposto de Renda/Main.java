import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double imposto;
        double salario = sc.nextDouble();
        sc.close();

        if (salario <= 2000.00) {
            System.out.println("Isento");
        } else {
            if (salario <= 3000.00) {
                imposto = (salario - 2000.00) * 0.08; 
            } else if (salario <= 4500.00) {
                imposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
            } else {
                imposto = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
            }

            System.out.printf("R$ %.2f%n", imposto);
        }
    }
}