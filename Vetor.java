
import java.util.Scanner;

public class Vetor {

    public static int[] constroiVetor(int tamanhoVetor) {
        int[] vetor = new int[tamanhoVetor];
        Scanner sc1 = new Scanner(System.in);
        try {
            for (int i = 0; i < tamanhoVetor; i++) {
                int posicao = i + 1;
                System.out.println("Digite o valor da posição " + posicao + ": ");
                int numeroArmazenado = sc1.nextInt();
                vetor[i] = numeroArmazenado;
            }
        } catch (Exception e){
            System.out.println("Tamanho inválido do vetor!");
        }
        return vetor;
    }

    public static int[] ordenaVetor(int[] vetor) {
        int aux;
        boolean trocou = true;

        try {
            while (trocou) {
                trocou = false;
                for (int i = 0; i < vetor.length - 1; i++) {
                    if (vetor[i] > vetor[i + 1]) {
                        aux = vetor[i];
                        vetor[i] = vetor[i + 1];
                        vetor[i + 1] = aux;
                        trocou = true;
                    }
                }
            }
        } catch (Exception e){
            System.out.println("Número de elementos divergente do informado");
        }
        return vetor;
    }

    public static boolean validarTamanho(int tamanhoVetor) {
        return tamanhoVetor >= 0 && !(tamanhoVetor > 65.530);
    }

    public static boolean validarNumeroElementos(int tamanhoDesejado, int tamanhoVetor) {
        return tamanhoVetor == tamanhoDesejado;
    }

    public static boolean validarConteudo(String vetor) {
        return vetor.contains(",");
    }
}
