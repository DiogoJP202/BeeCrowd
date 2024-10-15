import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        
        String entradas = ler.nextLine();
        ler.close();
        String[] valores = entradas.split(" ");

        double x = Double.parseDouble(valores[0]);
        double y = Double.parseDouble(valores[1]);

        if(x == 0 && y == 0)
            System.out.println("Origem");
        else if(x > 0 && y > 0)
            System.out.println("Q1");
        else if(x < 0 && y > 0)
            System.out.println("Q2");
        else if(x < 0 && y < 0)
            System.out.println("Q3");
        else if(x == 0)
            System.out.println("Eixo Y");
        else if(y == 0)
            System.out.println("Eixo X");
        else
            System.out.println("Q4");
    }    
}