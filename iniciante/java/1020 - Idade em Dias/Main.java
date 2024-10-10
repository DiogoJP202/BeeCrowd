import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);

        int dias = ler.nextInt();
        ler.close();
        int anos = dias / 365;       
        dias %= 365;

        int mes = dias / 30; 
        dias %= 30;

        System.out.println(anos + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dias + " dia(s)");
    }    
}