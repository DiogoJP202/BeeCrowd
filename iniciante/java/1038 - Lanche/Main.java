import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        String entrada = ler.nextLine();
        ler.close();
        String[] valores = entrada.split(" ");

        int codigo = Integer.parseInt(valores[0]);
        int qtd = Integer.parseInt(valores[1]);
        double valor = 0;

        if(codigo == 1)
            valor = 4.0 * qtd;
        if(codigo == 2) 
            valor = 4.5 * qtd;
        if(codigo == 3)
            valor = 5.0 * qtd;
        if(codigo == 4)
            valor = 2 * qtd;
        if(codigo == 5)
            valor = 1.5 * qtd;
            
        System.out.println(String.format("Total: R$ %.2f", valor));
    }    
}
