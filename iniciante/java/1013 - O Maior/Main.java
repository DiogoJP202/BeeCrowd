import java.util.Scanner;
import java.io.IOException;

public class Main {
    private static int MaiorAB(int x, int y){
        return (x + y + Math.abs(x - y)) / 2;
    }

    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);
        int a = ler.nextInt();
        int b = ler.nextInt();
        int c = ler.nextInt();
        ler.close();

        int maior = MaiorAB(MaiorAB(a, b), c);
        System.out.println(maior + " eh o maior");
    }
}