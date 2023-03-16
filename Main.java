


import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String Args[]) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int tamanhoVetor = sc1.nextInt();

        int[] vetor = Vetor.constroiVetor(tamanhoVetor);

        System.out.println(Arrays.toString(vetor));
        int[] vetorOrdenado = Vetor.ordenaVetor(vetor);
        String vetorOrdenadoString = Arrays.toString(vetorOrdenado);
        boolean validarConteudo = Vetor.validarConteudo(vetorOrdenadoString);
        if (!validarConteudo) System.out.println("Conteúdo inválido do arquivo");
        else System.out.println(vetorOrdenadoString);
    }


}
