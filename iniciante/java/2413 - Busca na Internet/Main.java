import java.util.Scanner;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int link3 = ler.nextInt();
        ler.close();
        int link2 = link3 * 2;
        int link1 = link2 * 2;
        
        System.out.println(link1);
    }
}