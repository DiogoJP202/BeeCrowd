// Importação para o programa rodar no beecrowd
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main{
    
    private static int ajuste(double salario){
        if(salario <= 400) return 15;
        else if(salario <= 800) return 12;
        else if(salario <= 1200) return 10;
        else if(salario <= 2000) return 7;
        else  return 4;
    }

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        double salario = ler.nextDouble();
        double aumento = ajuste(salario);
        double novoSalario = salario * (1 + (aumento / 100));
        double ganho = novoSalario - salario;

        System.out.println("Novo salario: " + df.format(novoSalario));
        System.out.println("Reajuste ganho: " + df.format(ganho)); 
        System.out.println("Em percentual: " + (int)aumento + " %"); // (int) Transforma o valor em inteiro.
        ler.close();
    }
    
}