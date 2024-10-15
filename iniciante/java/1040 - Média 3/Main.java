import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.0");

        String entrada = ler.nextLine();
        String[] valores = entrada.split(" ");

        double N1 = Double.parseDouble(valores[0]);
        double N2 = Double.parseDouble(valores[1]);
        double N3 = Double.parseDouble(valores[2]);
        double N4 = Double.parseDouble(valores[3]);
        double media = (N1 * 2.0 + N2 * 3.0 + N3 * 4.0 + N4 * 1.0) / 10;

        System.out.println("Media: " + df.format(media));

        if(media >= 7)
            System.out.println("Aluno aprovado.");
        else if(media < 5)
           System.out.println("Aluno reprovado.");
        else {
            System.out.println("Aluno em exame.");
            double notaExame = ler.nextDouble();
            System.out.println(String.format("Nota do exame: %.1f", notaExame));

            double mediaFinal = (media + notaExame) / 2;
            if(mediaFinal >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.println(String.format("Media final: %.1f", mediaFinal));
        }
        ler.close();
    }    
}