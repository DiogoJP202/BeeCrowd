import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        String entrada = ler.nextLine();
        ler.close();
        String[] valores = entrada.split(" ");

        int a = Integer.parseInt(valores[0]);
        int b = Integer.parseInt(valores[1]);
        int c = Integer.parseInt(valores[2]);

        if(a < b && a < c){
            if(b < c){
                mostrarValores(a, b, c);
            } else {
                mostrarValores(a, c, b);
            }
        } else {
            if(b < c){
                if(c < a){
                    mostrarValores(b, c, a);
                } else {
                    mostrarValores(b, a, c);
                }
            } else {
                if(b < a){
                    mostrarValores(c, b, a);
                } else {
                    mostrarValores(c, a, b);
                }
            }
        }
        System.out.println("");
        mostrarValores(a, b, c);
    }    

    private static void mostrarValores(int x, int y, int z){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}