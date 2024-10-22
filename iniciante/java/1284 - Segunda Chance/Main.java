import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);
        int alunos = ler.nextInt();
        double[] notasOriginais = new double[alunos];
        double[] notasComplementarees = new double[alunos];
        double[] notasFinais = new double[alunos];
        int notasAlteradas = 0;

        for(int i = 0; i < alunos; i ++)
            notasOriginais[i] = ler.nextDouble();

        for(int i = 0; i < alunos; i ++){
            notasComplementarees[i] = ler.nextDouble();
            if (notasOriginais[i] < 10 && notasComplementarees[i] == 10){
                notasAlteradas ++;
                notasFinais[i] = notasOriginais[i] + 2;
                if (notasFinais[i] > 10)
                    notasFinais[i] = 10;
            } else
                notasFinais[i] = notasOriginais[i];
        }
        ler.close();

        mostrarNotas(alunos, notasAlteradas, notasOriginais, notasFinais);
    }

    private static String formataNumeros3Casas(int n) {
        return String.format("%03d", n);
    }
    
    private static String formataNumeros2Casas(double n) {
        if (n < 10) {
            return String.format("0%.2f", n);
        } else {
            return String.format("%.2f", n);
        }
    }


    private static void  mostrarNotas(int qtdAlunos, int notasAlteradas, double[] notasInicial, double[] notasFinal){
        System.out.println("NOTAS ALTERADAS: " + notasAlteradas);
        for(int i = 0; i < qtdAlunos; i ++){
            if (notasInicial[i] == notasFinal[i])
            System.out.println(String.format("-(%s) original: %s | final: %s", formataNumeros3Casas(i + 1), formataNumeros2Casas(notasInicial[i]), formataNumeros2Casas(notasFinal[i])));
            else
            System.out.println(String.format("*(%s) original: %s | final: %s", formataNumeros3Casas(i + 1), formataNumeros2Casas(notasInicial[i]), formataNumeros2Casas(notasFinal[i])));
        }  
    }
    
}